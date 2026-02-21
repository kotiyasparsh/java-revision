package inBuild;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodRefrencesDemo {
    public static void main(String[] args) {
//        ::   <- using this syntax

        List<String> names = Arrays.asList("oggy","jack","bob");
//using for loop
        for(int i=0; i <names.size(); i++){
            System.out.println(names.get(i));
        }
//enhanced for loop
        for(String name: names){
            System.out.println(name);
        }

//        STEP 1
//        names.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String names) {
//                System.out.println(names   );
//            }
//        });

//        STEP 2
//        names.forEach((String name)  -> {
//                System.out.println(name   );
//        });


//        STEP 3
//        names.forEach((String name)  -> System.out.println(name));

//        STEP 4 (final representation of MethodReference)
          names.forEach(System.out::println);

    }


}
