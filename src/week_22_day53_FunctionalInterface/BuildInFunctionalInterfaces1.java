package week_22_day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class BuildInFunctionalInterfaces1 {
    public static void main(String[] args) {

        // PREDICATE - BOOLEAN

        Predicate<String> isPalindrome = (p) -> {
            String reverse = new StringBuilder(p).reverse().toString();
            return p.equalsIgnoreCase(reverse);
        };

        boolean b1 = isPalindrome.test("java");
        System.out.println(b1);

        System.out.println(isPalindrome.test("racecar"));

        Predicate<Integer> isEven = p -> p % 2 == 0;

        boolean ba = isEven.test(654654);
        System.out.println(ba);

        System.out.println("==>".repeat(41));

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3));
        // list.removeIf(p -> p % 2 == 0);
        list.removeIf(isEven);

        System.out.println(list);
        System.out.println("==>".repeat(41));

        List<String> pal = new ArrayList<>();
        pal.addAll(Arrays.asList("Level", "Anna", "Java", "Python"));

        pal.removeIf(isPalindrome);

        System.out.println(pal);

        System.out.println("==>".repeat(41));

        //CONSUMER - VOID

        Consumer<String> printEach = (s) -> {
            for (int i = 0; i < s.length(); i++) {
                System.out.println(s.charAt(i));
            }
        };

        printEach.accept("Java");
        printEach.accept("Python");

        System.out.println("==>".repeat(41));

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 34, 5, 6, 7, 8, 9));

         /*
        for (Integer each : list2) {
            if(each % 2 != 0){
                System.out.println(each);
            }
        }
    */

        list2.forEach(p -> {
            if (p % 2 == 0) System.out.println(p);
        });


        System.out.println("==>".repeat(41));

        List<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Anel Adilbayeva", "Aygun Abbasova Jarullah", "Jilili Jiwuer", "Ali Ismayilov"));

        employees.forEach(p -> System.out.println(p.charAt(0) + "." + p.charAt(p.lastIndexOf(" ") + 1)));

        System.out.println("==>".repeat(41));

        // FUNCTION - 2 parameters

        Function<int[], List<Integer>> convert = f -> {
            List<Integer> result = new ArrayList<>();
            for (int each : f) {
                result.add(each);
            }
            return result;
        };

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> list3 = convert.apply(arr);
        System.out.println(list3);


        System.out.println("==>".repeat(41));

        Function<List<Integer>, int[]> convertToArray = (a) -> {
            int[] result = new int[a.size()];
            for (int i = 0; i < a.size(); i++) {
                result[i] = a.get(i);
            }

            return result;
        };

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        int[] result2 = convertToArray.apply(numbers);

        System.out.println(Arrays.toString(result2));




    }
}
