package RecursiveMethod;

public class RecursiveMethod_SumOfNumbers {
    private static int sum (int input) {
        if (input == 1) return 1;

        else {
            return input + sum(input - 1);

        }
    }
    public static void main(String[] args) {
        int s=10;
      int result =  sum(s);
        System.out.println("result = " + result);
    }
}
