package week3_switchCase;

public class NumberOfDays {
    public static void main(String[] args) {
        int month = 22;
        int year = 2020;
        String result="";

        if (month >= 1 && month <= 12) {
            switch (month) {
                case 2:
                    result= (year % 4 == 0)? "29 Days" : "28 Days";
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    result= "30 Days";
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    result="31 Days";
                    break;
            }
        } else {
            result= "Invalid number";
        }
        System.err.println(result);
    }
}
