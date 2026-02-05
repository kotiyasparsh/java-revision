package PlolymorphismDemo;

/**
 * bike extends Vehical to reuse brand/speed fields.
 * The 'hascarrier' field is inherited from Vehical and set here.
 */
public class bike extends vehicle {
    //    public Boolean hascarrier;


    public bike(String brand, int speed, Boolean hascarrier) {
        super(brand, speed);
        // sets inherited public Boolean hascarrier defined in Vehical
        this.hascarrier = hascarrier;
    }
    public bike(String brand, int speed) {
        super(brand, speed);
        // sets inherited public Boolean hascarrier defined in Vehical
//        this.hascarrier = hascarrier;
    }


@Override
    public void start() {
        System.out.println("Starting Bike... ");
    }
/* Method Over Loading :-  */
    public void start(String Bname) {
        System.out.println("Starting Bike... "+ Bname);
    }
}
