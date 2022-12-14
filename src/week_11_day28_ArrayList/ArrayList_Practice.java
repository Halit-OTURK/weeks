package week_11_day28_ArrayList;

import java.util.ArrayList;

public class ArrayList_Practice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        for (int i = 0, j = 2; i < list.size(); i++, j += 2) {

            list.set(i, j);

        }
        System.out.println(list);

        /* SECOND WAY
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) { // i: index numbers of list
            list.set(i ,   list.get(i) *2  );
        }

        System.out.println(list);
         */

        System.out.println("=".repeat(66));

        ArrayList<String> employees = new ArrayList<>();

        employees.add("suat");
        employees.add("hamza");
        employees.add("mert");
        employees.add("yusuf");
        employees.add("gulcan");
        employees.add("gulcan");
        employees.remove(5);
        System.out.println(employees);// [suat, hamza, mert, yusuf, gulcan]
        System.out.println("-".repeat(66));
        boolean b1 = employees.remove("suat");// boolean works only non-primitive
        System.out.println("b1 = " + b1);
        System.out.println(employees);// [hamza, mert, yusuf, gulcan] shifts to the left
        System.out.println("-".repeat(66));
        employees.add("hakan");
        System.out.println(employees);//[hamza, mert, yusuf, gulcan, hakan]
        System.out.println("-".repeat(66));
        employees.remove(employees.size() - 1);
        System.out.println(employees);// [hamza, mert, yusuf, gulcan]

    }
}
