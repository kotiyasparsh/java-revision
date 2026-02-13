import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;


public class iteratingDemo {
    public static void main(String[] args) {
        List<String> user = new ArrayList<>();
        user.add("sparsh");
        user.add("ravi");
        user.add("charli");
        user.add("ramona");
        user.add("rasul");
        user.add("crise");

//        String s = user.get(0);
//        System.out.println(user.get(4));


//        for loop
        for(int i=0; i<user.size(); i++){
            System.out.println(user.get(i));
        }

//        iterator

        System.out.println("using iterator");
        Iterator<String> it = user.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
