package week02_09_17_2022;

public class SumTwoNumber {

    public static void main(String[] args) {

        int firstNumber = 10;
        int secondNumber = 20;
        int sum = firstNumber + secondNumber;
        System.out.println(sum);
        //sum.sout same shortcut sout(sum);

        // concanated
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
        System.out.println(firstNumber + " + " + secondNumber + " = " + firstNumber + secondNumber);// result 1020 :D

        /** !!!!!!!! firstNumber ==> int, "+"===> String .......====>>>> compiler see all of line at String
         * 10 and 20 both of String
         * due to 1020
         * not like int 10+20=30 */

        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        /** see as int */

        int a = 30;
        String s = "30";
        System.out.println(s + a); // int+String=String ====> result 3030
        String s1 = s + a;
        // s+a ===>> use alt+enter replace introduce local variable +enter ===> String s1=s+a; shortcut
    }
}
