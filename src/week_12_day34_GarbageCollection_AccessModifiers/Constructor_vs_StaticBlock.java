package week_12_day34_GarbageCollection_AccessModifiers;

public class Constructor_vs_StaticBlock {

    static {

        System.out.println("static block");
    }

    public Constructor_vs_StaticBlock() {

        System.out.println("public block");
    }

    public static void main(String[] args) {
        System.out.println("main block");

        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();

        /*
        static block
        main block
        public block
        public block
        public block
         */
    }
}
/*
static {

        System.out.println("static block");
    }

    public Constructor_vs_StaticBlock() {

        System.out.println("public block");
    }

    public static void main(String[] args) {
        System.out.println("main block");
    }

    after run


static block
main block
 */