package week_8_Arrays_2;

import java.util.Arrays;

public class Utility {
    public static void main(String[] args) {

        int[] num = {2, 1, 5, 4, 3};
        System.out.println(Arrays.toString(num));
        // toString method convert tha array object(single dimensional) to string,returns string
        System.out.println(num[0]); // num[0] not array, it is an object in array
        //sort(); sort method sort the array ascending order

        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        System.out.println("min:" + num[0]);
        System.out.println("max:" + num[num.length - 1]);

        String[] abc = {"b", "d", "a", "c"};
        Arrays.sort(abc);
        System.out.println(Arrays.toString(abc));
        //equals(array1,array2);
        int[] nums = {5, 2, 3, 4, 1};
        boolean a = Arrays.equals(num, nums);
        System.out.println(a);
        Arrays.sort(num);
        Arrays.sort(nums);
        boolean b = Arrays.equals(num, nums);
        System.out.println(b);






    }
}
