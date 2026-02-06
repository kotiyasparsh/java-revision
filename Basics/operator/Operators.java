public class Operators {
    public static void main(String[] arg){
        int a,b;
        a = 15;
        b = 4;
         
        int add = a+b;
        int subtract = a-b;
        int multipication = a*b;
        float division = (float)a/b;
        int remainder = a%b;
        boolean greater = a>b;
        boolean positive = (a > 0) && (b > 0);

        System.out.println("Addition: "+add);
        System.out.println("Subtraction: "+subtract);
        System.out.println("Multiplication: "+multipication);
        System.out.println("Division: "+division);
        System.out.println("Remainder: "+remainder);
        System.out.println("Greater: "+greater);
        System.out.println("Positive: "+positive);
    }
}
