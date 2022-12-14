package class_myClass4;

import java.util.Arrays;

public class Student_main {

    public static void main(String[] args) {

        Students student9 = new Students("hamza",7898,'m',2016);
        char[] answer1 = {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'};
        student9.answer= answer1;

        Students student2 = new Students("Kaan", 135, 'M', 2006);
        char[] answer2 = {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'};
        student2.answer = answer2;

        Students student3 = new Students("Selin", 144, 'F', 2007);
        char[] answer3 = {'B', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'};
        student3.answer = answer3;

        Students student4 = new Students("Cem", 111, 'M', 2006);
        char[] answer4 = {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'};
        student4.answer = answer4;

        Students student5 = new Students("Gül", 175, 'F', 2008);
        char[] answer5 = {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'};
        student5.answer = answer5;

        Students student6 = new Students("Hulya", 126, 'F', 2006);
        char[] answer6 = {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'};
        student6.answer = answer6;

        Students student7 = new Students("Can", 113, 'M', 2008);
        char[] answer7 = {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'};
        student7.answer = answer7;

        Students student8 = new Students("Ayse", 188, 'F', 2006);
        char[] answer8 = {'E', 'B', 'E', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        student8.answer = answer8;


       Students[] students= {student2,student9,student3,student7,student4,student5,student6,student8};
       Class4 group4 = new Class4("group 4");

       group4.class4.addAll(Arrays.asList(student2,student9,student3,student7,student4,student5,student6,student8));
// yeni sınıf.üst sınıf cons

        System.out.println(group4);


    }
}
