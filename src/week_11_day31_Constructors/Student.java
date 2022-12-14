package week_11_day31_Constructors;

public class Student {


    public String name;
    public int age;
    public char gender;
    public char grade;
    public int id;

    public Student(String name, char gender, int age,   int id,char grade) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.grade = grade;
        this.id = id;
    }


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", id=" + id +
                '}';
    }
}
