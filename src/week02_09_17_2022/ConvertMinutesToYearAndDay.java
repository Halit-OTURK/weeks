package week02_09_17_2022;

public class ConvertMinutesToYearAndDay {
    public static void main(String[] args) {
        int minutes = 3456789;
        int hours = minutes / 60;
        int days = hours / 24;
        int years = days / 365;
        int days1 = days % 365;
        System.out.println(minutes + " is approximately " + years + " years and " + days1 + " days");


        /* Adam solution
        int givenMinutes=3456789;
        int HowManyMinutesInAYear=(24*60*365);
        int year=givenMinutes/HowManyMinutesInAYear;
         int remainderMinutes=givenMinutes%HowManyMinutesInAYear;
        System.out.println("remainderMinutes = " + remainderMinutes);
        int days2= remainderMinutes/(24*60);
        System.out.println("days2 = " + days2);
        System.out.println(givenMinutes+" minutes approximately "+year+ " years and "+ days+ " days");

     */



    }
}
