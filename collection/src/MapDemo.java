import java.util.Map;
import java.util.HashMap;



public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> userMap = new HashMap<>();

         userMap.put(1,"Alice");
         userMap.put(2,"Bob");
         userMap.put(3,"Charlie");

        System.out.println(" #### ALL USERMAP #### ");
        for (Map.Entry<Integer, String> entry : userMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }





    }
}
