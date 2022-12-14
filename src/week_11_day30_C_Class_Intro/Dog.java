package week_11_day30_C_Class_Intro;

public class Dog {

    public String name;
    public String breed;
    public char gender;
    public String color;
    public int age;
    public String size;

    public void setInfo(String dogName, String dogBreed, char dogGender, String dogColor, int dogAge, String dogSize) {

        name=dogName;
        breed=dogBreed;
        gender=dogGender;
        color=dogColor;
        age=dogAge;
        size=dogSize;
    }

    public void eat() {

        System.out.println(name + " is eating");
    }

    public void bark() {

        System.out.println(name + " is barking");
    }

    // right click_>generate-> toString-> uncheck insert -> ok
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", size='" + size + '\'' +
                '}';
    }
}
/*
Attributes:
    name, age, gender, breed, size, color

Actions:
    eat(), play(), bark() ....

 */