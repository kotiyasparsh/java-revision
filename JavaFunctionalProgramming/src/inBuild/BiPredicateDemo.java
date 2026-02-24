package inBuild;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> sumIsEven = (a, b) -> (a + b) % 2 == 0;
        System.out.println("3 + 4 is even? " + sumIsEven.test(3, 4)); // false
        System.out.println("2 + 6 is even? " + sumIsEven.test(2, 6)); // true
    }
}
