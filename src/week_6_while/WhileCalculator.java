package week_6_while;

import java.util.Scanner;

public class WhileCalculator {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        System.out.println("first number:");
        int num1 = inp.nextInt();
        System.out.println("second number: ");
        int num2 = inp.nextInt();

        System.out.println("please ente math operator: ");
        char ch = inp.next().charAt(0);

        /*if==> only 1 repeat */
        while ( !(ch=='+' || ch =='-')){
            System.err.println("invalid operator.! Please try again: ");
            ch = inp.next().charAt(0);
        }
        System.out.println((ch=='+') ? num1+num2 : num1-num2);
    }
}
