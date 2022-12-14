package week_10_day26_CM_Practice;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class uniqueElement {
    public static int[] uniqueElement(int [] arr){

        int[] result={};

        for (int arr1 : arr) {
            if(ArraysUtility.frequencyOfElement(arr,arr1)==1){
              result= ArraysUtility.addElement(result,arr1);
            }

        }return result;
    }


    public static void main(String[] args) {

        int[] arr={1,1,2,2,3,3,4,5,6,6,7};
                arr=uniqueElement(arr);
        System.out.println(Arrays.toString(arr));


        int[] arr2 = {1,1,2,2,3,3,4,4,5,5,6,6,7,7};
        arr2=uniqueElement(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
