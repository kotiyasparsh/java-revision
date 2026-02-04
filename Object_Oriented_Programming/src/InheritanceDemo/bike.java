package InheritanceDemo;

/**
 * bike extends Vehical to reuse brand/speed fields.
 * The 'hascarrier' field is inherited from Vehical and set here.
 */
public class bike extends Vehical{
    //    public Boolean hascarrier;


    public bike(String brand, int speed, Boolean hascarrier) {
        super(brand, speed);
        // sets inherited public Boolean hascarrier defined in Vehical
        this.hascarrier = hascarrier;
    }
}
