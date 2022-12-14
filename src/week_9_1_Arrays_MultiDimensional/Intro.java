package week_9_1_Arrays_MultiDimensional;

import java.util.Arrays;

public class Intro {
    public static void main(String[] args) {
         String [] a={"z","y","v"}; // !!!! .toString methods only one dimensional arrays
         String [] b={"a","b","c"};
         String [] c={"d","e","f"};

         String[][]d=new String[3][];
         d[0]=a;
         d[1]=b;
         d[2]=c;

        System.out.println(Arrays.deepToString(d));

        System.out.println("=".repeat(33));

   //index of element  0   1  2    0  1  2  3   0  1  2  3  4
        int [][] arr={{99,98,97},{96,95,94,93},{92,91,90,89,88}};
     // index of array     0            1               2

        System.out.println("=".repeat(33));

//                      -element 1(0)-   - element 2(1)            -  e1(0) e2(1)  e1(0)
        int [][][]arr3d={{{1},{2},{3}},{{4},{5,6,7},{8,9,10,11,12,13}},{{11},{12}},{{13}}};
     //                  1.dimension                                 2.dimension 3.dimension
    //
        System.out.println(arr3d[2][1][0]);
        System.out.println(Arrays.toString(arr3d[1][1]));
        System.out.println(Arrays.deepToString(arr3d));

        System.out.println("=".repeat(33));

        int[][][]arr2=new int[3][3][3];
        System.out.println(Arrays.deepToString(arr2));

        System.out.println("=".repeat(33));



    }
}
