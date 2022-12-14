package week_6_doWhile;

public class B_S_2 {
    public static void main(String[] args) {


        for (char i = 'A'; i <= 'Z'; i++) {

            if (i == 'E') {
                continue; // jump this value and continue
            }

            System.out.println(i);}

        System.out.println("========".repeat(33));

        for (int i = 0; i < 100; i++) {

            if(i%2==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
