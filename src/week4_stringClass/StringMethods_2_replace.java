package week4_stringClass;

public class StringMethods_2_replace {
    public static void main(String[] args) {

        String str=" java so funny and i like learning java";
        str = str.replace("java","math");
        System.out.println("str = " + str);
        System.out.println("=======================================================");
        String email="halit@hotmail.com";
        String email2=email.replace("hotmail","gmail");
        System.out.println("email = " + email);
        System.out.println("email2 = " + email2);// we want two email addresses. similar 1 and 2 addresses we can use this type
        System.out.println(" ======================================================" );
        String spaces="a       a";
        spaces = spaces.replace("     "," ");//change decrease spaces
        /* if you want change second third etc. word. you can write left or right unique characters.*/
        System.out.println(spaces);
        System.out.println("========================================================");
        // replaceFirst methods has 1 difference to replace method that method change first matching only
        String first="abu ci ci ci";
        first=first.replaceFirst("abu","A bu");
        System.out.println("first = " + first);


    }
}
