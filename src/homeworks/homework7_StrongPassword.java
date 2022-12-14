package homeworks;

import java.util.Scanner;

public class homework7_StrongPassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();
        boolean pass =false;
        String each="";
        String result="";
        String [] passwordArr = password.split("");
        if(passwordArr.length>=8&&!password.contains(" ")){
            for (int i = 0; i < passwordArr.length; i++) {
                if ( Character.isUpperCase(passwordArr[i].charAt(0))){
                    each="upper";
                }
                if(Character.isLowerCase(passwordArr[i].charAt(0))){
                    each="lower";
                }
                if(!Character.isLetterOrDigit(passwordArr[i].charAt(0))){
                    each="char";
                }
                if(Character.isDigit(passwordArr[i].charAt(0))) {
                    each="digit";
                }
                if(!result.contains(each)){
                    result+=each+ " ";
                }
            }
            if(result.contains("upper")&&result.contains("lower")&&result.contains("char")&&result.contains("digit")){

                System.out.println(true);
                System.exit(0);
            }

        }
        System.out.println(pass);

    }

}
/*
PasswordValidation:
    Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long, and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lower case letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit
 */