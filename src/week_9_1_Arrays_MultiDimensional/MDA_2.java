package week_9_1_Arrays_MultiDimensional;

import java.util.Arrays;

public class MDA_2 {
    public static void main(String[] args) {

//                      -element 1(0)-   -        element 2(1)             -  e1(0)  e2(1)      e1(0)
        int[][][] arr3d = {{{1}, {2}, {3}}, {{4}, {5, 6, 7}, {8, 9, 10, 11, 12, 13}}, {{14}, {15}}, {{16}}};
        //                  1.dimension (0)                                  2.dimension(1)   3.dimension(2)

        System.out.println(arr3d[0][0][0]);
        System.out.println(arr3d[1][1][1]);
        System.out.println(arr3d[2][1][0]);
        System.out.println(Arrays.toString(arr3d[1][1]));
        System.out.println(Arrays.deepToString(arr3d));

        System.out.println("=".repeat(33));

        for (int[][] each2d : arr3d) {
            for (int[] each1d : each2d) {
                for (int element : each1d) {
                    System.out.print(element+" ");

                }

            }

        }
    }
}
