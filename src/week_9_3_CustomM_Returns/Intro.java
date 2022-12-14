package week_9_3_CustomM_Returns;

public class Intro {

    public static String reverse(String str){

        String reverse="";
        for (int i = str.length()-1; i >=0 ; i--) {

            reverse+=str.charAt(i);

        }
      return reverse;
    }
    public static void main(String[] args) {
        String abc="abcde";
       String as= reverse(abc);

       if(abc.equalsIgnoreCase(as)){
           System.out.println("is palindrome");
       }else {
           System.out.println("is not palindrome");
       }
        System.out.println("=".repeat(88));

        String rc="racecar";
        String rc2= reverse(rc);

        if(rc.equalsIgnoreCase(rc2)){
            System.out.println("is palindrome");
        }else {
            System.out.println("is not palindrome");
        }
        System.out.println("=".repeat(88));




    }
}
