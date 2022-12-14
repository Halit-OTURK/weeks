package week_11_day30_C_Class_Intro;

public class DogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.age = 2;
        dog1.gender = 'f';
        dog1.breed = "wolf";
        dog1.name = "clown";
        dog1.color = "white";
        dog1.size = "big";

        System.out.println(dog1);

        System.out.println("<=>".repeat(44));
        Dog dog2 = new Dog();
        // System.out.println(dog2); -> Dog{name='null', breed='null', gender= , color='null', age=0, size='null'}

        dog2.size = "small";
        dog2.name = "silent";
        dog2.gender = 'm';
        dog2.age = 3;
        dog2.breed = "husky";
        dog2.color = "grey";

        System.out.println(dog2);

        System.out.println("<=>".repeat(44));
        Dog dog3 = new Dog();

        dog3.setInfo("snow", "germenwolf", 'f', "black", 4, "big");

        System.out.println(dog3);
        System.out.println("<=>".repeat(44));


        dog1.eat();
        dog2.bark();



    }


}
