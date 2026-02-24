package inBuild;

import java.sql.SQLOutput;
import java.util.function.Predicate;

public class perdicateDemo {

    public static void main(String[] args) {
        Predicate<Integer> isEven= n -> n % 2 == 0;
        System.out.println(isEven.test(10));
    }

}
