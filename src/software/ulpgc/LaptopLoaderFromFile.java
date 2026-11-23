package software.ulpgc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class LaptopLoaderFromFile implements LaptopLoader {
    public String path;
    public LaptopLoaderFromFile(String path) { this.path = path; }

    public InputStream retrieveStream() throws FileNotFoundException {
        File f = new File(path);
        return new FileInputStream(f);
    }
}
