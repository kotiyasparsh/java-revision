package PlolymorphismDemo;

public class plymorphismDemo {

    public static void main(String[] args) {
        // create a car instance (uses Vehical constructor). doors default to 0.
        car c1 = new car("toyota",200);
        c1.display(); // calls overridden display() in car

        // create a bike instance and set its inherited hascarrier flag
        bike b1 = new bike("honda", 220);
        b1.displaybike(); // uses helper in Vehical to show carrier info
        b1.display();     // calls Vehical.display() since bike doesn't override it

// ###############Polymorphism#################

        c1.start();
        b1.start();

/* using the refrence of vehicle class and passing the boject of vehicle class*/

        vehicle v1 = new vehicle("BYD", 350);
        v1.start();


    /*using refrence of vehicle class but passing the object ok bike class
    * so the bike constructor will call*/

/* mehtod overriding (Rumtime Polymorphism) :- same name method having diffrent signature*/
        vehicle v2 = new bike("yamaha", 350);
        v2.start();
/*METHOD OVER LOADING*/
        b1.start("honda");








    }
}
