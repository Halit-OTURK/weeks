package week_16_day40_FinalKeyword;

public class Dog extends Animal{

    public Dog(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }


    @Override
    public void eat() {
        System.out.println(getName() + " is eating food");
    }

    // public void drink(){} compiler error we can not use override method because of final Keyword
}
