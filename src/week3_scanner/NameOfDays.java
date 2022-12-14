package week3_scanner;

import java.util.Scanner;

public class NameOfDays {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Please enter number between 1-7:");
        int num= input.nextInt();

        if(num>=1&&num<=7){
            String day = (num==1)? "Monday" :(num==2)?"Tuesday":(num==3)? "Wednesday":(num==4)?"Thursday":(num==5)? "Friday"
            :(num==6)? "Saturday" : "Sunday";
            System.out.println(day);
        } else {
            System.out.println("invalid number ");




        }
    }
}
