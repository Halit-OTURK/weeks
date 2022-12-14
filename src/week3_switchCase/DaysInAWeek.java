package week3_switchCase;
import java.util.Scanner;
public class DaysInAWeek {
    public static void main(String[] args) {
int day;

Scanner input= new Scanner(System.in);
        System.out.print("Please enter day:");
        day= input.nextInt();

switch (day){
    case 1 :
        System.out.println("monday");
        break;
    case 2:
        System.out.println("tuesday");
        break;
    case 3:
        System.out.println("wednesday");
        break;
    case 4:
        System.out.println("thursday");
        break;
    case 5:
        System.out.println("friday");
        break;
    case 6:
        System.out.println("saturday");
    case 7:
        System.out.println("sunday");
    default:
        System.out.println("invalid day");
        break;}

        
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter command:");
    char response = scan.next().charAt(0);
    //WRITE YOUR CODE BELOW
    switch(response){
        case 'y':
            System.out.println("Your request is being processed");
            break;
        case 'n':
            System.out.println("Thank you for your consideration");
            break;
        case 'h':
            System.out.println("Sorry, no live agents are currently available");
            break;
        default:
            System.out.println("Invalid entry, please try again");}
}
    }

