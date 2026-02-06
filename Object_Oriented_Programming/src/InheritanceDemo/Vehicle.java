package InheritanceDemo;

public class Vehicle {
    private String brand;
    private int speed;
    public Boolean hascarrier;



    //    constructor
    public Vehicle(String brand, int speed){
        this.speed=speed;
        this.brand=brand;
    }



    //################ Getters / Setters ######################
    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Generic display method for vehicles
    public void display() {
        System.out.println("brand " + brand + " speed " + speed);
    }

    // Helper to show bike carrier info (used by bike instances)
    public void displaybike() {
        System.out.println("bike has " + hascarrier);
    }
}
