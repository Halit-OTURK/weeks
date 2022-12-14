package week3_ternaries;

public class CharacterIdendity {
    public static void main(String[] args) {

        char ch = 20000;
        String id = (ch >= 48 && ch <= 57) ? "Digit" : (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') ? "Alphabetic" : "Special Character";
        System.out.println(ch + " = " + id);
        // 48==> 0 and 57==> 9 ascıı table
    }
}
