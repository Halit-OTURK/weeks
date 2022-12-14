package homeworks;

public class homework4_done {

    public static void in1020(int a,int b){

        if((a>=10&&a<=20)||(b>=10&&b<=20)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    /*
    Task 7 : Write a method that given 2 int values, return true if either of them is in the range 10..20 inclusive.
    multiple parameter  --- takes two integers
            return type --- boolean

    in1020(12, 99) → true
    in1020(21, 12) → true
    in1020(8, 99) → false

           */

    public static void main(String[] args) {
        in1020(11,99);
        in1020(1,99);
        in1020(11,19);
    }


}
