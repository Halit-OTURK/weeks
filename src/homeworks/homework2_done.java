package homeworks;




public class homework2_done {


    public static void twentyOne(int a){

        int result=0;

        if (a<=21){

            result=21-a;
        }

        else{
            result=(a-21)*2;
        }

        System.out.println("result = " + result);
    }


    public static void main(String[] args) {

        twentyOne(20);
        twentyOne(21);
        twentyOne(50);
    }

  /*  Task 5 :  Write a method that return the absolute difference between n and 21, except return double the absolute difference if n is over 21. (n is int)

    method  parameter : no , or what kibd of data type --- interger
    method return type : void? --- integer


    diff21(19) → 2
    diff21(10) → 11
    diff21(23) → 4 */


}
