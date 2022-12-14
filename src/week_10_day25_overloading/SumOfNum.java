package week_10_day25_overloading;

public class SumOfNum {
    public static int sum(int a,int b, int c){

        return a+b+c;
    }
    public static int sum(int a,int b, int c,int d){

        return sum( a,b,c)+ d;
    } // shortway
    public static double sum(double a,double b, double c){

        return a+b+c;
    }
    public static double sum(double a,double b, double c,double d){

        return sum( a,b,c)+ d;
    } // shortway


    public static void main(String[] args) {

    }
}
