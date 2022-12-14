package homeworks;

public class homework3_done {


    public static String reverse(String word){
        String result="";

        if(word.length()-1==0){
            System.out.println(word);
        }else{

        result+=word.charAt(word.length()-1);

        for (int i = 1; i <=word.length()-2 ; i++) {
            result += word.charAt(i);

            }
        result+=word.charAt(0);



        System.out.println(result);}

        return result;
    }

    public static void main(String[] args) {

        reverse("asdfg");
        reverse("fbcdea");
        reverse("a");
        reverse("ab");
    }
    /*Task 6 : Write a method that return a new string where the first and last chars have been exchanged.


    frontBack("code") → "eodc"
    frontBack("a") → "a"
    frontBack("ab") → "ba" */



}
