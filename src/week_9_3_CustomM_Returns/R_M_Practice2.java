package week_9_3_CustomM_Returns;

public class R_M_Practice2 {
    public static String grade(int score){
// not void because parameter int and return type is String don't match. we can't use both in void method together
        String result = "";
        if(score < 0 || score > 100){ // Invalid
            result = "Invalid";
        }else{ // valid
            result = (score >= 90) ? "A" :(score >= 80)? "B" :(score >= 70)? "C" :(score >= 60)? "D" : "F";
        }

        return result;}

    public static void main(String[] args) {
       String str1= grade(45);
        String s2=grade(120);
        System.out.println(str1);
        System.out.println(s2);

        System.out.println("=".repeat(66));
        if(str1.equals("A")){
            System.out.println("Excellent");
        }else if(str1.equals("B")){
            System.out.println("Great");
        }else if(str1.equals("C")){
            System.out.println("Good");
        }else if(str1.equals("D")){
            System.out.println("Passed");
        }else{
            System.out.println("Try again1");
        }
    }

    }
