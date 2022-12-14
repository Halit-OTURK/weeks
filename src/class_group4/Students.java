package class_group4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;


public class Students {
    public String name;
    public int studentID;
    public char gender;
    public int age;
    public char[]answer = new char[10];

    public Students(String name, int studentID, char gender,int age) {
        this.name = name;
        this.studentID = studentID;
        this.gender=gender;
        this.age=age;

    }
    public void getScore(){

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int count =0;
        for (int i = 0; i < answer.length; i++) {
            if(answer[i]==keys[i]){
                count++;
            }
        }
        System.out.println(name + " has " + count + " correct answer");


    }
    public void questionNumber(int n){
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        if(answer[n]==keys[n]){
            System.out.println(name + " gave right answer");
        }else{
            System.out.println(name + " gave wrong answer");
        }
    }
    public void dateOfBorn(){
        System.out.println(name+ " was born in " + (LocalDate.now().getYear()-age));
    }
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentID=" + studentID +
                ", gender=" + gender +
                ", age=" + age +
                ", answer=" + Arrays.toString(answer) +
                       '}';
    }

}
