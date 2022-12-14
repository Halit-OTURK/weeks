package week_4_forLoop;

public class LoopPractice2 {
    public static void main(String[] args) {

        for(int c=65; c<=90; c++){
            System.out.print((char) c +" ");
        }

        for(char i='A';i<='Z';i++){
            System.out.print(i+" ");}
            System.out.println("==".repeat(33));
        for(char a='z';a>='a';a--){
            System.out.print(a+" ");
        }
        System.out.println("==".repeat(33));

        for(int a =1;a<=100; a+=2){
            int b =a+a;
            System.out.println(a);
            System.out.println(b);
        }

    }
}
