package week_8_Arrays_ForEach;

public class MaxNumber {
    public static void main(String[] args) {
        int[] num = {11, 33, 25, 8, 4, 556};
        int max = num[0];
        int min = num[0];

        for (int nums : num) {
            if (nums > max) {
                max = nums;
            }
            if (nums < min) {
                min = nums;
            }

        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
