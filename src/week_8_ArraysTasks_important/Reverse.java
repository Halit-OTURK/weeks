package week_8_ArraysTasks_important;

public class Reverse {
    public static void main(String[] args) {
        String [] subgroup={"İbrahim Bulut","Gökhan Tanışık","Kazım Barsbay","Burhan Şaşmaz","Doğan Tonbul","Halit Oturak"};

        for (String sub : subgroup) {
            String reversed = "";
            for (int i = sub.length()-1; i >=0 ; i--) {
                reversed += sub.charAt(i);
            }
            System.out.println(reversed);
        }



    }
}
