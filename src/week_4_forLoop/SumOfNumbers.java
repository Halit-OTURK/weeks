package week_4_forLoop;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        double sum = 0;
        // for shortcut===>>> fori
        for (int i = 1; i < 101; i+=2) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println("==".repeat(33));

        int total=0;
        Scanner inp = new Scanner(System.in);
        for (int i = 0; i <5 ; i++) { // our goal: user enter 5 number and total all of numbers
            System.out.print("Enter a number:");
            total+= inp.nextInt();
        }
        System.out.println(total);




    }
}
