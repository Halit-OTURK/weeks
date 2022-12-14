package week_9_1_Arrays_MultiDimensional;

public class MD_2 {
    public static void main(String[] args) {
        int [][] arr={{99,98,97},{96,95,94,93},{92,91,90,89,88}}; // only reverse dimension's element

        for (int i = arr.length - 1; i >= 0; i--) {

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("=".repeat(44));

        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i].length - 1; j >= 0; j--) {

                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    
    }
}
