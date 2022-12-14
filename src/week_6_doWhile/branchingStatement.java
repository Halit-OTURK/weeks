package week_6_doWhile;

import java.util.Scanner;

public class branchingStatement {
    public static void main(String[] args) {

        for (char i = 'A'; i <= 'Z'; i++) {

            if (i == 'E') {
                break;
            }

            System.out.println(i);}

            Scanner inp = new Scanner(System.in);
            while (true) {
                System.out.println("please enter number");
                int num = inp.nextInt();
                if (num < 0) {
                    break;
                }
            }

        }
    }

