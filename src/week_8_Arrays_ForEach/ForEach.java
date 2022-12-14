package week_8_Arrays_ForEach;

import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {
        int[] num = {3, 5, 7, 9, 11};
        for (int each : num) {
            System.out.println(each);
        }
        String[] students = {"ahmet", "mustafa", "derin", "selim", "serkan"};
        for (String a : students) {
            System.out.println(a);
        }
        Arrays.sort(students);
        for (String b : students) {
            Arrays.sort(students);
            b.toUpperCase();
            System.out.println(b);
        }
    }
}
