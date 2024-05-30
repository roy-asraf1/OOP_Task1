package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // Creating an empty ArrayList of Student type
        ArrayList<Student> arr = new ArrayList<Student>();
        // Adding entries in above List
        arr.add(new Student(131, "Rachel", "Tveria"));
        arr.add(new Student(121, "Alon", "BatYam"));
        arr.add(new Student(101, "Ruth", "TelAviv"));
        arr.add(new Student(111, "Avi", "Ariel"));
        System.out.println("Before Sort");
        // Iterating over entries to print them
        for (Student student : arr)
            System.out.println(student);

        // Sorting student entries by id number
        SortById sid = new SortById();
        arr.sort(sid);
        System.out.println("\nSorted by id");
        for (Student student : arr)
            System.out.println(student);

        // Sorting student entries by name
        Collections.sort(arr, new SortByname());
        System.out.println("\nSorted by name");
        // // Again iterating over entries to print them
        for (Student student : arr)
            System.out.println(student);

        Collections.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.address.compareTo(s2.address);
            }
        });
        System.out.println(arr);
    }
}

