package week_8_Arrays_StringMethods;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str = "java";

        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));

        System.out.println("=".repeat(33));

        String str2 = "java2";

        for (char each : str2.toCharArray()) {
            System.out.println(each);
        }
        System.out.println("=".repeat(33));

        String a="i like to moving moving";

        String[] word= a.split("");

        System.out.println(Arrays.toString(word));

        String [] word2=a.split(" ");
        System.out.println(Arrays.toString(word2));

        System.out.println("=".repeat(33));

        String email="abcd@gmail.com";
        String[]email2=email.split("@"); // there can't be at new array object that character we write to separate sentences in split method.
        System.out.println(Arrays.toString(email2));

        System.out.println("=".repeat(33));

        String poem="come and see. how can i survive. when you there aren't.";
        String[]poetry=poem.split("\\.");//     \\.  ==> mandatory to seperate from "."
        System.out.println(Arrays.toString(poetry));



    }
}
