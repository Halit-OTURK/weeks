package week_10_day25_overloading;

import Utilities.StringUtility;

public class Test {
    public static void main(String[] args) {
        String str = "java is fun";

        StringUtility.printEachCharacter(str);
        System.out.println("=".repeat(66));
        String str2 = StringUtility.reverse(str);
        System.out.println(str2);
        System.out.println("=".repeat(66));
        String pal = "racecar";
        boolean isp = StringUtility.isPalindrome(pal);
        System.out.println(isp);
        System.out.println("=".repeat(66));
        // how many palindrome words are there?
        String[] isp2 = {"racecar", "was", "civic", "are"};
        int count = 0;
        for (String each : isp2) {
            if (StringUtility.isPalindrome(each)) {
                count++;
            }
        }
        System.out.println(count);
        System.out.println("=".repeat(66));

        String dub = "aaaabbbbcccdddfffgg";
        dub = StringUtility.removeDuplicates(dub);
        System.out.println(dub);
        System.out.println("=".repeat(66));


    }


}
