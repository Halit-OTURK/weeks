package week_8_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxNumberOfArrays {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        System.out.println("how many number would you like enter?");
        int length=inp.nextInt();
        if (length<=0){
            System.err.println("invalid number entry");
            System.exit(0);
        }
        int[] num = new int[length];
        for (int i = 0; i <length ; i++) {
            System.out.println("please enter number: ");
            int enter= inp.nextInt();
            num[i]=enter;
            // int enter=inp.nextInt();
        }
        System.out.println(Arrays.toString(num));

       // int [] num = {10,55,4,23,58,11};
        int max= num[0];
        int min=num[0];

        for (int i = 0; i <num.length ; i++) {
            if (num[i]>max){
                max=num[i];
            }
            if (num[i]<min){
                min=num[i];
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
