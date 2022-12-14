package week_11_day31_Constructors;

public class StudentObjects {
    public static void main(String[] args) {


Student s1=new Student("Yusuf", 'm', 22, 15874, 'A');
Student s2=new Student("Gülcan", 'f', 33, 85479, 'B');

        System.out.println(s1); //Student{name='Yusuf', age=22, gender=m, grade=A, id=15874}
        System.out.println(s2); //Student{name='Gülcan', age=33, gender=f, grade=B, id=85479}
        System.out.println("<=>".repeat(44));
        s2.grade='A';
        s1.age=24;
        System.out.println(s1);//Student{name='Yusuf', age=24, gender=m, grade=A, id=15874}
        System.out.println(s2);//Student{name='Gülcan', age=33, gender=f, grade=A, id=85479}

    }
}
