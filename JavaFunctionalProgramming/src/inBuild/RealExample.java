package inBuild;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class RealExample {

    public static void main(String[] args) {
        BiFunction<String, Integer, String> formatter = (title, price) ->
                title +" coast: $ "+price;

        System.out.println(formatter.apply("java",399));
        System.out.println(formatter.apply("C++",399));
        System.out.println(formatter.apply("python",599));
        System.out.println(formatter.apply("Swift",999));


        Predicate<Integer> isExpensive = price -> price > 500;
        System.out.println(isExpensive.test(999));

    }

}
