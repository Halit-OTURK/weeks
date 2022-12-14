package week_9_1_Arrays_MultiDimensional;

public class ForEachLoop {

    public static void main(String[] args) {
        int [][] arr={{99,98,97},{96,95,94,93},{92,91,90,89,88}};
        for (int [] arr3dd:arr){

            for (int each:arr3dd){

                System.out.print(each+" ");

            }
        }



    }
}
