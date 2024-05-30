//  class IntNum -- a class for Sortable ints
package sortable;

public class IntNum implements Sortable {
    private int theNum;     //  field to hold the integer

    public IntNum() {
        theNum = 0;
    }

    public IntNum(int number) {
        theNum = number;
    }

//  compare function required by Sortable interface

    public int compare(Sortable another) {
        return ((IntNum)this).theNum - ((IntNum) another).theNum;
    }

//  allows us to print an IntNum

    public String toString() {
        return Integer.toString(theNum);
    }
    public static void main(String[] args) {

    //  create an array of IntNums, print them, sort them, and print them again

            IntNum[] nums = new IntNum[5];
            nums[0] = new IntNum(8);
            nums[1] = new IntNum(3);
            nums[2] = new IntNum(6);
            nums[3] = new IntNum(1);
            nums[4] = new IntNum(5);

            System.out.println("Values before sorting:");
            for (int i = 0 ; i < nums.length ; i++)
                System.out.print(nums[i]+", ");
            System.out.println();
            Sort.bubbleSort(nums);
            System.out.println("Values after sorting:");
            for (int i = 0 ; i < nums.length ; i++)
                System.out.print(nums[i]+", ");
            System.out.println();
    }
}	//  end class IntNum

