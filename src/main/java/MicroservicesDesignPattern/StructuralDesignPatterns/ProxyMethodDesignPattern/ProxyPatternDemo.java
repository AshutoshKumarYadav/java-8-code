package MicroservicesDesignPattern.StructuralDesignPatterns.ProxyMethodDesignPattern;

public class ProxyPatternDemo {

    public static void main(String[] args) {
        // Using Proxy Image to control access to the real image
        Image image = new ProxyImage("test_image.jpg");
        // Image is not loaded until display() is called
        System.out.println("First call to display():");
        image.display(); // Loads and displays the image
        System.out.println("\nSecond call to display():");
        image.display(); // Uses cached image, no loading
    }

}

class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk(); // Expensive operation
    }

    private void loadFromDisk() {
        System.out.println("Loading image from disk: " + filename);
    }

    public void display() {
        System.out.println("Displaying: " + filename);
    }

}

// Step 3: Create the Proxy Class
// The proxy delays object creation until display() is called.
class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    // Corrected constructor parameter to match the field name
    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        if (realImage == null) { // Lazy initialization
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}


