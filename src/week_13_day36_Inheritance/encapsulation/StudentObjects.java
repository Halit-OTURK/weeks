package week_13_day36_Inheritance.encapsulation;

public class StudentObjects {
    public static void main(String[] args) {

        Student st1=new Student("hakan",2,'U','Q',"Ankara");

        System.out.println(st1);

        st1.setAge(25);
        st1.setGrade('A');
        st1.setGender('M');
        System.out.println(st1);
    }



}
