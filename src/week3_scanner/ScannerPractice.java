package week3_scanner;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print( "Enter Your Age:");
        int age= input.nextInt();
        System.out.print("Enter Your Full Name:");
        input.nextLine(); // for enter only must use pass  the 35other methods to nextline
        String name = input.nextLine();
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        input.close();

    }


}
