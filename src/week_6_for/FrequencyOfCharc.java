package week_6_for;

import java.util.Scanner;

public class FrequencyOfCharc {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("please enter sentence:");
        String str= inp.nextLine();
        System.out.println("please enter control character: ");
        String ch = inp.next();
        int freq = 0;
        for (int i = 0; i < str.length(); i++) {
            String eachChar = ""+ str.charAt(i);// String not equal char but put "" then char turn string value
            boolean a = ch.equals(eachChar);
            if(a){
                freq+=1;
            }
        }
        System.out.println("freq = " + freq);
    }
}
