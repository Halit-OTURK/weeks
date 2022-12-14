package week_11_day29_ArrayList_CollectionClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPracatice1 {

    public static void main(String[] args) {
        String[] countries = {"Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada",};

        ArrayList<String> country = new ArrayList<>(Arrays.asList(countries));

        country.removeIf(p -> p.length() >= 10);
        System.out.println(country);    //[Japan, Korea, Turkey, Canada] => ArrayList
        countries=country.toArray(new String[0]);// number is not important 0 or 1 or 2 could be

        System.out.println(Arrays.toString(countries)); // [Japan, Korea, Turkey, Canada] => Array




    }
}
