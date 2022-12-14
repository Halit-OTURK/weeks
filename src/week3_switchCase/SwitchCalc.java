package week3_switchCase;

public class SwitchCalc {
    public static void main(String[] args) {
        double n1 = 88, n2 = 55;
        char operator = '+';
        boolean valid = operator == '+' || operator == '-' || operator == '*' || operator == '/';
        if (valid) {
            switch (operator) {
                case '+':
                    System.out.println(n1 + n2);
                    break;
                case '-':
                    System.out.println(n1 - n2);
                    break;
                case '*':
                    System.out.println(n1 * n2);
                    break;
                default:
                    System.out.println(n1 / n2);
            }
        } else {
            System.err.println("Invalid Operator: " + operator);
        }
    }
}
