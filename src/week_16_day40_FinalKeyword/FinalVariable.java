package week_16_day40_FinalKeyword;

public class FinalVariable {
    public static void main(String[] args) {

       /* double pi=3.14;
        pi=5.48;
        pi=99.25;
        */

        final double pi =3.14;
       // pi=45.78;   compiler error

        final String name="java";

        // name= " woodeen spoon";  c.error

        FinalVariable obj=new FinalVariable("May/95");
        System.out.println(obj.birthday);

    }

    final String birthday;
    final static String name;
    static {
        name="EU 10";
    }

    public FinalVariable(String birthday) {
        this.birthday = birthday;
    }
}
