package week_9_2_CustomMethods_VoidMethod;


public class CM_WithParameters_4tasks {

    public static void oddOrEven(int a){

        if(a%2==0){
            System.out.println(a+ " is even number");
        } else {
            System.out.println(a+" is odd number");
        }
    }


    public static void ageOf(int birthyear){

        System.out.println("Your age is: "+(2022-birthyear));

    }

    public static void eligible(int age, String IsCitizen){
       char citizen =IsCitizen.toLowerCase().charAt(0);
        if(!(citizen=='y'||citizen=='n')){
            System.out.println("Invalid Entry");} else {

            if (age >= 18 && citizen == 'y') {
                System.out.println("Eligible");
            } else {
                System.out.println(" Not Eligible");
            }
        }
    }

    public static void betweenTwoNumbers(int a ,int b){

        if (a<b){
       while (a<b){

           System.out.print(a+", ");
           a++;
       }}
        if (a>b){
            while (b<a){

                System.out.print(b+", ");
                b++;
            }}
    }

    public static void main(String[] args) {

        oddOrEven(878745122);
        System.out.println();
        ageOf(1987);
        System.out.println();
        eligible(22,"yes");
        System.out.println();
        eligible(15,"ger");
        System.out.println();
        betweenTwoNumbers(1,54);
        System.out.println();
        betweenTwoNumbers(54,1);


    }
}
