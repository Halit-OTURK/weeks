package week_11_day31_Constructors;

public class CapitalOne {
    public static void main(String[] args) {
 // capital meaning "sermaye"

        BankAccount account1 = new BankAccount();
        account1.setInfo("Ahmet Ozkok",123456789);

        System.out.println(account1);

        account1.deposit(1000);
        account1.checkBalance();// Your available balance is: 1000.0

        account1.withdraw(900);

        account1.checkBalance();//Your available balance is: 100.0

        account1.deposit(900);

        account1.checkBalance();//Your available balance is: 1000.0

        System.out.println(" <=> ".repeat(33));

        BankAccount account2 = new BankAccount();
        account2.setInfo("Aygun", 987456123);

        account2.deposit(10000);

        account2.checkBalance();//Your available balance is: 10000.0




    }
}
