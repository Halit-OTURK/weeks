package week3_switchCase;

public class Grade {
    public static void main(String[] args) {
        char ch = 'B';
        String result = "";

        switch (ch) {

            case 'A':
                result = "EXCELLENT";
                break;
            case 'B':
                result = "GREAT JOB";
                break;
            case 'C':
                result ="GOOD";
                break;
            case 'D':
                result ="PASSED";
                break;
            case 'F':
                result ="FAILED";
                break;
            default:
                result="Invalid";
        }
        System.out.println(result);
    }
}
