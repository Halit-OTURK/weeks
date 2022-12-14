package week_11_day31_Constructors;

public class PersonObjects {
    public static void main(String[] args) {

        Person p1=new Person("Gülcan",'f',34);
        Person p2=new Person("Hamza Mert",'m',9);

        p2.age=6;

        System.out.println(p1);
        System.out.println(p2);
    }
}
