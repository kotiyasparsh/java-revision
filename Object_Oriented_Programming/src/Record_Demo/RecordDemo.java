package Record_Demo;
//it provide getter , constructor and other properties shortcut to create new object and intitalize without extra code
record Bike(String brand, int Speed) {
//    public String speed() {
//    }
}

public class RecordDemo {
    public static void main(String[] args) {
        Bike bike = new Bike("BMW", 220);
        System.out.println("brand: "+ bike.brand());
        System.out.println("speed: "+ bike.Speed());
        

        
        
    }

}
