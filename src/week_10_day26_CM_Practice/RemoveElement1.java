package week_10_day26_CM_Practice;

public class RemoveElement1 {

    public static int[] removeElement(int[] arr, int index) {

        if(index<0||index> arr.length-1){
            System.out.println("invalid index: "+index);
            System.exit(0);
        }

        int[] result = new int[arr.length - 1];
        for (int each : arr) {
            int j = 0;
            if (each == arr[index]) {
                continue;
            }
            result[j++] = each;
        }

        return result;
    }
}
