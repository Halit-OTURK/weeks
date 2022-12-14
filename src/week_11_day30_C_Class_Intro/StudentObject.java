package week_11_day30_C_Class_Intro;

import java.util.ArrayList;

public class StudentObject {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();

        s1.setInfo("Yusuf", 'm', 22, 15874, 'A');
        s2.setInfo("Hamza Mert", 'm', 7, 78456, 'A');
        s3.setInfo("Gülcan", 'f', 33, 85479, 'B');
        s4.setInfo("Ali Osman", 'm', 30, 24598, 'C');
        s5.setInfo("Feyza",'f',5,66884,'B');

      /*  System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
    */


        Student [] students={s1,s2,s3,s4,s5};
        for (Student stu : students) {

            System.out.println(stu);

            System.out.println(">=<".repeat(33));


            ArrayList<Student>earlyBirds=new ArrayList<>();
            ArrayList<Student>angryBirds=new ArrayList<>();
            for (Student student : students) {

                if(student.grade == 'A'){
                    earlyBirds.add(student);
                }else{
                    angryBirds.add(student);
                }

            }

            System.out.println(earlyBirds);
            System.out.println(angryBirds);




        }
    }
}
