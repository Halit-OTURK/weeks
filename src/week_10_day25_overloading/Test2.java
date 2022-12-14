package week_10_day25_overloading;

import Utilities.ArraysUtility;

public class Test2 {
    public static void main(String[] args) {

        int [] nums={1,2,3,4,5,6};

        ArraysUtility.printEachElement(nums);

        System.out.println("=".repeat(66));

        char [] ch = {'A','B','C','D','E'};
        ArraysUtility.printEachElement(ch);
        System.out.println("=".repeat(66));

       int max = ArraysUtility.max(nums);
        System.out.println("max: "+max);

        System.out.println("=".repeat(66));
    }
}
