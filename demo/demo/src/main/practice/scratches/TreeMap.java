import java.sql.SQLOutput;
import java.util.*;

class Scratch {
    public static void main(String[] args) {
        //TreeMap
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(1,"One");
        treeMap.put(2,"Two");
        treeMap.put(3,"Three");
        treeMap.put(4,"Four");

        System.out.println(treeMap.get(1));
        System.out.println(treeMap);
        System.out.println("Tree after removing 4");
        treeMap.remove(4);
        System.out.println(treeMap);
        System.out.println("Tree contains key 3? :"+ treeMap.containsKey(3));

        System.out.println("Tree contains value three ? :"+ treeMap.containsKey(3));

        System.out.println("Tree size = "+ treeMap.size());
        System.out.println("Tree lowest key = "+ treeMap.firstKey());
        System.out.println("Tree last key = "+ treeMap.lastKey());
        Set<Integer> keys = treeMap.keySet();

        System.out.println(keys);

        Collection<String> values = treeMap.values();
        System.out.println(values);
        Set<Map.Entry<Integer, String>> entries = treeMap.entrySet();
        System.out.println(entries);

        Iterator<Map.Entry<Integer, String>> iterator = entries.iterator();
        if (iterator.hasNext()) {
            Map.Entry<Integer, String> firstEntry = iterator.next();
            System.out.println("First entry: " + firstEntry.getKey() + " = " + firstEntry.getValue());
        }
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println("First entry: " + entry.getKey() + " = " + entry.getValue());
            break;
        }

        Map.Entry<Integer, String> firstEntry = treeMap.firstEntry();
        System.out.println("First entry: " + firstEntry.getKey() + " = " + firstEntry.getValue());

    }
}