package week_12_day32_Constructors;

public class CarpetObjects {
    public static void main(String[] args) {

        Carpet c1= new Carpet(2.50,3.70,12.5,true);
        Carpet c2= new Carpet(2.50,3.70,12.5,true);
        c2.width=2.70;
        c2.length=4.10;
        c2.isPersian=false;

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);

    }
}
