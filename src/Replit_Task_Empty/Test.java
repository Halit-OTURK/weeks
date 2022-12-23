package Replit_Task_Empty;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.print("Lütfen şifrenizi belirleyiniz: ");

        Scanner input = new Scanner(System.in);
        String password = input.nextLine();

        if (password.length() > 7) {
            if ((password.charAt(0) >='A' && password.charAt(0) <= 'Z')) {
                if ((password.charAt(password.length() - 1) > 'a' && password.charAt(password.length() - 1) < 'z')) {
                    if (!password.contains(" ")) {
                        System.out.println("Şifre başarı ile tamamlandı");
                    }else {
                        System.out.println("başarısız şifre denemesi. Lütfen tekrar deneyiniz!");
                    }
                }else {
                    System.out.println("başarısız şifre denemesi. Lütfen tekrar deneyiniz!");
                }
            }else {
                System.out.println("başarısız şifre denemesi. Lütfen tekrar deneyiniz!");
            }

        } else {
            System.out.println("başarısız şifre denemesi. Lütfen tekrar deneyiniz!");
        }

        System.out.println("ikisini de düzelttim");

        if (password.length()<8){
            System.out.println("işlem başarısız lütfen yeni bir şifre girin");
            System.exit(0);
        }

        if (!(password.charAt(0)>='A'&& password.charAt(0) <='Z')){
            System.out.println("işlem başarısız lütfen yeni bir şifre girin");
            System.exit(0);
        }


        if (!(password.charAt(password.length()-1)>'a' && password.charAt(password.length()-1)<'z')){
            System.out.println("işlem başarısız lütfen yeni bir şifre girin");
            System.exit(0);
        }
        if (password.contains(" ")){
            System.out.println("işlem başarısız lütfen yeni bir şifre girin");
            System.exit(0);
        }
        System.out.println("Şifre başarı ile tamamlandı");



    }
}
