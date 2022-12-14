package week_13_day35_Encapsulation.encapsulation;

public class PersonObjects {

    public static void main(String[] args) {

        Person p1 = new Person();

        // p1.name="Daniel";
        // p1.age=33;

        p1.setName("Daniel");
        p1.setAge(33);

        //   p1.name = "";
        //   p1.age = 2000;
        // p1.setAge(-2222);  invalid age: -2222

        // System.out.println(p1.name+":"+p1.age);
        System.out.println(p1.getName() + ":" + p1.getAge());


    }


}
