package week_7_needLoops;

import java.util.Scanner;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("please enter 1. number: ");
        int a = inp.nextInt();
        System.out.println("Please enter 2.number: ");
        int b= inp.nextInt();
        int counter=0;
       if (a>b){

        while (a>=b){
            a-=b;
            counter++;}

        System.out.println("remainder: " + a);
        System.out.println(counter + "times");}
       else {
           System.out.println("a must be bigger than b");
       }
    }
}
