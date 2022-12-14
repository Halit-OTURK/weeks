package week_13_day37_Inharitance.scrumTask;

public class Person {

    public String name;
       public  int age;
    public char gender;
    public Person(String name, int age, char gender) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void eat(String food){
        System.out.println(name + " is eating "+food );
    }




    public void drink(String drink){
        System.out.println(name + " is drinking "+drink);
    }



    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }

}
