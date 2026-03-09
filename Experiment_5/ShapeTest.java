// Define the base class Shape
class Shape {

    // Method to get area - general version
    double getArea() {
        // Default implementation
        System.out.println("Getting area of shape...");
        return 0;   // Default area
    }
}

// Define the subclass Rectangle that extends Shape
class Rectangle extends Shape {

    // Attributes specific to rectangle
    double length;
    double width;

    // Constructor to initialize length and width
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override the getArea() method
    @Override
    double getArea() {
        return length * width;
    }
}

// Main class to test the program
public class ShapeTest {

    public static void main(String[] args) {

        // Create object of Rectangle
        Rectangle rect = new Rectangle(10, 5);

        // Call getArea method
        double area = rect.getArea();

        System.out.println("Area of Rectangle: " + area);
    }
}