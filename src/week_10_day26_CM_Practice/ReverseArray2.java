package week_10_day26_CM_Practice;

import Utilities.ArraysUtility;

public class ReverseArray2 {

    public static int[] reverseArray(int[] arr) {
        int[]reversed={};

        for (int i = arr.length - 1; i >= 0; i--) {
            ArraysUtility.addElement(reversed,arr[i]);
        }

        return reversed;
    }
}
