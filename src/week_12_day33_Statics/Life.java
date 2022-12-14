package week_12_day33_Statics;

public class Life {

    boolean result = false;
    boolean isDead = false;

    static int age;

    public void startLife() {
        System.out.println("Baby was born");
    }

    public boolean makeSuccess() {
        System.out.println("Try until succeed");
        return result;

    }

    public void tryAgain() {
        System.out.println("Newer give up");
    }

    public boolean death() {
        return isDead;
    }


}
