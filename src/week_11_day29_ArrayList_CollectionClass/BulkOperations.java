package week_11_day29_ArrayList_CollectionClass;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        // Arrays.asList
        // removeAll Method

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 8, 9, 10, 3, 3, 3, 5, 5, 5, 8, 8, 8));

        System.out.println(list);

        list.removeAll(Arrays.asList(3, 5, 8));//remove 3-5-8
        System.out.println(list);

        System.out.println("=>".repeat(44));

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.addAll(Arrays.asList(100, 200, 300, 400, 500, 600, 700, 100, 200, 300, 800, 900));


        // retainAll Method
        System.out.println(list1);
        list1.retainAll((Arrays.asList(100, 200, 300)));
        System.out.println(list1);

        System.out.println("=>".repeat(44));

        // containsAll Method

        ArrayList<String> jobTitles = new ArrayList<>();

        jobTitles.addAll(Arrays.asList("QA", "SDET", "developer", "QA", "SDET", "Scrum Master", "BA", "BA"));

        jobTitles.retainAll(Arrays.asList("QA", "SDET"));

        System.out.println(jobTitles);

        System.out.println("--".repeat(44));

        ArrayList<Integer> nums = new ArrayList<>();

        nums.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        boolean b1 = nums.contains(10);
        boolean b2 = nums.containsAll(Arrays.asList(5, 6, 7, 8, 1));
        boolean b3 = nums.containsAll(Arrays.asList(5, 6, 7, 8, 11));
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        System.out.println("=>".repeat(44));

        String[] names = {"hamza", "mert", "gülcan", "yusuf", "osman"};

        ArrayList<String> namelist = new ArrayList<>(Arrays.asList(names)); //1.way

        // namelist.addAll(Arrays.asList(names)); => 2.way

        System.out.println(namelist);

        System.out.println("=>".repeat(44));

        // int[]arr={1,2,3,4,5,6,7,8,9}; we can't use bulk operations

        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(arr));

        System.out.println(numbers);

        System.out.println("=>".repeat(44));


        int[] array={10,11,12,13,14,15,16,17};

        ArrayList<Integer> list3=new ArrayList<>(convertArrayToArrayList(array));// we write own method to add

        System.out.println(list3);
    }


    public static ArrayList<Integer> convertArrayToArrayList(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {

            list.add(each);

        }


        return list;
    }
}
