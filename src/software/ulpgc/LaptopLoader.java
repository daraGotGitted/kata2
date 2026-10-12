package software.ulpgc;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

interface LaptopLoader {
    InputStream retrieveStream();

    default List<Laptop> loadLaptops() {
        InputStream is = retrieveStream();
        try (Reader reader = new InputStreamReader(is)) {
            return reader.readAllLines().stream().skip(1).map((s) -> {
                String[] ss = s.split(",");
                return new Laptop(
                        ss[0],
                        ss[1],
                        Float.parseFloat(ss[2])
                );
            }).toList();
        } catch(IOException e) {
            System.err.println("Couldn't get reader");
            return null;
        }
    }

    default Laptop getLaptop(int id) {
        return loadLaptops().get(id);
    }
}

class LaptopLoaderFromURL implements LaptopLoader {
    public String url;
    public LaptopLoaderFromURL(String url) {
        this.url = url;
    }

    public InputStream retrieveStream() {
        try {
            URI url = new URI(this.url);
            try {
                return url.toURL().openStream();
            } catch (IOException e) {
                System.err.println("Couldn't retrieve stream");
            }
        } catch (URISyntaxException e) {
            System.err.println("Couldn't retrieve stream due to URL error");
        }
        return null;
    }
}

class LaptopLoaderFromFile implements LaptopLoader  {
    public String path;
    public LaptopLoaderFromFile(String path) { this.path = path; }

    public InputStream retrieveStream() {
        File f = new File(path);
        try { return new FileInputStream(f); } catch(FileNotFoundException e) { System.err.println("Couldn't find file: " + this.path); }
        return null;
    }

}

