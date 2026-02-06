package InterfaceDemo;

public class interfaceDemo {
    public static void main(String[] args) {
        ElectricCar e1 =  new ElectricCar();
        e1.turnRight();
        e1.turnLeft();

        carControls myCar1 = new ElectricCar();
        myCar1.accelerate();

        carControls myCar2 = new sportsCar();
        myCar2.accelerate();

    }
}
