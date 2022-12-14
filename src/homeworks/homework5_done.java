package homeworks;

public class homework5_done {
    /*Task 3 :   Write a method that can check if a number is Armstrong number

                Note: if I have a 3-digit number then each of the digits is raised to the power of three and added to obtain a number. If the number obtained equals the original number then, we call that armstrong number.

                Armstrong numbers are     === 153 370 371 407 === for 3 digits

*/
    public static void amstrong(int arm){
        int a=arm/100;
        int b=((arm%100)-(arm%10))/10;
        int c=arm%10;
        int arm2=(a*a*a)+(b*b*b)+(c*c*c);

        if(arm==arm2){
            System.out.println("true");
        } else{
            System.out.println("false");
        }

    }
    public static void main(String[] args) {
        amstrong(153);
        amstrong(370);
        amstrong(371);
        amstrong(407);
        amstrong(100);
        amstrong(10);
        amstrong(10000);
    }

}
