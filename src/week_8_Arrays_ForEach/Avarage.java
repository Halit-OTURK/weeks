package week_8_Arrays_ForEach;

public class Avarage {
    public static void main(String[] args) {
        int[] num = {11, 33, 25, 8, 4, 556};
        double sum = 0;
        for (int ava : num) {
            sum += ava;
        }
        System.out.println("avarage:"+ sum/ num.length);


    }
}
