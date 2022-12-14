package week4_String_methods;

import java.util.Scanner;

public class Subs {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("please enter first word:");
        String a= inp.nextLine();
        System.out.print("Please 2. word");
        String b=inp.nextLine();

        System.out.println(a.substring(1)+b.substring(1));
    }
}
