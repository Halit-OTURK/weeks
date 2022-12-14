package week_6_for;

import java.util.Scanner;

public class FrequencyWord2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String str1 = "bird cat cat bird";

        int frequ = 0;

        for (int i = 0; i < str1.length() - 2; i++) {
            String eachSub = str1.substring(i, i + 3);// String not equal char but put "" then char turn string value
            boolean a = eachSub.equals("cat");
            if (a) {
                frequ += 1;
            }
        }
        System.out.println(frequ);

        int freq2 = 0;

        for (int b = 0; b < str1.length() - 3; b++) {
            String eachSub2 = str1.substring(b, b + 4);// String not equal char but put "" then char turn string value
            boolean c = eachSub2.equals("bird");
            if (c) {
                freq2 += 1;
            }
        }
        System.out.println(freq2);

        if (frequ == freq2) {

            System.out.println("equal: " + frequ);

        } else {
            System.out.println("not equal");

        }

    }
}
