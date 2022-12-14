package week_4_forLoop;

public class Stringmethods {
    public static void main(String[] args) {
        String str = "  ";
        boolean r = str.isEmpty();// about length string has any value or empty
        System.out.println(r);// result==>> false because str has blanks/white space no empty
        System.out.println("==>>".repeat(33));


        //abc.isBlank(); has white spaces but no have any characters
        boolean r1 = str.isBlank();
        System.out.println(r1); //result ==>> true str has blanks/white space no any different character
        System.out.println("==>>".repeat(33));


        String str2 = "";
        boolean r2 = str.isBlank();
        System.out.println(r2);// result==>> true
        String str3 = "abs";
        boolean r3 = str3.isBlank();
        System.out.println(r3);//==>> false because str3 have value
        System.out.println("==>>".repeat(33));


        String str4 = "so what";
        String str5 = "SO what";
        String str6 = "SO what";
        System.out.println(str4.equals(str5));//result==>> false
        System.out.println(str5.equals(str6));//result==>> true
        System.out.println(str4.equalsIgnoreCase(str6));//result==>> true because this method ignore uppercase or lowercase
        System.out.println("==>>".repeat(33));

        String sentence=" what is your problem?";
        boolean a = sentence.contains("ob"); // are there any "bla bla" in this value? has sentence include "bla bla"?

        boolean b = sentence.contains("w");
        System.out.println(a);
        System.out.println(b);

        String sentence2= sentence.toUpperCase();// all sentence uppercase now. we can not call equal methods with contain method
        boolean a2 = sentence2.contains("OB");
        System.out.println(a2);
        boolean c =sentence2.toLowerCase().contains("at");
        System.out.println(c);
        System.out.println("==>>".repeat(33));

        String start= "let's go party";
        boolean strt= start.startsWith("let");
        System.out.println(strt); // result==>> true

        boolean strt2= start.startsWith("lo");
        System.out.println(str2); // result ==>> false;

        boolean strt3=start.endsWith("o"); // false
        System.out.println(strt3);

    }
}
