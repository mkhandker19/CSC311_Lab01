package org.example;
public class Main {
    public static void main(String[] args) {
        Vehicle car1 = new Vehicle(4, "Blue", 4, "Gasoline"); // This instantiates a Vehicle object
        System.out.println("Vehicle 1 info:"); // Comment to keep organization
        car1.displayInfo(); // Displays the information about the Vehicle object
        System.out.println(); // Space between the two objects
        System.out.println("Vehicle 2 info:"); // Comment to keep organization
        Car car2 = new Car(3, "Red", 8, "Electric", "BMW"); // This instantiates a Car object
        car2.displayInfo(); // Displays the information about the Car object
        car2.honk(); // Calls honk method
    }
}

     class Vehicle {
       private int numberOfWheels;
       private String color;
       private float engineSize;
       private String fuelType;
// The 4 attributes

        public Vehicle(int numberOfWheels, String color, float engineSize, String fuelType) {
            this.numberOfWheels = numberOfWheels;
            this.color = color;
            this.engineSize = engineSize;
            this.fuelType = fuelType;
        }
        //Constructor
        public int getNumberOfWheels() {
            return numberOfWheels;
        }
        public void setNumberOfWheels(int numberOfWheels) {
            this.numberOfWheels = numberOfWheels;
        }
        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }
        public float getEngineSize() {
            return engineSize;
        }
        public void setEngineSize(float engineSize) {
            this.engineSize = engineSize;
        }
        public String getFuelType() {
            return fuelType;
        }
        public void setFuelType(String fuelType) {
            this.fuelType = fuelType;
        }
// Getter and Setters for the attributes
        public void displayInfo() {
            System.out.println("The number of wheels is " + numberOfWheels);
            System.out.println("The color is " + color);
            System.out.println("The engine size is " + engineSize);
            System.out.println("The fuel type is " + fuelType);
        }
    }
    // Displayinfo method created
    class Car extends Vehicle {
    private String brand;

    public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand) {
        super(numberOfWheels, color, engineSize, fuelType);
        this.brand = brand;
    }
    // super() calls on the attributes from vehicle
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
//Getter and Setter for Brand
    public void honk(){
        System.out.println("Honk, honk!");
   }
//Honk method creation
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Brand: " + brand);
        }

    }
