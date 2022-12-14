package week_10_day26_CM_Practice;

public class ReverseArray {

    public static int[] reverseArray(int[] arr) {

        int[] reversed = new int[arr.length];
        int j = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            reversed[j++] = arr[i];
        }

        return reversed;
    }
}
