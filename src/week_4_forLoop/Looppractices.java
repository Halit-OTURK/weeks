package week_4_forLoop;

public class Looppractices {
    public static void main(String[] args) {

        for (int i = 1; i <= 45; i++) {
            System.out.print("i: " + i + ",");
        }
        for (int a = 100; a >= 50; a--) {
            System.out.print("a = " + a + ",");
        }

        for (int even = 1; even < 55; even++) {
            if (even % 2 == 0) {
                System.out.print(even + " ");
            }
        }

        for (int b = 1; b < 55; b += 2) {
            System.out.print(b + "");

        }

        /*     for (int b = 55; b > 1; b += 2) {
                System.out.print(b + ""); }   ============>>> result= infinity */
    }
}
