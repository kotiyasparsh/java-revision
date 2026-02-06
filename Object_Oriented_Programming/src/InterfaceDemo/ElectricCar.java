package InterfaceDemo;

public class ElectricCar implements carControls {


    @Override
    public void turnRight() {
        System.out.println("Electric Right... ");
    }

    @Override
    public void turnLeft() {
        System.out.println("Electric left... ");
    }

    @Override
    public void applybreak() {
        System.out.println("Electric break... ");
    }

    @Override
    public void accelerate() {
        System.out.println("Electric acclerate... ");
    }
}
