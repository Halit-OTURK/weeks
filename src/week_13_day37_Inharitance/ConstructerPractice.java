package week_13_day37_Inharitance;

/*

class A{

    public A(){
        System.out.println("A");
    }
}

class B extends A {

    public B(){

        System.out.println("B");
    }
}

*/

class A{

    public A(int a){
        System.out.println("A");
    }
}

class B extends A {

    public B(){
        super(9);

        System.out.println("B");
    }
}




public class ConstructerPractice {

    public static void main(String[] args) {

    /*    B ob= new B();
        System.out.println(ob); => A B */



    }
}
