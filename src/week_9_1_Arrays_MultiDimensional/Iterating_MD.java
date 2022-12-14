package week_9_1_Arrays_MultiDimensional;

public class Iterating_MD {
    public static void main(String[] args) {
        int [][] arr={{99,98,97},{96,95,94,93},{92,91,90,89,88}};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                System.out.println(arr[i][j]+" ");
            }

        }
    }
}
