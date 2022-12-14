package week_6_doWhile;

public class RemoveDublicates {
    public static void main(String[] args) {

        String str ="ssaadddas";
        String result="";

        for (int i = 0; i <str.length() ; i++) {

            char ch = str.charAt(i);

            if (result.contains(""+ ch)){
                continue;            }
            result +=ch;

        }
        System.out.println(result);


    }
}
