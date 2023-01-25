package week_21_day51_Map;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {
    public static void main(String[] args) {
        // student name & score:

        Map<String, Integer> students = new HashMap<>();
        students.put("Aygun", 95);
        students.put("Maria", 95);
        students.put("Ali",95);
        students.put("Alex",96);
        students.put("Ozan",98);
        students.put("Serkan",97);
        students.put("Andriy",98);

        students.put("Ali",85);
        students.put("Ali",86);
        students.put("Ali",87);

        System.out.println(students); // {Alex=96, Andriy=98, Aygun=95, Maria=95, Ozan=98, Serkan=97, Ali=87}

        // size method
        System.out.println(students.size()); // 7


        // display the score of Alex:
        System.out.println(students.get("Alex")); //96


        // replace Ali' score to 90

        students.replace("Ali", 90 );

        System.out.println(students); // {Alex=96, Andriy=98, Aygun=95, Maria=95, Ozan=98, Serkan=97, Ali=90}

        // remove methods

        students.remove("Alex");

        System.out.println(students); // {Andriy=98, Aygun=95, Maria=95, Ozan=98, Serkan=97, Ali=90}

        students.remove("Ozan");

        System.out.println(students); //{Andriy=98, Aygun=95, Maria=95, Serkan=97, Ali=90}


        // containsKey method

        boolean r1 = students.containsKey("Muhtar");
        boolean r2 = students.containsKey("Serkan");
        System.out.println(r1); // false
        System.out.println(r2); // true



        boolean r3 = students.containsValue(97);

        System.out.println(r3); // true


        System.out.println(students.isEmpty()); // false


        System.out.println(">=<".repeat(44));

        // putAll method

        Map<String, Integer> map1 = new HashMap<>();
        map1.putAll(students);

        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(students);


        System.out.println("map1 = " + map1); // map1 = {Andriy=98, Aygun=95, Maria=95, Serkan=97, Ali=90}
        System.out.println("map2 = " + map2); // map2 = {Andriy=98, Aygun=95, Maria=95, Serkan=97, Ali=90}

        System.out.println(map1 ==  map2); // false
        System.out.println(map1.equals(map2)); // true


        // clear method
        map1.clear();
        map2.clear();

        System.out.println(map1); // {}
        System.out.println(map2); // {}





    }
}
