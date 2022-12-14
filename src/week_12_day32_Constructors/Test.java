package week_12_day32_Constructors;

public class Test {

    public Test() {
        System.out.println("A");
    }

    public Test(int a) { // A B
        this(); // => link first cons
        System.out.println("B");
    }

    public Test(double b) { // A B C
        this(10); //!!!! => link first and second cons
        System.out.println("C");
    }

    public Test(String c) { // A B C D
        this(2.5); // !!! ==> link all cons
        System.out.println("D");
    }


    public static void main(String[] args) {

        new Test();
        System.out.println("=".repeat(55));
        new Test(5);
        System.out.println("=".repeat(55));
        new Test(4.5);
        System.out.println("=".repeat(55));
        new Test("pppp");
    }
}
