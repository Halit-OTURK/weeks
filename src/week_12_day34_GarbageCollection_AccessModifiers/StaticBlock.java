package week_12_day34_GarbageCollection_AccessModifiers;

public class StaticBlock {
    public static void main(String[] args) {

        System.out.println("main method");
    }

    static {
        System.out.println("static method 1");//runs first before anything, and only runs one time
    }

    static {
        System.out.println("static method 2");
    }

    static {
        System.out.println("static method 3");
    }
}
/*
static method 1
static method 2
static method 3
main method

 */