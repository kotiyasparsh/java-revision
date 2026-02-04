package InheritanceDemo;

public class InheritanceDemo {

    public static void main(String[] args) {
        // create a car instance (uses Vehical constructor). doors default to 0.
        car c1 = new car("toyota",200);
        c1.display(); // calls overridden display() in car

        // create a bike instance and set its inherited hascarrier flag
        bike b1 = new bike("honda", 220, true);
        b1.displaybike(); // uses helper in Vehical to show carrier info
        b1.display();     // calls Vehical.display() since bike doesn't override it
    }
}
