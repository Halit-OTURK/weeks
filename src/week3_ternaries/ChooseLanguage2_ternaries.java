package week3_ternaries;

public class ChooseLanguage2_ternaries {
    public static void main(String[] args) {

        int selection;
        selection = 5;

        String result = (selection == 1) ? "Hello, thank for your call"
                : (selection == 2) ? "Hola, gracias para llamar"
                : (selection == 3) ? "Merhaba, aradiginiz icin tesekkurler"
                : (selection == 4) ? "Privet, spasibo za vash zvonok"
                : (selection == 5) ? "Merci ,pour votre appel"
                : "Fail! Please Try Again";
        System.out.println("result = " + result);
        System.out.println("===============================================");
        int age= 23;
        System.out.println( (age>=21)? "Eligibile" : "Not Eligible");
        System.out.println("===============================================");

        String result2= (age>=21)? "Eligibile" : "Not Eligible";
        System.out.println(result2);

        // the results are string because of use "String"
        System.out.println("=======================================================");
        int number= 100;
        String user= (number>0) ? "positive" : (number<0) ? "negative" : "zero";
        System.out.println(user);


    }
}
