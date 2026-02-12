import java.util.ArrayList;
import java.util.List;

class Car{
    String brand;
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

        Car car1= new Car("MG Hector");
        Car car2 = new Car("BMW");

        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);


        System.out.println(" == All Car == ");
        for (Car car : carList){
            System.out.println(car.brand);
        }

    }

}