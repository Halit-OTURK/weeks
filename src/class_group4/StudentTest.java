package class_group4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class StudentTest {
    public static void main(String[] args) {
        Students student1 = new Students("Ahmet", 123, 'M', 15);
        char[] answer1 = {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'};
        student1.answer = answer1;

        Students student2 = new Students("Kaan", 135, 'M', 16);
        char[] answer2 = {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'};
        student2.answer = answer2;

        Students student3 = new Students("Selin", 144, 'F', 15);
        char[] answer3 = {'B', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'};
        student3.answer = answer3;

        Students student4 = new Students("Cem", 111, 'M', 16);
        char[] answer4 = {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'};
        student4.answer = answer4;

        Students student5 = new Students("Gül", 175, 'F', 14);
        char[] answer5 = {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'};
        student5.answer = answer5;

        Students student6 = new Students("Hulya", 126, 'F', 16);
        char[] answer6 = {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'};
        student6.answer = answer6;

        Students student7 = new Students("Can", 113, 'M', 14);
        char[] answer7 = {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'};
        student7.answer = answer7;

        Students student8 = new Students("Ayse", 188, 'F', 16);
        char[] answer8 = {'E', 'B', 'E', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        student8.answer = answer8;

        Students [] studentss = {student1,student8,student6,student2,student3,student4,student5,student7};

        StudentClass class1 = new StudentClass("group-4");
        class1.students.addAll(Arrays.asList(student1,student8,student6,student2,student3,student4,student5,student7));

        StudentClass class2 = new StudentClass("group-4");
        class2.students.addAll(Arrays.asList(student1,student8,student6,student2,student3,student4,student5,student7));

        Collections.reverse(class1.students);
        System.out.println(class1);
        Collections.swap(class1.students, 0 ,2);
        System.out.println(class1);

        

    }

}