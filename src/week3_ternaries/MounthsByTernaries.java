package week3_ternaries;

public class MounthsByTernaries {
    public static void main(String[] args) {

        int number = 5;
        String month = number == 1 ? "January" : number == 2 ? "February" : number == 3 ? "March"
                : number == 4 ? "April" : number == 5 ? "May" : number == 6 ? "June"
                : number == 7 ? "July" : number == 8 ? "August" : number == 9 ? "September"
                : number == 10 ? "October" : number == 11 ? "November" : "December";
        System.out.println("month = " + month);
    }
}
