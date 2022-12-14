package week3_ternaries;

public class TernariesWithNestedIf {
    public static void main(String[] args) {
        int score = 85;
        if (score >= 0 && score <= 100) {
            if (score >= 60) {
                System.out.println("passed");
            } else {
                System.out.println("Failed");
            }
        } else {
            System.out.println("İnvalid Score");
        }
        System.out.println("========================");

        String result = (score >= 0 && score <= 100) ? (score >= 60) ? "passed" : "failed" : "invalid score";
        System.out.println("result = " + result);

        System.out.println("========================");

        String result2 = score>=100 && score<=100 ? score>=60 ? "passed" : "failed" : "invalid score";
        System.out.println("result2 = " + result2);


    }

}
