package week4_stringClass;

public class StringMethods_3_substringMethod {
    public static void main(String[] args) {
        // substring(beginning index ,ending index)
        String sentence=" i like the moving moving";
        String brand= sentence.substring(0,9+1);// because index numbers start 0
        String brand2=sentence.substring(4);
        System.out.println(brand+"-"+brand2);
        String brand3= sentence.substring(0, sentence.indexOf(" mo")+1);// we use that when we can't count our end case index number
        String brand4= sentence.substring(5, sentence.lastIndexOf(" mo")+1);// difference type
        System.out.println(brand3);
        System.out.println("brand4 = " + brand4);


    }


}
