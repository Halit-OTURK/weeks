package week_21_day52_Map_FunctionalInterface;

public class Test {
    public static void main(String[] args) {

        MyFirstFunctionalInterface oddOrEven = (n) -> {
            if (n % 2 == 0) {
                System.out.println(n + " is even");
            } else {
                System.out.println(n + " is odd");
            }
        };

        oddOrEven.apply(17);

        System.out.println(">=<=".repeat(38));

        MyFirstFunctionalInterface eligibleForBuyAlcohol = (n) -> {
            if (n > 18) System.out.println("Buy alcohol");
            else System.out.println("Not eligible for buy alcohol");
        };

        eligibleForBuyAlcohol.apply(17);

        System.out.println(">=<=".repeat(38));

        MyFirstFunctionalInterface CubeOfNumber = n -> System.out.println(n * n * n);
        CubeOfNumber.apply(17);

        System.out.println(">=<=".repeat(38));

        MyFirstFunctionalInterface divisibleBy3and5 = n -> {

            if (n % 15 == 0) System.out.println(n + " is divisible by 3 and 5");
            else System.out.println(n + " is not divisible by 3 and 5");
        };

        divisibleBy3and5.apply(17);
    }
}