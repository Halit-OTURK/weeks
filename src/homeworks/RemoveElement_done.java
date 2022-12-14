package homeworks;

import java.util.Arrays;

public class RemoveElement_done {
   /*

    18  create a method named removeElement that passes one integer array and one integer, the method removes the integer index from the integer array and returns the new array
			Ex:
				array = {10, 20, 30, 40, 50, 60}
				index = 2


				removeElement(array, index) ==== {10, 20, 40, 50, 60}

*/

    public static int[] removeElement(int [] arr, int a){

        int [] arr2=new int[arr.length-1];
        for (int i = 0; i < arr.length-1; i++) {

            if(i<a){

                arr2[i]=arr[i];
            } else if (i>=a) {

                arr2[i]=arr[i+1];

            }

        }
        return arr2;
    }

    public static void main(String[] args) {

        int[]arr={1,2,3,4,5,6,7};

        arr=removeElement(arr,3);
        arr=removeElement(arr,1);

        System.out.println(Arrays.toString(arr));
    }
}
