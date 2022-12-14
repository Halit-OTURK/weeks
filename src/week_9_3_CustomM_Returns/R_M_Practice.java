package week_9_3_CustomM_Returns;


public class R_M_Practice {

    public static int maximum(int num1, int num2) {
        int max = 0;
        if (num1 < num2) {
            max = num2;
        } else if (num2 < num1) {
            max = num1;

        } else {
            max = num1;
        }

        return max;
    }

    public static void main(String[] args) {
        int a = maximum(45, 99);
        int mul = a * 2;
        System.out.println(mul);



    }
}
