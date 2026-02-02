public class ConstructDemo {
    public static void main(String[] args) {
//    Create a car object representing a vehicle and set its fields and calling method
        car car1 = new car("kia","grey",150);
//        car1.speed = 100;
//        car1.brand = "toyota";
//        car1.color = "red";
        car1.drive();
//    create another car object and use here to store information of
//        driver and calling method
        car driver1 = new car("saprsh",24,"yes");
//        driver1.name ="sparsh";
//        driver1.age =24;
//        driver1.owner = "yes";
        driver1.driving();

        System.out.println("3. accesing speed by getter :- "+car1.getSpeed());
        car1.setSpeed(1000);
        System.out.println(car1.getSpeed());
    }
}
