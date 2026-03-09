import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TermialOperationDemo {

    public static void main(String[] args) {

//        ############REDUCE#############
//        TermialOperationDemo

        System.out.println("############REDUCE#############");
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(11, 23, 45, 6, 77, 18);

        // Terminal operation: reduce() - sums all numbers
        Stream<Integer> integerStream = numbers.stream();
        int sum = integerStream.reduce(0, (acc, num) -> acc + num);
        System.out.println("SUM: " + sum);


        int total = numbers.stream()
                .reduce(0,Integer::sum);
            System.out.println("TOTAL: "+ total);


//        ############COLLECT############

        System.out.println("############COLLECT#############");

          List<Integer> evenNumber = numbers.stream()
                  .filter(n -> n % 2 ==0)
                  .collect(Collectors.toList());
            System.out.println("EVEN NUMBERS: "+ evenNumber);


//        ##########FIND & MATCH############

        System.out.println("############FIND & MATCH#############");

            System.out.println(numbers.stream().findFirst().get());
            System.out.println(numbers.stream().findAny().get());


        boolean has40 = numbers.stream()
                .anyMatch(n -> n == 40);
                System.out.println(has40);

//      ############ITERATION##############

        System.out.println("############ITERATION#############");

        numbers.stream()
                .forEach(System.out::println);







    }




}
