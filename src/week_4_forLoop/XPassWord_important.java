package week_4_forLoop;

import java.util.Scanner;

public class XPassWord_important {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        System.out.println("please enter password");
        String pass= inp.nextLine();
        char add = 'X';
        String password="";
        for (int i = 0; i < pass.length(); i++) {
        password= password + pass.charAt(i) + add;
       // password += ""+ pass.charAt(i) + add; 2. way

        }
        System.out.println(password);
    }
}
