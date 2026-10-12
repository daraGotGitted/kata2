import software.ulpgc.LaptopLoaderFromFile;
import software.ulpgc.LaptopLoaderFromURL;

public class Main {
    void main() {
        LaptopLoaderFromURL ll = new LaptopLoaderFromURL("https://raw.githubusercontent.com/daraGotGitted/csv/refs/heads/main/laptops.csv");
        System.out.println(ll.getLaptop(0).manufacturer);

        LaptopLoaderFromFile ll2 = new LaptopLoaderFromFile("/home/dara/Documentos/universidad/3ro/is2/laptops.csv");
        System.out.println(ll2.getLaptop(0).manufacturer);
    }
}
