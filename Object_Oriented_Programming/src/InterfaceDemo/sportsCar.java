package InterfaceDemo;

public class sportsCar implements carControls {
    @Override
    public void turnRight() {
        System.out.println("sports right... ");
    }

    @Override
    public void turnLeft() {
        System.out.println("sports left... ");
    }

    @Override
    public void applybreak() {
        System.out.println("sports break... ");
    }

    @Override
    public void accelerate() {
        System.out.println("sports accelerate... ");
    }
}
