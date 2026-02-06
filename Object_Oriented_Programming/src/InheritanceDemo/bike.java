package InheritanceDemo;

/**
 * bike extends Vehicle to reuse brand/speed fields.
 * The 'hascarrier' field is inherited from Vehicle and set here.
 */
public class bike extends Vehicle {
    //    public Boolean hascarrier;


    public bike(String brand, int speed, Boolean hascarrier) {
        super(brand, speed);
        // sets inherited public Boolean hascarrier defined in Vehicle
        this.hascarrier = hascarrier;
    }
}
