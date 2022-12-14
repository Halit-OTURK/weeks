package week_10_day27_WrapperClasses;

public class W_C_Methods {
    public static void main(String[] args) {

        String str="123";

       int num= Integer.parseInt(str);
        System.out.println(num+1);//124
        System.out.println(str+1);//1231

        System.out.println("=".repeat(66));
        String str2="12.34";

        double d1=Double.parseDouble(str2);
        System.out.println(d1+1);//13.34
        System.out.println("=".repeat(66));

        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        long max2=Long.MAX_VALUE;
        long min2=Long.MIN_VALUE;


        System.out.println("max2 = " + max2);
        System.out.println("min2 = " + min2);

        String s1="true";

        boolean b1= Boolean.parseBoolean(s1);
        System.out.println(b1);

        System.out.println("-".repeat(77));

        String s2="maybe";

        boolean b2= Boolean.parseBoolean(s2);
        System.out.println(b2);

        System.out.println("=".repeat(66));

        String s3="123";
        Integer x=Integer.valueOf(s3);
        int y=Integer.valueOf(s3);
        System.out.println(x);
        System.out.println(y);
        System.out.println("=".repeat(66));

        char ch1= '0';

        boolean b3= Character.isDigit(ch1);
        boolean b4=Character.isLetter(ch1);
        boolean b5=Character.isAlphabetic(ch1);
        boolean b6=Character.isLetterOrDigit(ch1); //special char
        boolean b7=Character.isUpperCase(ch1);
        boolean b8=Character.isLowerCase(ch1);

        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(b6);
        System.out.println(b7);
        System.out.println(b8);

     System.out.println("=".repeat(66));

     String s = "ab1cde2efg3hi4";

     int sum = 0;

     for (char each : s.toCharArray()) {

      if( Character.isDigit(each) ){
       sum +=  Integer.parseInt(""+each);
      }

     }

     System.out.println("sum = " + sum);//10

    }
}
