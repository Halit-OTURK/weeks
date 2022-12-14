package class_myClass4;

import java.util.ArrayList;

public class Class4 {

    public String name;
    public int numberOfStudent;

   public static String schoolName="Cydeo";
   public ArrayList<Students> class4=new ArrayList<>();

    public Class4(String name) {
        this.name = name;
    }

    public void getScores(){
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        for (Students student : class4) {
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

        class4.add(student);
    }

    public void setNumberOfStudent(){

        System.out.println(class4.size());
    }

    public void getMaleStudent(Students[] ss){
        for (int i = 0; i<ss.length; i++)
            if(ss[i].gender=='M'){
                class4.add(ss[i]);
            }
    }
    public void getFemaleStudent(Students[] ss){
        for (int i = 0; i<ss.length; i++)
            if(ss[i].gender=='F'){
                class4.add(ss[i]);
            }
    }

    public String getNames(){
        String result="";
        for (Students student : class4) {
            result+=student.name+", ";
        }
        return result;
    }
    public void questionNumber(int n){
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        for (Students student : class4) {
            if(student.answer[n]==keys[n]){
                System.out.println(student.name + " gave right answer");
            }else {
                System.out.println(student.name + " gave wrong answer");
            }
        }
    }

    public void howMany(int num) {
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int count =0;
        for (Students student : class4) {
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
            for (Students each : class4) {
                if (each.answer[i] == keys[i]) {
                    count++;
                }
            }
            System.out.println("question" + (i + 1) + " :  " + count);
            count = 0;
        }
    }




    public String toString() {
        return "Class4{" +
                "name='" + name + '\'' +
                ", numberOfStudent=" + numberOfStudent +
                ", class4=" + class4 +
                '}';
    }
}
