import software.ulpgc.Laptop;
import software.ulpgc.LaptopLoader;
import software.ulpgc.LaptopLoaderFromFile;
import software.ulpgc.LaptopLoaderFromURL;

public class Main {
    void main() {
        LaptopLoaderFromFile fileLoader = new LaptopLoaderFromFile("laptops.csv");
        LaptopLoaderFromURL urlLoader = new LaptopLoaderFromURL("");
        System.out.println(fileLoader.getManufacturer(0));
        fileLoader.exportData("./test.txt");
    }
}
