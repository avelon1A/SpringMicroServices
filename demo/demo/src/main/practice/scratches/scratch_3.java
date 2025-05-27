import java.util.Arrays;
import java.util.List;

class Scratch {
    public static void main(String[] args) {
        // Stream

        List<String> list = List.of("a", "b", "c");
        // assume i have a collection i can covert to a stream
        // and after i can perform declarative operations and functional programming approach
        // for example, i can filter the list,map it, and collect it
        // list.stream()
        //         .filter(s -> s.equals("a"))
        //         .map(s -> s.toUpperCase())
        //         .collect(Collectors.toList());
        // this is a declarative approach
        // and i can also use functional programming approach
        // list.forEach(s -> {
        //     System.out.println(s);
        // });
        // this is a functional programming approach
        // and i can also use imperative programming approach
        // for (String s : list) {
        //     System.out.println(s);
        // }
        // this is a imperative programming approach
        // sequnce of elements which we get form collection

        // imperative programming approach
//        for (String s : list) {
//            System.out.println(s);
//        }
        int [] arr = {1, 2, 3, 4, 5};
        // imperative programming approach
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum: " + sum);
        // declarative programming approach
        int sum2 = Arrays.stream(arr).filter(n -> n % 2 == 0)
                .map(n -> n * 2).sum();
        System.out.println("Sum: " + sum2);

//        benifits of stream
        //readablity
        // Flexibility ( perform multiple operation in single stream)
        //parallelism
        //Encapsulation
        //Source → Intermediate operations (lazy) → Terminal operation (eager)







    }
}