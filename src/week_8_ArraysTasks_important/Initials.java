package week_8_ArraysTasks_important;

public class Initials {
    public static void main(String[] args) {
        String [] subgroup={"İbrahim Bulut","Gökhan Tanışık","Kazım Barsbay","Burhan Şaşmaz","Doğan Tonbul","Halit Oturak"};
        for (String sg : subgroup) {
            String initial =sg.charAt(0)+"."+sg.charAt(sg.indexOf(" ")+1)+".";
            System.out.println(initial);
        }

    }
}
