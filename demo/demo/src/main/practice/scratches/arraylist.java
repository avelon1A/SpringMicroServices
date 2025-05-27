import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Scratch {
    public static void main(String[] args) {
        // java arraylist basic
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        list.remove(0);
        list.remove(Integer.valueOf(2));
        Integer value = list.get(0);
        System.out.println("first value: " + value);
        System.out.println("list size: " + list.size());
        System.out.println("isEmpty :" + list.isEmpty());

        list.forEach(System.out::println);

        Iterator<Integer> iterable = list.iterator();
        System.out.println("iterating through the list");
        while ( iterable.hasNext()) {
            Integer element = iterable.next();
            System.out.println(element);
        }
        list.clear();
        System.out.println("list size after clear: " + list.size());
        


    }
}