package inBuild;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
public class ConsumerDemo {

    static Consumer <String> consumer1 =(Str) -> System.out.println(Str);

    static Consumer <String> consumer2 =(Str) -> System.out.println(Str);

    public static void main(String[] args) {
        consumer1.accept("hello");

        consumer2.accept("hi");

        List<Integer> number = Arrays.asList(1,2,3,4,5);
        Consumer<Integer> marks = n -> System.out.println(n*2);
        number.forEach(marks);
    }

}
