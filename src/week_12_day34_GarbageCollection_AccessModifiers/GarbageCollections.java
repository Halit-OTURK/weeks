package week_12_day34_GarbageCollection_AccessModifiers;

import week_11_day30_C_Class_Intro.Dog;
import week_11_day31_Constructors.Student;
import week_12_day32_Constructors.Car;

import java.util.ArrayList;
import java.util.Arrays;


public class GarbageCollections {
    public static void main(String[] args) /*!!!!*/{

// new GarbageCollections().finalize();

        String str="lskdgjvmlaksjgf"; // turn grey after garbage (null method)

        str=null;

        System.out.println(str);


        Car car1=new Car("toyota");// turn grey after garbage (null method)
        car1=null;
        System.out.println(car1); //null

        System.out.println("=>".repeat(33));

        Dog dog1 = new Dog();
        dog1.name = "Lucy";

        dog1  =     new Dog(); // destroy the dog1 object this new keyword-type of garbage
        dog1.name = "Max";

        System.out.println(dog1); // Dog{name='Max', breed='null', gender= , color='null', age=0, size='null'}

        String language = "Python";
        language    =   "Java";  // type of garbage

        System.out.println(language);

        System.out.println("=>".repeat(33));

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(100);

        ArrayList<Integer> list2 = list1 ; // arrayList has two doors-list1 and list2 !!!!!

        list2.addAll(Arrays.asList(200, 300, 400));

        System.out.println(list1); //[100, 200, 300, 400]
        System.out.println(list2);  //[100, 200, 300, 400]

        System.out.println(list1 == list2 ); // true

        System.out.println("=>".repeat(33));

        Student student1 = new Student("Tahir", 'M', 30, 14, 'A');
        student1.grade = 'A';

        Student student2 = student1;
        student2.name = "Ahmet";

        System.out.println(student1); // get same object
        System.out.println(student2); // get same object - same student

        System.out.println("=>".repeat(33));

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Java");

        ArrayList<String> l2 = l1;
        l2.add("Python");


        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);









    }
}
