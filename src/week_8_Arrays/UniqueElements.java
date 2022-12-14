package week_8_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueElements {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("how many name would you like enter?");
        int length = inp.nextInt();

        inp.nextLine();

        if (length <= 0) {
            System.err.println("invalid number entry");
            System.exit(0);}

        String[] words = new String[length];
            for (int i = 0; i < length; i++) {

                System.out.println("please enter a name: ");
                words[i] = inp.nextLine();
            }

            System.out.println(Arrays.toString(words));


            for (int j = 0; j < words.length; j++) {

                String element = words[j]; //"Java"
                int frequency = 0;
                for (int k = 0; k < words.length; k++) { // finds the frequency of element from array
                    if (words[k].equals(element)) {
                        frequency++;
                    }
                }
                if (frequency == 1) {
                    System.out.println(element);
                }

            }

        }
    }
