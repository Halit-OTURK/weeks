package week_10_day27_WrapperClasses;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {

    public static int[] removeDublicates(int[] arr) {

        int[] removed = {};

        for (int each : arr) {
            if (!ArraysUtility.contains(removed, each))
            { removed=ArraysUtility.addElement(removed, each);}
        }
        return removed;
    }


    public static void main(String[] args) {

        int arr[]={11,1,1,11,2,3,44,5,6};

        arr=removeDublicates(arr);

        System.out.println(Arrays.toString(arr));
    }
}
