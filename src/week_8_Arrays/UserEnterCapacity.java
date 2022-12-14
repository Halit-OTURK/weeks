package week_8_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class UserEnterCapacity {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("how many number would you like enter?");
        int length=inp.nextInt();
        if (length<=0){
            System.err.println("invalid number entry");
            System.exit(0);
        }
        int[] numbers = new int[length];
        for (int i = 0; i <length ; i++) {
            System.out.println("please enter number: ");
            int enter= inp.nextInt();
            numbers[i]=enter;
            // int enter=inp.nextInt();
       }
        System.out.println(Arrays.toString(numbers));
    }
}
