package week_10_day25_overloading;

import java.util.Arrays;

public class AddElementToArray_AllPrimitiveTypes {
    // {1,2,3,4}+5==> {1,2,3,4,5}

    public static int[] addInteger(int[] arr, int num) {
        int[] result = new int[arr.length + 1];

        int i = 0;
        for (int each : arr) {
            result[i++] = each;
        }
        result[i] = num;
        return result;
    }

    public static double[] addDouble(double[]arr, double num) {
        double[] result = new double[(arr.length + 1)];

        int i = 0;
        for (double each : arr) {
            result[i++] = each;
        }
        result[i] = num;
        return result;
    }

    public static char[] addChar(char[]arr, char ch) {
        char[] result = new char [(arr.length + 1)];

        int i = 0;
        for (char each : arr) {
            result[i++] = each;
        }
        result[i] = ch;
        return result;
    }

    public static String[] addString(String[]arr, String ch) {
        String[] result = new String [(arr.length + 1)];

        int i = 0;
        for (String each : arr) {
            result[i++] = each;
            // result[arr.length-1]=each;
        }
        result[i] = ch;
        return result;
    }

    public static void main(String[] args) {

        int[] array={5,6,7,8,9,10};

        array=addInteger(array,8888);
        System.out.println(Arrays.toString(array));


        System.out.println("=".repeat(66));
        double [] array2={1.5,2.8,3.6};
        array2=addDouble(array2,9.88);
        System.out.println(Arrays.toString(array2));


    }
}
