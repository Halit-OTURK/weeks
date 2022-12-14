package week_11_day29_ArrayList_CollectionClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str="aaabbbcddefffg";

        ArrayList<String> list= new ArrayList<>(Arrays.asList(str.split("")));//!!!!!!!!!! string converts to arraylist

      /*  String[]arr=str.split("");
        ArrayList<String> list=new ArrayList<>(arr);
        second way
    */

        System.out.println(list);

        String unique = "";

        for (String each : list) {

            int frequency =  Collections.frequency(list, each);
            if(frequency == 1){
                unique += each;
            }

        }


        System.out.println("unique = " + unique);

    }
}
