package week02_09_17_2022;

public class VariablesIntro {

    public static void main(String[] args) {

    int age =35;
    short myShort=12;
    long myLong= 12321223254l;
    double myDouble=25.5;
    double myDouble1=25;// output 25.0
    float myFloat=12.5f;// default data type for compiler is double.
        // if don't write f, compiler think this number is desimal.
        // if out f when compiler say yeah this number is float
    float myfloat2= (float) 12.5; // explicit casting done by developer smaller to bigger
    long l=11;
    int i=(int)l; // we have to say to compiler make l is int
    double d = l; // implicit casting done by compiler
       int a=20;
       long b=20;
       b=a; // assigning from right to left==== long type---int type a=b not true// implicit casting
       //explicit casting is assigning bigger data type to smaller one
       // int data type     long data type
            a            =    (int) b;// explicit casting

        // number+number=number ===>>>> addition
        /* int+int=int
        double+int=double
        int + short= int  */
        /** concatenation =====>  String + anything= String */
String adam = "Adam";
        System.out.println(12+35+adam);
         //47Adam


    }

}
