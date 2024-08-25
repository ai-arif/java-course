package Oops;

class Car {
    // Fields (attributes)
    private String brand;
    private String model;
    private int year;

    // Constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Methods
    public void startEngine() {
        System.out.println("The " + brand + " " + model + " is starting.");
    }

    // Getters and setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // ... other getters and setters ...
}

public class Oops {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 2015);
        myCar.startEngine();
    }
}

