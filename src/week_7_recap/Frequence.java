package week_7_recap;

import java.util.Scanner;

public class Frequence {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("please enter a word: ");
        String word = inp.nextLine();
        String result = "";

        for (int a = 0; a < word.length(); a++) {

            int count = 0;//if dont equal count =0 ; all count steps addition a=0=> count:2,a=1 => count=2+3=5 not 3
            char ch = word.charAt(a);

            for (int i = 0; i < word.length(); i++) {


                char each = word.charAt(i);
                if (ch == each) {
                    count++;
                }
            }
            if (result.contains("" + ch)) {// contains methods only work with String

                continue;
            }

            result += ch;
            result += count;
        }

        System.out.println(result);
    }
}
