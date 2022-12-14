package week_10_day27_WrapperClasses;

import java.util.Arrays;

public class Replace {
    public static int[] replace(int[] arr, int index, int element) {
        if (index > arr.length - 1 || index < 0) {
            System.out.println("invalid index number");
            System.exit(0);
        }
        arr[index] = element;

        return arr;
    }

    public static void main(String[] args) {

        int[]abc={1,2,3,4,5,6};
        abc=replace(abc,1,200);

        System.out.println(Arrays.toString(abc));
    }
}
