package week_9_3_CustomM_Returns;

public class ReturnStatement {

   public static void nameOfDays( int day){

       if(1>day||day<7){
           System.out.println("invalid");
           return;
// break; only loop or switch--when we use return in void method we can't use any value with return. only return;
       }

       if (day==1) {
           System.out.println("monday");
       }else if (day==2) {
           System.out.println("tuesday");
       }else if (day==3) {
           System.out.println("wednesday");
       }else if (day==4) {
           System.out.println("thursday");
       }else if (day==5) {
           System.out.println("friday");
       }else if (day==6) {
           System.out.println("saturday");
       }else{
           System.out.println("sunday");
       }

   }

    public static void main(String[] args) {


       nameOfDays(5);
       nameOfDays(55);
    }
}
