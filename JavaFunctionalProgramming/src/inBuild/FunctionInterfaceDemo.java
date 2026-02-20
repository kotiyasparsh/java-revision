package inBuild;
//import java.lang.foreign.FunctionDescriptor;
import java.util.function.Function;
public class FunctionInterfaceDemo {
//addition
public static Function<Integer , Integer> addFunction =(a) -> a+3;

//subtraction
public static Function<Integer , Integer> subtractFunction =(a) -> a-5;

//combine
public static Function<Integer , Integer > combineFunction =
        addFunction.andThen(subtractFunction);
    public static void main(String[] args) {
//        System.out.println(addFunction.apply(12));
//        System.out.println(subtractFunction.apply(12));

        System.out.println(combineFunction.apply(10));
    }

}
