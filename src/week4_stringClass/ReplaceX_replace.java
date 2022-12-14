package week4_stringClass;

public class ReplaceX_replace {
    public static void main(String[] args) {
        String str= "xcodeX";
        str= str.replace('x','a').replace('X','a').replace('c','C');
        System.out.println(str);


        str = str.substring(0,5).toUpperCase() + str.substring(5).toLowerCase();
        System.out.println(str);
        str = str.substring(0,5).toUpperCase() + str.substring(5).toLowerCase()+(""+str.charAt(0)).toLowerCase();
        // (""+str.charAt(0)) ===>>> "" and () must use
        // uppercase and lowercase methods about String can't use char
        System.out.println(str);
    }
}
