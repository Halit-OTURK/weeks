package week_6_for;

public class Frequency_2_OfWord {
    public static void main(String[] args) {

        String str1="javajavajava";
        int frequ=0;

        for (int i = 0; i < str1.length()-3; i++) {
            String eachSub =str1.substring(i,i+4);// String not equal char but put "" then char turn string value
            boolean a = eachSub.equals("java");
            if(a){
                frequ+=1;
            }

        } System.out.println("frequ = " + frequ);


    }
}
