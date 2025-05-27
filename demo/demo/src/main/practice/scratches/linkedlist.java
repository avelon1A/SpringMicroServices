import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

class Scratch {
    public static void main(String[] args) {
        //LinkedList java collections

        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("G");

        // Print the list
        System.out.println("Original list: " + list);
        list.addFirst("0");
        list.addLast("$");
        System.out.println("After adding first and last: " + list);
        list.removeFirst();
        list.removeLast();
        System.out.println("After removing first and last: " + list);
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        list.add(0, "@");
        System.out.println("First element: " + list.getFirst());
        int last = list.lastIndexOf("G");
        System.out.println("Last index of G: " + last + ", Element at last index: " + list.get(last));
        System.out.println("Last element: " + list.getLast());
        System.out.println("List size: " + list.size());
        System.out.println("Is the list empty? " + list.isEmpty());
        System.out.println("Does the list contain 'C'? " + list.contains("C"));
        System.out.println("Index of 'C': " + list.indexOf("C"));
        System.out.println("Sublist from index 2 to 5: " + list.subList(2, 5));
        System.out.println("Reversed list: ");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        list.stream().filter(s -> s.equals("A")).forEach(System.out::println);
        list.stream().map(String::toUpperCase).forEach(System.out::println);
        list.stream().sorted().forEach(System.out::println);
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        long count = list.stream().filter(s -> s.equals("A")).count();
        System.out.println("Count of 'A': " + count);
        long count1 = list.stream().skip(2).filter(s -> s.equals("A")).count();
        System.out.println("Count of skiped 'A': " + count1);
        List<String> result = list.stream()
                .map(s -> s.equals("A") ? "B" : s)
                .collect(Collectors.toList());
        System.out.println(result);

    }
}