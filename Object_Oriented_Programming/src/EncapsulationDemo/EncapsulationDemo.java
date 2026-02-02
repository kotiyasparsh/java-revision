package EncapsulationDemo;


class car {
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
// defining getter
    public int getSpeed() {
        return speed;
    }
//    defining setter
    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
public class EncapsulationDemo {
    public static void main(String[] args) {
        car car1 = new car("kia","grey",150);
        car1.speed = 500;
        car1.drive();
    }


}
