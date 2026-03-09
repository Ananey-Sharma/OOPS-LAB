// Define the base class Vehicle
class Vehicle {

    // Method drive() defined in the parent class
    void drive() {
        System.out.println("Driving a vehicle");
    }
}

// Define a subclass Car that extends Vehicle
class Car extends Vehicle {

    // Override the drive() method of Vehicle class
    @Override   // Annotation to indicate method overriding
    void drive() {
        System.out.println("Repairing a car");   // Custom behavior for Car
    }
}

// Main class to run the program
public class VehicleMain {

    public static void main(String[] args) {

        // Create an object of Car class
        Car c = new Car();

        // Call the drive() method
        c.drive();
    }
}