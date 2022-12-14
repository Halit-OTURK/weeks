package RecursiveMethod;

public class RecursiveMethod_isPolindrome {

    private static boolean isPalindrome(String str){

if (str.length()==0|| str.length()==1)
    return true;
else {
    if (str.substring(0,1).equalsIgnoreCase(str.substring(str.length()-1))){
        return isPalindrome(str.substring(1,str.length()-1));
    }
    else { return false;}
}


    }

    public static void main(String[] args) {

        String str="racecar";
        boolean a= isPalindrome(str);
        System.out.println(a);

        String abc ="wee";

        boolean b=isPalindrome(abc);

        System.out.println(b);
    }
}
