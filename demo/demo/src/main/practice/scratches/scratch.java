import java.util.*;

class Scratch {

    static class StringComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return o1.length()-o2.length();
        }
    }

    public static  void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");

//        ListIterator<String> iterator = names.listIterator();

//        System.out.println("Forward Traversal:");
//        while (iterator.hasNext()) {
//            String name = iterator.next();
//            System.out.println(name);
//            if (name.equals("Alice")) {
//                iterator.set("Alicia");
//            }
//        }
//
//        System.out.println("\nModified List: " + names);
//
//        System.out.println("\nBackward Traversal:");
//        while (iterator.hasPrevious()) {
//            System.out.println(iterator.previous());
//        }
//        names.sort(new StringComparator());
//        System.out.println(names);


        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(4);
        list.add(6);
        list.add(5);
//        list.set(0, 10); //override
//        list.set(1, 20);
//        list.add(2, 30); // it will addd
//        list.sort(null); // sort
//        Collections.sort(list); // sort
//        list.retainAll(list);
//        list.removeAll(list);

//        Iterator<Integer> iterable = list.iterator();
//        while ( iterable.hasNext()) {
//            Integer element = iterable.next();
//            System.out.println(element);
//        }


//        System.out.println( list);


        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("John", 1));
        students.add(new Student("Alice", 1));
        students.add(new Student("Bob", 3));
        students.add(new Student("Bob", 4));
        students.add(new Student("David", 5));
        students.add(new Student("Eve", 6));
        students.add(new Student("Frank", 7));
        students.add(new Student("Grace", 8));
        students.add(new Student("Heidi", 9));

      students.sort(Comparator.comparingInt(Student::getRollNo).reversed().thenComparing(Student::getName));
        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getRollNo());
        }
//        students.sort((o1, o2) -> o1.getRollNo() - o2.getRollNo());
//        for (Student student : students) {
//            System.out.println(student.getName() + " " + student.getRollNo());
//        }




    }
    //O(1) get element
    //O(n)  adding removing ,iteration
    // O(nlogn) sorting
}

class Student implements Comparator<Student> {

    String name;
    Integer rollNo;

    public Student(String name, Integer rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getRollNo() {
        return rollNo;
    }
    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }


    @Override
    public int compare(Student o1, Student o2) {
        return o1.getRollNo().compareTo(o2.getRollNo());
    }
}