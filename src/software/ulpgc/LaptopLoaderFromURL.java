package software.ulpgc;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;

public class LaptopLoaderFromURL implements LaptopLoader {
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

