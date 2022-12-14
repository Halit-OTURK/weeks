package week_10_day26_CM_Practice;

public class RemoveElement3 {
    public static int[] removeElement(int [] arr, int a){

        if(a < 0 || a > arr.length-1){
            System.err.println("Invalid Index Number: "+a);
            System.exit(0);
        }

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
}
