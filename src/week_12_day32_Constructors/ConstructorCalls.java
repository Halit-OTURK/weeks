package week_12_day32_Constructors;

public class ConstructorCalls {

public  ConstructorCalls(){


    System.out.println("Deafult Constructor");
}

public ConstructorCalls(int a){

    this();
    System.out.println("constructor with int argument");
}
    public ConstructorCalls(String str){
        this(10); //Default Constructor ,  Constructor with int argument
        System.out.println("Constructor with String argument");
    }


    public static void main(String[] args) {

        ConstructorCalls obj1 = new ConstructorCalls();

        System.out.println("=".repeat(55));

        ConstructorCalls obj2 = new ConstructorCalls(10);

        System.out.println("=".repeat(55));

        ConstructorCalls obj3= new ConstructorCalls("Java");


    }





}
