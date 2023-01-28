package week_21_day51_Map;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "bbcccaaaaa";

        String[] arr = str.split("");

        Map<String, Integer> result = new LinkedHashMap<>();

        for (String each : arr) {
            int frequency = Collections.frequency(Arrays.asList(arr), each);
            result.put(each, frequency);

        }

        System.out.println(result);

    }
}

/*
2. Write a program that can return the frequency of characters


        Ex: str = "bbcccaaaaa"

        output:
            {b=2, c=3, a=5}
 */