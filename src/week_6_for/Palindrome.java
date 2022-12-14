package week_6_for;


import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter your sentence: ");
        String word = inp.nextLine();

        String word2 = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            word2 += word.charAt(i);

        }

        if (word.equalsIgnoreCase(word2)) {
            System.out.println("palindrome");

        } else {
            System.out.println("not palindrome");
        }
       // 2. way/solution
        boolean isB = word.equalsIgnoreCase(word2);
        System.out.println(isB);


    }
}
