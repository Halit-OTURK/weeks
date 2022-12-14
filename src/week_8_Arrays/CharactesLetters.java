package week_8_Arrays;

import java.util.Arrays;

public class CharactesLetters {
    public static void main(String[] args) {
        char[]letters=new char[26];
        char[]letters2=new char[26];
        char[]letters3=new char[26];
        for (char i = 'A',j=0; i <='Z'&& j< letters.length ; i++,j++) {
            letters[j]=i;
        }
        for (char a = 'a',k=0; a <='z'&& k< letters.length ; a++,k++) {
            letters2[k]=a;
        }

        for (char aa = 'z',kk=0; aa >='a'&& kk< letters.length ; aa--,kk++) {
            letters3[kk]=aa;
        }

        System.out.println(Arrays.toString(letters));
        System.out.println(Arrays.toString(letters2));
        System.out.println(Arrays.toString(letters3));
        int[]list={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(list));
    }
}
