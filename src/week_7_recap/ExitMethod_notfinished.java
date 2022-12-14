package week_7_recap;

import java.util.Scanner;

public class ExitMethod_notfinished {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            if(i==2){
                continue;
            }
            System.out.println(i);
            if (i==5){
                break;
            }
            System.out.println("i = " + i);

        }
        System.out.println("=".repeat(45));


        Scanner inp=new Scanner(System.in);
        System.out.print("please enter a number: ");

        int a = inp.nextInt();

        while (a>0) {

            System.out.println("try again");
            if (a==7){
                System.exit(0);
            }
            if (a==9){
                break;
            }
            System.out.print("please enter a number: ");
            a = inp.nextInt();
        }
        System.out.println("goodbye");
    }
}
