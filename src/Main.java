import software.ulpgc.LaptopLoaderFromFile;
import software.ulpgc.LaptopLoaderFromURL;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;

public class Main {
    void main() throws URISyntaxException, IOException {
        String url = "https://raw.githubusercontent.com/daraGotGitted/kata2/refs/heads/developer/laptops.csv";
        LaptopLoaderFromFile fileLoader = new LaptopLoaderFromFile("laptops.csv");
        LaptopLoaderFromURL urlLoader = new LaptopLoaderFromURL(url);

        System.out.printf("[From file] Laptop 0: %s, %s, %,2f%n",
                fileLoader.getManufacturer(0),
                fileLoader.getModel(0),
                fileLoader.getPrice(0));

        System.out.printf("[From URL] Laptop 0: %s, %s, %,2f%n",
                urlLoader.getManufacturer(0),
                urlLoader.getModel(0),
                urlLoader.getPrice(0));

        fileLoader.exportData("./file_test.txt");
        urlLoader.exportData("./url_test.txt");

        //System.out.println(fileLoader.rawData());
    }
}
