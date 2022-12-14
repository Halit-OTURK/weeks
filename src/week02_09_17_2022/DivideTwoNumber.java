package week02_09_17_2022;

public class DivideTwoNumber {
    public static void main(String[] args) {
        int firstNumber=20;
        int secondNumber=3;
        int result=firstNumber/secondNumber;
        double result1=firstNumber/secondNumber;
        System.out.println("result = " + result);// result:6
        System.out.println("result1 = " + result1);// result=6.0 because result1 double first and second int

        double firstNumber1=20;
        int secondNumber1=3;
        //double result2 =firstNumber1/secondNumber1; 6.66666666667
        double result2 =firstNumber1/(double)secondNumber1;
       // double result2 =firstNumber1/(double)secondNumber1; 6,66666667
        System.out.println("result2 = " + result2);

        double a=20;
        double b=3;
        int division=(int)(a/b);// result int
        System.out.println("division = " + division);// result 6
    }
}
