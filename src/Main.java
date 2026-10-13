import software.ulpgc.LaptopLoaderFromFile;
import software.ulpgc.LaptopLoaderFromURL;

public class Main {
    void main() {
        String url = "https://raw.githubusercontent.com/daraGotGitted/kata2/refs/heads/developer/laptops.csv";
        LaptopLoaderFromFile fileLoader = new LaptopLoaderFromFile("laptops.csv");
        LaptopLoaderFromURL urlLoader = new LaptopLoaderFromURL(url);

        System.out.println(String.format("[From file] Laptop 0: %s, %s, %,2f",
                fileLoader.getManufacturer(0),
                fileLoader.getModel(0),
                fileLoader.getPrice(0)));

        System.out.println(String.format("[From URL] Laptop 0: %s, %s, %,2f",
                urlLoader.getManufacturer(0),
                urlLoader.getModel(0),
                urlLoader.getPrice(0)));

        fileLoader.exportData("./file_test.txt");
        urlLoader.exportData("./url_test.txt");
    }
}
