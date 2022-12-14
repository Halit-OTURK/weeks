package week_9_3_CustomM_Returns;

public class R_M_Practice3 {

    public static int frequency(String word, char ch) {

        int count = 0;

        for (char each : word.toCharArray()) {
            if (each == ch) {
                count++;
            }

        }
        return count;
    }

    public static void Unique(String str) {

        for (int i = 0; i < str.length(); i++) {

            int fre = frequency(str, str.charAt(i));
            if (fre == 1) {
                System.out.println(str.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        String str = "aaabbcddeff";

        int freq = frequency(str, 'a');
        System.out.println(freq);
        System.out.println("=".repeat(88));

        for (int i = 0; i < str.length(); i++) {

            int fre = frequency(str, str.charAt(i));
            if (fre == 1) {
                System.out.println(str.charAt(i));
            }

        }
        Unique(str);

    }
}
