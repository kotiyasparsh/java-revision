package inBuild;

import java.util.function.BiConsumer;

public class BiConsumerDemo {

    public static void main(String[] args) {
        BiConsumer<Integer, Integer> biConsumer1 = (a,b) ->
                System.out.println("Addition: "+(a+b));

        biConsumer1.accept(38,50);
    }

}
