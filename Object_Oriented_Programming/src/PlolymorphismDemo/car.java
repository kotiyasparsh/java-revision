package PlolymorphismDemo;

/**
 * Represents a car with a brand, speed, and number of doors.
 * Inherits common vehicle properties from the Vehical class.
 */
public class car extends vehicle {

    // number of doors for this car; default 0 if not set
    private int doors;

    /**
     * Constructs a car with the specified brand and speed.
     *
     * @param brand the brand of the car
     * @param speed the speed of the car
     */
    public car(String brand, int speed){
        super(brand,speed);
    }

    /**
     * Constructs a car with the specified brand, speed, and number of doors.
     *
     * @param brand the brand of the car
     * @param speed the speed of the car
     * @param doors the number of doors on the car
     */
    public car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }


    @Override

    /*Method overriding :- same name method having diffrent signature*/
    public void start() {
        System.out.println("Starting Car... ");
    }

    // getter for doors
    public int getDoors() {
        return doors;
    }

    // setter for doors
    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override  /*annotation for overriding display from parent*/
    public void display(){
        // display vehicle info (brand and speed) and car-specific data (doors)
        System.out.println("brand: "+ getBrand()+" speed: "+getSpeed()+"km/hr "+doors+" doors");
    }
}
