package week_8_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AvarageNumbers {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("how many number would you like enter?");
        int length=inp.nextInt();
        double sum=0.0;
        double av=0.0;
        if (length<=0){
            System.err.println("invalid number entry");
            System.exit(0);
        }
        int[] num = new int[length];
        for (int i = 0; i <length ; i++) {
            System.out.println("please enter number: ");
            int enter = inp.nextInt();
            num[i] = enter;
            sum+= num[i];
        }
        Arrays.sort(num); // ====>>> sort methods ==>> Arrays.sort(....);
        System.out.println(Arrays.toString(num));
        av=sum/ num.length;
        System.out.println("av = " + av);
    }
}
