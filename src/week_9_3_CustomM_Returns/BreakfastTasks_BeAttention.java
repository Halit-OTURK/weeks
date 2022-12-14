package week_9_3_CustomM_Returns;

public class BreakfastTasks_BeAttention {

    public static void initial(String firstName, String lastName) {
        String fn = firstName.toUpperCase();
        String ln = lastName.toUpperCase();
        System.out.println("initial: " + fn.charAt(0) + "." + ln.charAt(0) + ".");
    }

    public static void domain(String email) {

        String domain = email.substring(email.indexOf("@") + 1, email.indexOf("."));
        System.out.println("domain: " + domain);


    }

    public static void arrayDomain(String[] emails) {

        for (String email : emails) {
            domain(email);
        }
    }

    public static void months(int number) {

        String name = "";
        if (1 <= number && number <= 12) {
           name =     number == 1 ? "January" : number == 2 ? "February" : number == 3 ? "March"
                    : number == 4 ? "April" : number == 5 ? "May" : number == 6 ? "June"
                    : number == 7 ? "July" : number == 8 ? "August" : number == 9 ? "September"
                    : number == 10 ? "October" : number == 11 ? "November" : "December";

        } else {
            name = "invalid";
        }
        System.out.println("month: "+name);
        // more faster than ternaries
    }

    public static void daysOfMonths(int month){

        String name = "";
        if (1 <= month && month <= 12) {
            name =     month == 1 ? "31" : month == 2 ? "28" : month == 3 ? "31"
                    : month == 4 ? "30" : month == 5 ? "31" : month == 6 ? "30"
                    : month == 7 ? "31" : month == 8 ? "31" : month == 9 ? "30"
                    : month == 10 ? "31" : month == 11 ? "30" : "31";

        } else {
            name = "invalid";
        }
        System.out.println("month has : "+name+" days");
        // more faster than ternaries
    }

    public static void main(String[] args) {

        initial("Halit", "Oturak");
        System.out.println("=".repeat(33));
        initial("halit", "oturak");
        System.out.println("=".repeat(44));
        domain("abcd@gmail.com");
        System.out.println("=".repeat(55));
        String[] emails = {"abc@gmail.com", "def@hotmail.com", "ghi@cydeo.com", "klm@network.com"};
        arrayDomain(emails);
        System.out.println("=".repeat(66));
        months(9);
        months(22);
        System.out.println("=".repeat(77));
        daysOfMonths(8);
        daysOfMonths(33);
        System.out.println("=".repeat(88));

    }
}


   /* Warmup tasks:
        -1. Create a method that can display the initials of the person

        -2. Create a method that can display the domain of the email

        -3. Create a method that can display the name of the month based on the given number to the method

       pass-4. Create a method that can print the name of the day based on the given number to the method

        5. Create a method that can print how many days a month has */