package class_myClass4;

import java.time.LocalDate;

public class Students {

   public String name;
   public int Id;
   public char gender;
   public int birthyear;
   public char [] answer = new char[10];




    public Students(String name, int id, char gender, int birthyear) {
        this.name = name;
        this.Id = id;
        this.gender = gender;
        this.birthyear = birthyear;

    }

    public void getScore (){
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int count=0;

        for (int i = 0; i < answer.length; i++) {
            if(answer[i]==keys[i]){
                count++;
            }

            }System.out.println("your correct answers : "+ count+ " and your points" +(10*count));
        }


        public void age(){

            int age = LocalDate.now().getYear()-birthyear;
            System.out.println("age = " + age);
        }


    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                ", gender=" + gender +
                ", age=" + (2022-birthyear) +
                '}';
    }
}
/* getscore,questionNumbers,age */