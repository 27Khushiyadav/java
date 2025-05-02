/* QUESTION 3 :- A vehicle manufacturing company produces different types of vehicles, such as cars and motorcycles.
 The base class Vehicle contains common properties like brand, model, and price. The class Car extends Vehicle by adding attributes 
 like seatingCapacity and fuelType. Further, a subclass ElectricCar extends Car, introducing additional attributes like batteryCapacity 
 and chargingTime. The Motorcycle class extends Vehicle and adds engineCapacity and type (e.g., "Sport", "Cruiser"). Implement this vehicle
  hierarchy system using multilevel inheritance in Java. Use constructor chaining to initialize attributes efficiently and demonstrate 
  polymorphism by overriding a method displayDetails() in each subclass.*/
// Base class
class Vehicle {
    String brand, model;
    double price;

    // Constructor
    Vehicle(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display details (overridden in subclasses)
    void displayDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: $" + price);
    }
}

// Subclass: Car (Extends Vehicle)
class Car extends Vehicle {
    int seatingCapacity;
    String fuelType;

    // Constructor (uses super to call Vehicle constructor)
    Car(String brand, String model, double price, int seatingCapacity, String fuelType) {
        super(brand, model, price); // Calling superclass constructor
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
    }

    // Overriding displayDetails()
    @Override
    void displayDetails() {
        super.displayDetails(); // Call parent method
        System.out.println("Seating Capacity: " + seatingCapacity + ", Fuel Type: " + fuelType);
    }
}

// Subclass: ElectricCar (Extends Car)
class ElectricCar extends Car {
    int batteryCapacity;
    double chargingTime;

    // Constructor (calls Car constructor)
    ElectricCar(String brand, String model, double price, int seatingCapacity, String fuelType, int batteryCapacity, double chargingTime) {
        super(brand, model, price, seatingCapacity, fuelType);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

    // Overriding displayDetails()
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh, Charging Time: " + chargingTime + " hours");
    }
}

// Subclass: Motorcycle (Extends Vehicle)
class Motorcycle extends Vehicle {
    int engineCapacity;
    String type; // Sport, Cruiser, etc.

    // Constructor
    Motorcycle(String brand, String model, double price, int engineCapacity, String type) {
        super(brand, model, price);
        this.engineCapacity = engineCapacity;
        this.type = type;
    }

    // Overriding displayDetails()
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Engine Capacity: " + engineCapacity + "cc, Type: " + type);
    }
}

// Main class
public class VehicleManagement {
    public static void main(String[] args) {
        // Creating objects of different types
        Car car = new Car("Toyota", "Camry", 30000, 5, "Petrol");
        ElectricCar eCar = new ElectricCar("Tesla", "Model S", 75000, 5, "Electric", 100, 1.5);
        Motorcycle bike = new Motorcycle("Yamaha", "YZF-R1", 20000, 998, "Sport");

        // Demonstrating polymorphism
        Vehicle[] vehicles = { car, eCar, bike };

        for (Vehicle v : vehicles) {
            v.displayDetails();
            System.out.println("----------------------");
        }
    }
}

