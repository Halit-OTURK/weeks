package week_10_day26_CM_Practice;

import Utilities.ArraysUtility;

public class MergeTwoArrays2 {

    public static int[] mergeTwoArrays(int[] arr1, int[] arr2) {

        int[] result = {};

        for (int each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (int each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }

        return result;

    }
}
