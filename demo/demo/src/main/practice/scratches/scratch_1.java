import java.util.Arrays;
import java.util.LinkedList;

class Test {
    //contigious block of memory
    // head -> 1 -> 2 -> 3 -> 4 -> 5
    // data and address of next node and in dubule linkedlist address of previous node in java collection
    // double linked list is used in doubly linked list
    // write operation is faster in linked list
    // read operation is slower in linked list
    //it use more memory

    public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Linked List: " + list);

        // Add an element at the beginning
        list.addFirst(0);
        System.out.println("After adding 0 at the beginning: " + list);

        // Add an element at the end
        list.addLast(6);
        System.out.println("After adding 6 at the end: " + list);

        // Remove the first element
        list.removeFirst();
        System.out.println("After removing the first element: " + list);

        // Remove the last element
        list.removeLast();
        System.out.println("After removing the last element: " + list);

        LinkedList<String> animalList = new LinkedList<>(Arrays.asList("Dog", "Cat", "Elephant"));
        LinkedList<String> animalList2 = new LinkedList<>(Arrays.asList("Dog"));
        animalList.removeAll(animalList2);
        System.out.println("Animal List: " + animalList);


        
    }
}