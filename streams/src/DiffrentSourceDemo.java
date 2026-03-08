import java.beans.beancontext.BeanContextChild;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DiffrentSourceDemo {


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Stream<Integer> integerStream = numbers.stream();
        integerStream.forEach(System.out::println);

        int [] numberArray = {1,2,3,4,5};
        IntStream arrayStream = Arrays.stream(numberArray);
        arrayStream.forEach(System.out::println);

        Stream <String> stringStream = Stream.of("s","p","a","r","s","h");
        Stream<Integer> integerStream1 = Stream.iterate(0, n -> n+2);
        integerStream1.forEach(System.out::println);



    }
}
