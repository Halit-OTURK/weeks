package week3_switchCase;

public class Grade2 {
    public static void main(String[] args) {
        // A,B,C,D "PASSED" otherwise "failed"
        char ch= 'p';
        String result="";
        switch (ch){
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                result="PASSED";
                break;
            case 'F':
                result="FAILED";
                break;
            default:
                result= "INVALID";
        }
        System.out.println("result = " + result);
    }
}
