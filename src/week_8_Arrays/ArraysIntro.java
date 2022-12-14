package week_8_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        String[] names = {"ahmet", "murat", "ayse", "okan", "sadi" };
        String[] names2;
        names2 = new String[]{"selim", "hakan", "hasan", "recep", "gizem" };
        String[] names3 = new String[5];
        names3 = new String[]{"a", "b", "c", "d", "e" };
        String[] names4 = new String[5];
        System.out.println(Arrays.toString(names3));
        System.out.println(Arrays.toString(names2));
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(names4));

        System.out.println("==".repeat(55));

        int[] arr = new int[5];
        System.out.println(Arrays.toString(arr));

        /* very important:!!!!!!!!!!!!!!!!!!!!!!!!
        default values:
        non-primitives===> null
        double,float===>0.0
        short,int,byte,char===> 0
        boolean===> false
         */
        double[] d = new double[5];
        boolean[] b = new boolean[5];
        char[] e = new char[5];
        String[] c = new String[5];
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.toString(e));
        System.out.println("==".repeat(55));

        e[0] = 'z';
        e[1] = 'p';
        e[3] = 'r';
        e[4] = 't';
        System.out.println(Arrays.toString(e));
        e[0]='w';
        e[2]='Q';
        System.out.println(Arrays.toString(e));
        System.out.println("==".repeat(55));
        e=new char[]{'1','2','3','4','5','6'};
        System.out.println(Arrays.toString(e));
        System.out.println(e[4]);
        int n=4;
        System.out.println(e[n-2]);
        e[e.length-1]='g';
        System.out.println(e[e.length - 1]);



    }
}
