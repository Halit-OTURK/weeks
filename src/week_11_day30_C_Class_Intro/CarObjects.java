package week_11_day30_C_Class_Intro;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {

        Car car0=new Car();

        car0.setInfo("fiat","punto","grey",2002,7500);

        System.out.println(car0);

        System.out.println(">=>".repeat(45));

        Car car1  = new Car();
        car1.setInfo("Toyota", "Camry", "White", 2021, 35000);

        System.out.println(car1);


        Car car2 = new Car();
        car2.setInfo("BMW", "335is", "Black", 2020, 45000);

        System.out.println(car2);


        Car car3 = new Car();
        car3.setInfo("Audi", "Q7", "Red", 2019, 40000);

        System.out.println(car3);

        System.out.println(">=>".repeat(45));


    //  !!!!!!!!!!!!!!!!!!!!!
    // Car [] cars={car0,car1,car2,car3}; create array

        ArrayList <Car> carList =new ArrayList<>();

        carList.addAll(Arrays.asList(car0,car1,car2,car3));

        System.out.println(carList);
        System.out.println(">=>".repeat(45));

        for(Car each  : carList){
            System.out.println( each.brand +" : "+each.price  );

        }
        System.out.println(">=>".repeat(45));
 /*
         Recall:
            BMW: 2005 ~ 2008
            Toyota: 1995 ~ 1997
         */

        carList.removeIf( p -> p.brand.equals("BMW") && p.year >= 2005 && p.year <= 2008 );
        carList.removeIf( p -> p.brand.equals("Toyota") && p.year >= 1995 && p.year <= 1997);



    }
}
