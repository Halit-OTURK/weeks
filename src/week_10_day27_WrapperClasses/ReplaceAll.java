package week_10_day27_WrapperClasses;

public class ReplaceAll {

    public static int [] replaceAll (int[] arr,int old,int element ){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==old){
                arr[i]=element;
            }
        }
return arr;
    }
}
