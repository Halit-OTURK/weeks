package week_10_day25_overloading;

public class AddElementToArray_OLoading {
    public static int[] addElement(int[] arr, int num) {
        int[] result = new int[arr.length + 1];

        int i = 0;
        for (int each : arr) {
            result[i++] = each;
        }
        result[i] = num;
        return result;
    }

    public static double[] addElement(double[]arr, double num) {
        double[] result = new double[(arr.length + 1)];

        int i = 0;
        for (double each : arr) {
            result[i++] = each;
        }
        result[i] = num;
        return result;
    }

    public static char[] addElement(char[]arr, char ch) {
        char[] result = new char [(arr.length + 1)];

        int i = 0;
        for (char each : arr) {
            result[i++] = each;
        }
        result[i] = ch;
        return result;
    }

    public static String[] addElement(String[]arr, String ch) {
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

    }
}
