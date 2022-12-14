package week_9_1_Arrays_MultiDimensional;

import java.util.Arrays;

public class Tasks {

    public static void main(String[] args) {
        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };

        for (String []d1:items) {
            for (String a:d1) {

                System.out.print(a+"\t");

            }
            System.out.println();
        }


        for (String[] D1:items) {

            for (int i = D1.length-1; i >=0 ; i--) {

                System.out.print(D1[i]+"\t");
                
            }

            System.out.println();
            
        }

        for (int i = items.length-1; i >=0 ; i--) {

            String [] each=items[i];

            for (int j = each.length-1; j >=0 ; j--) {

                System.out.print(each[j]+"\t");

            }
            System.out.println();
        }

        System.out.println("=".repeat(88));

        int[] a = {1, 3};
        int[] b = {2, 4};
        int[] c = {1, 5};
        int i = 0;

        int []wordmerge= new int[6];
        for (int each :a) {
            wordmerge[i++] = each;
        }
        for (int each : b) {
            wordmerge[i++] = each;
        }

        for (int each : c) {
            wordmerge[i++] = each;
        }
        System.out.println(Arrays.toString(wordmerge));
        Arrays.sort(wordmerge);
        System.out.println(Arrays.toString(wordmerge));    }
}
