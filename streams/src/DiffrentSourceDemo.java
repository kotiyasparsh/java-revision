import java.beans.beancontext.BeanContextChild;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DiffrentSourceDemo {


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Stream<Integer> integerStream = numbers.stream();
        integerStream.forEach(System.out::println);

        int [] numberArray = {1,2,3,4,5};
        Stream<Integer> arrayStream = Arrays.stream(numberArray);
        arrayStream.forEach(System.out::println);


    }
}
