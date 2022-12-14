package week02_09_17_2022;

public class TempetureCoventer {
    public static void main(String[] args) {
        
        double Fahrenheit=212;
        double Celcius;
        
        Celcius= (5*(Fahrenheit-32)) /9;

        //Celcius= (5(Fahrenheit-32)) /9; incorrect =====>>> (5*(fFahrenheit-32))/9; "*" so important
        System.out.println(Fahrenheit+" degree fahrenheit is equal to "+Celcius+" in Celcius");
        
    }
}
