import java.io.File;
import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class car {
//properties of class
        String brand;
        String color;
        int speed;


//properties of driver
        String name;
        int age;
        String owner;


//method defining to print car brand and speed
        public void drive(){
            System.out.println(color+" color "+brand + " is drive at "+ speed);
        }


//method defining to print driver info including name and ownership
        public void driving(){
                System.out.println(name + " is driving car and owner:- "+owner);
        }


//   Constructor

//        calling a constructor using parameter but not standard way

//        public car(String b, String c, int s){
//                System.out.println("Constructor called \\t");
//                brand = b;
//                color = c;
//                speed = s;
//        }

//        using a constructor by standard way using "this." keyword

        public car(String brand, String color, int speed){
                System.out.println("##############Constructor called############");
                this.brand = brand;
                this.color = color;
                this.speed = speed;
        }
// calling constructor for driver object of car class
        public car(String name,int age, String owner){
                System.out.println("##############Constructor called############");
                this.name = name;
                this.age = age;
                this.owner = owner;
        }
//############# getter || setter #####################
// is used to get (retrive) value
        public int getSpeed() {
                return speed;
        }
//is used to set value
        public void setSpeed(int speed) {
                this.speed = speed;
        }
}