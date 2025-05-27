import org.checkerframework.checker.units.qual.K;

import java.util.HashMap;
import java.util.Map;

class Scratch {
    public static void main(String[] args) {
       // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        System.out.println("Value for key 'Two': " + map.get("Two"));
        System.out.println("Contains key 'Three': " + map.containsKey("Three"));
        System.out.println("Contains value 2: " + map.containsValue(2));
        System.out.println("Size of map: " + map.size());
        map.remove("One");
        System.out.println("After removing key 'One': " + map);

        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
        map.replace("Three", 10);
        map.put("Two",20);
        System.out.println("After replacing key 'Three' with value 10: " );
        map.putIfAbsent("five", 5);

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        HashMap<String, Integer> clonedMap = (HashMap<String, Integer>) map.clone();


    }
}