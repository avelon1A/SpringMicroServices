import java.util.Vector;

class Scratch {
    public static void main(String[] args) {
        //vector examples
        Vector<String> vector = new Vector<>();
        vector.add("A");
        vector.add("B");
        vector.add("C");
        vector.add("D");
        vector.add("E");

        System.out.println("Vector: " + vector);
        System.out.println("Size: " + vector.size());
        System.out.println("Capacity: " + vector.capacity());
        System.out.println("Element at index 2: " + vector.get(2));
        System.out.println("Is vector empty? " + vector.isEmpty());
        System.out.println("Index of element 'C': " + vector.indexOf("C"));
        System.out.println("Last index of element 'C': " + vector.lastIndexOf("C"));
        System.out.println("Sublist from index 1 to 3: " + vector.subList(1, 4));
        System.out.println("Contains 'B'? " + vector.contains("B"));
        System.out.println("Contains 'Z'? " + vector.contains("Z"));
        System.out.println("First element: " + vector.firstElement());
        System.out.println("Last element: " + vector.lastElement());
        System.out.println("Removing element at index 2: " + vector.remove(2));
        System.out.println("Vector after removal: " + vector);
        System.out.println("Clearing vector...");
        vector.clear();
        System.out.println("Vector after clearing: " + vector);
        System.out.println("Is vector empty? " + vector.isEmpty());
        System.out.println("Size: " + vector.size());
        System.out.println("Capacity: " + vector.capacity());
        
    }
}