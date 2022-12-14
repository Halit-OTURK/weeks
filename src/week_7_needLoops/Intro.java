package week_7_needLoops;

import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);


        while (true){
            System.out.println("please enter first number:");
            int a= inp.nextInt();
            System.out.println("please enter second number: ");
            int b= inp.nextInt();

            System.out.println("Addition: " + (a + b));

            System.out.println("would you like to continue?");
            String c= inp.next().toLowerCase();
            while (!(c.equals("yes")|| c.equals("no"))){
                System.err.println("invalid entry! please re-enter:");
                    c= inp.next().toLowerCase();
            }

            if (c.equals("no")){
                System.out.println("thanks");
                break;
            }
        }
    }
}
