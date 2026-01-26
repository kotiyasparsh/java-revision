public class OverloadingMethod {
    // public static void Greeting(String name ){
    //     System.out.println("hello my name is " + name);
    // }   

    // public static void Greeting(String name, int age){
    //     System.out.print("my name is " +name+ " and my age is " + age);
    // }

    // public static void main(String[] args) {
    //     Greeting("sparsh");

    //     Greeting("sparsh",20);
    // }


    public static int calculate(int a, int b){
        return a+b;
    }
    public static double calcuate(double a, double b){
        return a+b;
    }

    public static String calculate(int a){
        return "Hello "+a;
    }

    public static void main(String[] args){
        System.out.println("addtion "+calculate(2,3));
        System.out.print("Multipication "+calculate(5,5));
        System.out.print(calculate(0));
    }

}




