import java.util.LinkedHashMap;

class Scratch {
    public static void main(String[] args) {
        //LinkedHashMap
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "one");
        linkedHashMap.put(2, "two");
        linkedHashMap.put(3, "three");
        linkedHashMap.put(4, "four");
        linkedHashMap.put(5, "five");
        linkedHashMap.put(6, "six");
        linkedHashMap.put(7, "seven");
        linkedHashMap.put(8, "eight");

        System.out.println("LinkedHashMap: " + linkedHashMap);
        System.out.println("Value for key 3: " + linkedHashMap.get(3));
        System.out.println("Contains key 5: " + linkedHashMap.containsKey(5));
        System.out.println("Contains value 'six': " + linkedHashMap.containsValue("six"));
        System.out.println("Size of LinkedHashMap: " + linkedHashMap.size());
        linkedHashMap.remove(4);
        System.out.println("After removing key 4: " + linkedHashMap);
        linkedHashMap.clear();
        System.out.println("After clearing LinkedHashMap: " + linkedHashMap);
        System.out.println("Is LinkedHashMap empty? " + linkedHashMap.isEmpty());
        linkedHashMap.put(1, "one");
        linkedHashMap.put(2, "two");

        System.out.println("After re-adding elements: " + linkedHashMap);

        linkedHashMap.put(3, "three");

        System.out.println("After re-adding key 3: " + linkedHashMap);
        System.out.println("Value for key 2: " + linkedHashMap.get(2));

        System.out.println("Iterating through LinkedHashMap:");
        for (Integer key : linkedHashMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + linkedHashMap.get(key));
        }

        System.out.println("Iterating through values:");
        for (String value : linkedHashMap.values()) {
            System.out.println("Value: " + value);
        }
        System.out.println("Iterating through entries:");
        for (var entry : linkedHashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        System.out.println("LinkedHashMap size: " + linkedHashMap.size());
        System.out.println("LinkedHashMap is empty: " + linkedHashMap.isEmpty());
        System.out.println("LinkedHashMap contains key 1: " + linkedHashMap.containsKey(1));
        System.out.println("LinkedHashMap contains value 'one': " + linkedHashMap.containsValue("one"));
        System.out.println("LinkedHashMap contains key 10: " + linkedHashMap.containsKey(10));
        System.out.println("LinkedHashMap contains value 'ten': " + linkedHashMap.containsValue("ten"));
        System.out.println("LinkedHashMap is empty: " + linkedHashMap.isEmpty());

    }
}