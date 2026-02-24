package inBuild;
import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionDemo {

    public static BiFunction<Integer, Integer, Integer> addFunction
            = (a,b) -> a+b;

    public static BiFunction<Integer, Integer, Integer> subtractFunction
            = (a, b) -> a-b;

    public static void main(String[] args) {
        System.out.println("BiFunctionDemo");
        System.out.println(addFunction.apply(10,20));
        System.out.println(subtractFunction.apply(99,33));

//        Function<Integer, Integer> multiplyny2 = x -> x*2;
//        BiFunction<Integer, Integer, Integer> combinedFuction =
//                addFunction.addThen(multiplyny2);

    }


}
