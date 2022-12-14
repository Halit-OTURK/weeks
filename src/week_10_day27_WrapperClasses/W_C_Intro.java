package week_10_day27_WrapperClasses;

public class W_C_Intro {
    public static void main(String[] args) {
        int num=100;
        Integer n1=num; // autoboxing
        // Double n2=num; compiler give error because Double!=int
        int num2=n1; // unboxing

        System.out.println("--".repeat(55));

        Integer integerValue=100;

        long longvalue= integerValue;
        System.out.println("--".repeat(55));

        int num3=300;
        // Long n3=num3; compiler error=> wrapper class can't assign primitive

        Integer num4=num3;
        System.out.println("--".repeat(55));

        Byte b1=25;
        short s1=b1;
        byte b2=b1;
        long l1=b1;
        int i1=b1;
        System.out.println("--".repeat(55));

        Integer a =100;
        Integer b=a; // not autoboxing not unboxing




    }
}
