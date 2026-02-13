import java.util.ArrayList;
import java.util.List;

class Car{
    String brand;

//    constructor
    Car(String brand){
        this.brand = brand;
    }
}






//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ListDemo {
    public static void main(String[] args) {
        List <String>users = new ArrayList<>();
        users.add("Alice");
        users.add("Bob");
        users.add("Charlie");

        System.out.println("all users");

        for(Object user : users){
            System.out.println(user);
        }

        System.out.println("Element using index: "+users.get(0));
//List of object
        Car car1= new Car("MG Hector");
        Car car2 = new Car("BMW");
        Car car3 = new Car("oddy");

//        using Car class as a genric<> for type safty
        List<Car> carList = new ArrayList<>();

/*        adding car type data because we create a class and use generic <Car>
        Car class so it only accept the object of Car class */
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);


        System.out.println(" == All Car == ");

//        advance for loop
        for (Car car : carList){
            System.out.println(car.brand);
        }

    }

}