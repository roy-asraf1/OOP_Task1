//  class to show use of Sortable interface
package sortable;

public class SortTest {
    public static void main(String[] args) {

//  create an array of Employees, print them, sort them, and print them again

        Employee[] people = new Employee[4];
        people[0] = new Employee(444556666,"Haim","Haimovich",75000);
        people[1] = new Employee(222334444,"Moshe","Moshkovich",64000);
        people[2] = new Employee(888776666,"Izhak","Izhaki",67000);
        people[3] = new Employee(555667777,"Tomer ","Tamir",84000);

        System.out.println("Values before sorting:");
        for (Employee person : people) {
            System.out.println(person);
        }
        Sort.bubbleSort(people);
        System.out.println("\nValues after sorting:");
        for (Employee person : people){
            System.out.println(person);
        }
// check
        //System.out.println(nums[0] instanceof Sortable);
        System.out.println(people[0] instanceof Sortable);
        System.out.println(people[0] instanceof Comparable);
    }
}	// end class SortTest

