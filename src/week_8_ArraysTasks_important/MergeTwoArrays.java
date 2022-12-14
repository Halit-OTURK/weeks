package week_8_ArraysTasks_important;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        String[] words = {"Layan", "Oleksandr", "Olga"};
        String[] words2 = {"Adam", "Cihad", "Cydeo"};
        String[] wordmerge = new String[words.length + words2.length];
        int i = 0;
        for (String each : words) {
            wordmerge[i++] = each;
        }
        for (String each : words2) {
            wordmerge[i++] = each;
        }

        System.out.println(Arrays.toString(wordmerge));
        System.out.println("=".repeat(33));

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'D', 'E', 'F', 'G', 'H'};

        char[] chars = new char[ch1.length + ch2.length];

        int j = 0;

        for (char ch : ch1) {
            chars[j++]= ch;

        }

        for (char ch : ch2) {
            chars[j]= ch;
            j++; // chars[j++]= ch; both of true
        }

        System.out.println(Arrays.toString(chars));

    }
}
