package week_21_day51_Map;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {
     /* Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>(); // Key can not be null, value can be null and duplicated
        Map<Integer, String> hashtable = new Hashtable<>(); // key and value both can not null

*/

        Map<Integer, String> names = new HashMap<>();
        names.put(1, "Hamza");
        names.put(2, "Yusuf");
        names.put(3, "Ali Osman");
        names.put(4, "Gulcan");
        names.put(null, "Gulcan");
        names.put(8, null);
        names.put(null, "Gulcan");
        names.put(7, null);

        System.out.println("HashMap = " + names); //HashMap = {null=Gulcan, 1=Hamza, 2=Yusuf, 3=Ali Osman, 4=Gulcan, 7=null, 8=null}

        System.out.println(names.get(4)); // => Gulcan


        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(10, "Arthur");
        linkedHashMap.put(20, "George");
        linkedHashMap.put(3, "Jack");
        linkedHashMap.put(40, "Emma");
        linkedHashMap.put(5, "Ahmet");
        linkedHashMap.put(5, "Isabella");
        linkedHashMap.put(null, "Hulya");

        System.out.println("linkedHashMap = " + linkedHashMap); //linkedHashMap = {10=Arthur, 20=George, 3=Jack, 40=Emma, 5=Isabella, null=Hulya}

        Map<Integer, String> treeMap = new TreeMap<>(); // Key can not be null, value can be null and duplicated
        treeMap.put(10, "Arthur");
        treeMap.put(20, "George");
        treeMap.put(3, "Jack");
        treeMap.put(40, "Emma");
        treeMap.put(5, "Ahmet");
        treeMap.put(5, "Isabella");
        treeMap.put(7, null);

        System.out.println("treeMap = " + treeMap); // treeMap = {3=Jack, 5=Isabella, 7=null, 10=Arthur, 20=George, 40=Emma}


        Map<Integer, String> hashtable = new Hashtable<>(); // key and value both can not null
        hashtable.put(10, "Arthur");
        hashtable.put(20, "George");
        hashtable.put(3, "Jack");
        hashtable.put(40, "Emma");
        hashtable.put(5, "Ahmet");
        hashtable.put(5, "Isabella");
        // hashtable.put(6, null); =>  NullPointerException

        System.out.println("hashtable = " + hashtable); // hashtable = {10=Arthur, 20=George, 40=Emma, 5=Isabella, 3=Jack}


        //   String str = null;
        // System.out.println(str.toUpperCase());

    }}
/*
browser   chrome
url
username   cydeo
password  cydeo123



 */


