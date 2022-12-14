package week_8_Arrays_ForEach;

public class Practice {
    public static void main(String[] args) {
        String[] word = {"abc def", "ghi lmn", "opq rst"};
        for (String fl : word) {
            System.out.println(fl);
            System.out.println(""+fl.charAt(0)+fl.charAt(word.length-1));// word is array
            System.out.println(""+fl.charAt(0)+fl.charAt(fl.length()-1));//fl is String
        }


    }
}
