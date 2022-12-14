package week_11_day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        // ADD METHOD

        numbers.add(10);
        numbers.add(100);
        numbers.add(1000);//add after next method [10,100,100]
        System.out.println(numbers);
        // numbers.add(5,1000);// IndexOutOfBoundsException
        numbers.add(2, 50); // [10, 100, 50, 1000] => shifts to the right
        System.out.println(numbers);

        System.out.println("=".repeat(66));

        // SIZE METHOD
        System.out.println(numbers.size()); // give size of the Arraylist
        int lastIndex = numbers.size() - 1;// last index of the Arraylist
        System.out.println("lastIndex = " + lastIndex);

        System.out.println("=".repeat(66));

        // GET METHOD

        int num = numbers.get(2);// the method give us to index number's element
        System.out.println(num);// 50

        System.out.println("=".repeat(33));

        for (int i = 0; i < numbers.size(); i++) {

            System.out.print(numbers.get(i) + ", ");//10, 100, 50, 1000

            System.out.println("=".repeat(88));

            // SET METHOD

            ArrayList<String> list = new ArrayList<>();
            list.add("java");
            list.add("phyton");
            list.add("java");
            list.add("C++");
            list.add("ruby");
            System.out.println(list);//[java, phyton, java, C++, ruby]
            list.set(2, "C#");
            System.out.println(list); // like replace method-replaces the element given index---[java, phyton, C#, C++, ruby]

            System.out.println("=".repeat(88));




        }


    }
}
