package week_6_while;

import java.util.Scanner;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {

        Scanner inp= new Scanner(System.in);
        System.out.println("please enter sentence");
        String str = inp.nextLine();
        //String str="java java java pyhton phyton";
        System.out.println("enter replace word: ");
        String rpl= inp.nextLine();

        int freq=0;
        while (str.contains(rpl)){
            str=str.replaceFirst(rpl,"");

            System.out.println(str);
            freq++;
        }
        str = str.trim();
        System.out.println(str);
        System.out.println("freq = " + freq);
    }
}
