import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple","banana","orange");

//        Enhance For loop
        for(String fruit : items)
            System.out.println(fruit);


//      Using  Stream
        Stream<String> stream = items.stream();
        stream.forEach(System.out::println);

        Stream<String> streamnew = items.stream();
       Stream<String>filteredStream = stream.filter(name -> name.startsWith("b"));
        stream.forEach(System.out::println);


    }

}
