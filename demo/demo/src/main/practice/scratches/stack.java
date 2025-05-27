import java.util.Stack;

class Scratch {
    public static void main(String[] args) {
        // Stack is  thread safe
        // Stack is a subclass of Vector
        // Stack is a last in first out (LIFO) data structure
        // Stack is used to store data in a last in first out (LIFO) order

        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");

        System.out.println("Stack: " + stack);
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
        System.out.println("Search for 'C': " + stack.search("C"));
        System.out.println("Search for 'A': " + stack.search("A"));
        System.out.println("Search for 'F': " + stack.search("F"));
        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Stack size: " + stack.size());
        System.out.println("Stack capacity: " + stack.capacity());
        System.out.println("Stack contains 'B'? " + stack.contains("B"));
        System.out.println("Stack contains 'F'? " + stack.contains("F"));
        System.out.println("Stack after clear: " + stack);
        stack.clear();
        System.out.println("Stack after clear: " + stack);
        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Stack size: " + stack.size());
        

    }
}