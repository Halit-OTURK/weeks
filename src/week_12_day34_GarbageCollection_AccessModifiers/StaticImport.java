package week_12_day34_GarbageCollection_AccessModifiers;

import static week_12_day34_GarbageCollection_AccessModifiers.Circle.numbers;
import static  week_12_day34_GarbageCollection_AccessModifiers.Circle.pi; // !!!!!

public class StaticImport {

    public static void main(String[] args) {
        System.out.println(Circle.pi);
        System.out.println(pi);
        System.out.println(Circle.name);
        System.out.println(numbers);

    }
}
