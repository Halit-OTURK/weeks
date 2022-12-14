package week_9_2_CustomMethods_VoidMethod;

import week_9_3_CustomM_Returns.R_M_Practice3;

public class CustomMethodPractice2 {

    public static void helloworld() {
        System.out.println("Hello World, ".repeat(5));
        for (int i = 0; i < 5; i++) {

            System.out.println("hello world");

        }
    }
    public static void hellocydeo() {
        System.out.println("Hello Cydeo, ".repeat(5));

        for (int i = 0; i < 5; i++) {

            System.out.println("hello cydeo");

        }
    }

    public static void evenNumber(){

        for (int i = 0; i < 100; i++) {

            if(i%2==0){
                System.out.print(i+" ");
            }

        }

    }
    public static void main(String[] args) {

        helloworld();
        hellocydeo();
        evenNumber();
        System.out.println("=".repeat(33));
        String str="aaaabbbbcccdde";
        R_M_Practice3.Unique(str);

    }

}
