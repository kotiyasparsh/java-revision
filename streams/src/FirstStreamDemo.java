import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FirstStreamDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
// Iteration 1
        List<Integer> evenNumbers1 = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 == 0)
                evenNumbers1.add(num);
        }
        System.out.println("Even Number without Stream: " + evenNumbers1);

//Iteration 2

        Stream<Integer> integerStream1 = numbers.stream();
        Stream<Integer> integerStream2 = integerStream1.filter(p1);
//        Stream <Integer> evenNumbers2 = integerStream2.toList();
        List<Integer> evenNumbers2 = integerStream2.toList();
        System.out.println("Even Number with Stream: " + evenNumbers2);
    }

        static Predicate <Integer> p1 = new Predicate<Integer>(){
            @Override
            public boolean test(Integer integer) {
                int remainder = integer % 2;
                if( remainder == 0 ){
                    return true;
                }
                return false;
            }
        };

//      Predicate<Integer> isEven = n -> n % 2 == 0;
        static Predicate <Integer> p2 = ( integer) ->  integer % 2 ==0;


    };







