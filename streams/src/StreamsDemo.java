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
        Stream <String> stream = items.stream();
        stream.forEach(System.out::println);

        /*
        Stream<String> streamnew = items.stream();
       Stream<String>filteredStream
               = streamnew.filter(name -> name.startsWith("b"));
        filteredStream.forEach(System.out::println);
        */
//more persion of stream

        items.stream()
                .filter(name -> name.startsWith("b"))
                .forEach(System.out::println);

/*  USE CASE:
*   1.Filtering
*   2.Mapping
*   3.Aggregation
*   4.Seraching
*   5.Iteration
*
* */
    }

}
