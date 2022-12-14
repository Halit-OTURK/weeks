package class_group4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentClass {
    public String name;
    public int numberOfStudent;
    public static String schoolName="Cydeo School";
    public ArrayList<Students> students = new ArrayList<>();

    public StudentClass(String name) {
        this.name = name;

    }

   public int numberOfStudent(){
       return students.size();
    }

    public void getScores(){
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        for (Students student : students) {
        int count =0;
        String result="";

        for (int i = 0; i < student.answer.length; i++) {
            if(student.answer[i]==keys[i]){
                count++;

            }else{
                result+=(i+1)+" ";
            }
        }
        System.out.println(student.name + " has " + count + " correct answer and gets " + (count*10)+ "points" + " questions " + result + " are wrong");
    }
    }
    public void getStudent(Students student){

        students.add(student);
    }
    public void getMaleStudent(Students [] studentss){
        for (int i = 0; i<studentss.length; i++)
        if(studentss[i].gender=='M'){
            students.add(studentss[i]);
        }
    }
    public void getFemaleStudent(Students [] studentss){
        for (int i = 0; i<studentss.length; i++)
            if(studentss[i].gender=='F'){
                students.add(studentss[i]);
            }
    }

    public String getNames(){
        String result="";
        for (Students student : students) {
            result+=student.name+", ";
        }
        return result;
    }

    public void questionNumber(int n){
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        for (Students student : students) {
            if(student.answer[n]==keys[n]){
                System.out.println(student.name + " gave right answer");
            }else {
                System.out.println(student.name + " gave wrong answer");
            }
        }
    }
    public void getAges(){
        for (Students student : students) {
            System.out.println(student.name+ " is " + student.age + " years old");
        }
    }
    public void howMany(int num) {
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int count =0;
        for (Students student : students) {
            if(student.answer[num]==keys[num]){
               count++;
            }
        }
        System.out.println(count + " students gave right answer");
    }
    public void analyze() {
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int count = 0;
        for (int i = 0; i < keys.length; i++) {
            for (Students each : students) {
                if (each.answer[i] == keys[i]) {
                    count++;
                }
            }
            System.out.println("question" + (i + 1) + " :  " + count);
            count = 0;
        }
    }
    public  void dateOfBorn(){
        for (Students student : students) {
            System.out.println(student.name + " was born in " + (LocalDate.now().getYear()-student.age));
        }
    }
    public String toString() {
        return "StudentClass{" +
                "name='" + name + '\'' +
                "school name='" + schoolName + '\'' +
                ", number of student=" + numberOfStudent() +
                ", students=" + getNames() +
                '}';
    }
}

