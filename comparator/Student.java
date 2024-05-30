package comparator;
import java.util.*;
import java.lang.*;
// Java Program to Demonstrate Working of
// Comparator Interface

// A class to represent a Student
public class Student {
    int id;
    String name, address;
    // Constructor
    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    // To print student details in main()
    public String toString() {
        // Returning attributes of Student
        return this.id + " " + this.name + " " + this.address;
    }
}
// Helper class implementing Comparator interface
class SortById implements Comparator<Student> {
    // Sorting in ascending order of roll number
    public int compare(Student a, Student b) {
        return a.id - b.id;
    }
}

// Helper class implementing Comparator interface
class SortByname implements Comparator<Student> {
    // Sorting in ascending order of name
    public int compare(Student a, Student b) {
        return a.name.compareTo(b.name);
    }
}
