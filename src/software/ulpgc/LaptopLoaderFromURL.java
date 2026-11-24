package software.ulpgc;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.MalformedInputException;

public class LaptopLoaderFromURL implements LaptopLoader {
    public String url;
    public LaptopLoaderFromURL(String url) {
        this.url = url;
    }

    public InputStream retrieveStream() throws URISyntaxException, IOException {
            URI url = new URI(this.url);
            return url.toURL().openStream();
    }
}

