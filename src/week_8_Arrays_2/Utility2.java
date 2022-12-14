package week_8_Arrays_2;

import java.util.Arrays;

public class Utility2 {
    public static void main(String[] args) {
        //copyOf(array,newlength); method-always start first element
String [] students={"ahmet","mustafa","derin","selim","serkan"};
String [] student2= Arrays.copyOf(students,2);
String [] student2a= Arrays.copyOf(students,8);
        //copyOfRange(array,start index,finish index); method
String [] student3= Arrays.copyOfRange(students,2,4);
        System.out.println(Arrays.toString(student2));
        System.out.println(Arrays.toString(student2a));
        System.out.println(Arrays.toString(student3));




    }
}
