package week_5_for;

import java.util.Scanner;

public class Remove_duplicates {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        System.out.println("enter your sentence: ");
        String dub= inp.nextLine();
        String rem = "";
        for (int i = dub.length()-1; i>=0; i--) {
            String ch = ""+ dub.charAt(i); // due to contain methods run char have to turn String.
                                          // ""+ ==> concatenate all type to convert String
            if(!rem.contains(ch)){// if rem value don't include ch value
                rem+=ch;
            }

        } System.out.println(rem);





       /* for (int i =0;  i<=dub.length()-1; i++) {
            String ch = ""+ dub.charAt(i); // due to contain methods run char have to turn String.
            // ""+ ==> concatenate all type to convert String
            if(!rem.contains(ch)){// if rem value don't include ch value
                rem+=ch;
            }

        } System.out.println(rem);*/
    }
}
