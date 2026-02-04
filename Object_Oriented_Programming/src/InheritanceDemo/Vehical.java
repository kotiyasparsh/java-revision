package InheritanceDemo;

public class Vehical {
    private String brand;
    private int speed;
    public Boolean hascarrier;



//    constructor
    public Vehical(String brand, int speed){
        this.speed=speed;
        this.brand=brand;
    }



//################Geter_Setter######################
    public String getBrand() { return brand;
    }

    public int getSpeed() { return speed;
    }

    public void setSpeed(int speed) { this.speed = speed;
    }

    public void setBrand(String brand) { this.brand = brand;
    }

    public void display(){
        System.out.println("brand "+ brand+"speed "+speed);
    }
    public void displaybike(){
        System.out.println("bike has "+hascarrier);
    }
}
