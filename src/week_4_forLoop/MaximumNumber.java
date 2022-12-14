package week_4_forLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        int max = -256526525;

        for (int i = 0; i <5 ; i++) {
            System.out.print("Enter number:");
            int num= inp.nextInt();
                if(num>max){
                max=num;
            }
                }
        System.out.println(max);
    }
}
