package week3_ternaries;

public class MonthsAndDays {
    public static void main(String[] args) {
        String month = "april";
        String result = "";
        boolean day28 = month == "february";
        boolean day30 = month == "april" || month == "june" || month == "september" || month == "november";
        if (day28) result = "is 28 days";
        else if (day30) result = " is 30 days";
        else result = "is 31 days";
        System.out.println(month + result);

    }
}
