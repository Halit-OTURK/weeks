package week_12_day34_GarbageCollection_AccessModifiers;

public class AccessModifiersTest {


    public static void main(String[] args) {

        System.out.println( AccessModifiers.publicData ); // 100
        System.out.println( AccessModifiers.defaultData ); // 200
        //    System.out.println( AccessModifiers.privateData ); // private is not visible outside the class- compiler give error

        AccessModifiers.method1(); // Public
        AccessModifiers.method2(); // Default
        // AccessModifiers.method3(); // private is not visible outside the class


    }

}
