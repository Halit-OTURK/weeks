package week_8_ArraysTasks_important;

public class ReverseSentences_good_example {
    public static void main(String[] args) {

        String sentence = "Today is a good day to learn java";

        String[] words = sentence.split(" ");

        String reversedSentence = "";

        for (int i = words.length - 1; i >= 0; i--) {

            reversedSentence += words[i] + " ";

        }

        System.out.println(reversedSentence);

        System.out.println("=".repeat(33));

        // REVERSE SECOND WORD TASK

        String a = "I love Java";
        System.out.println(a);

        String[] b = a.split(" ");

        String reverse = "";


            for (int i = b[1].length() - 1; i >= 0; i--) {
                reverse += b[1].charAt(i);
            }
        System.out.println(reverse);

       /*     b[1]=reverse;
        for (String each:b){
            System.out.print(each+" ");
        }
        // ==>> second way */

            a=a.replaceFirst(b[1], reverse);

        System.out.println(a);

    }
}
