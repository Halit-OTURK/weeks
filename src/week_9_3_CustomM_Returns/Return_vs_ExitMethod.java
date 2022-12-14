package week_9_3_CustomM_Returns;

/*return method: return type is not void
        MUST return a vlaue

        return statement: used for exiting the method
        we can use it for returning a value from return methods

        branching statements:
        continue: skipping the current iteration
        break: exits the loop or switch
        return: exiting the method (one method, current method)
        System.exit(0): exits the system (EVERY THING WILL BE TERMINATED)
*/

public class Return_vs_ExitMethod {
    public static void main(String[] args) {

        nameOfMonth(50);

        System.out.println("Hello World");
    }


    public static void nameOfMonth(int number){  // 95

        if(number < 1 || number > 12){// if number is invalid
            System.out.println("Invalid");
            //return; // exits nameOfMonth method, remaining code fragments of the method never gets executed
            System.exit(0);
        }

        String name =  (number==1)?"Jan" :(number==2)?"Feb" :(number==3)?"Mar" :(number==4)?"Apr" :(number==5)?"May"
                :(number==6)?"Jun" :(number==7)?"Jul" :(number==8)?"Aug" :(number==9)?"Sep" :(number==10)?"Oct"
                :(number==11)?"Nov" : "Dec";

        System.out.println("Month name = " + name);

    }


}
