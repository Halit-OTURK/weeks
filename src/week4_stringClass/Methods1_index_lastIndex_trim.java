package week4_stringClass;

public class Methods1_index_lastIndex_trim {
    public static void main(String[] args) {
        // white spaces ===>not seperate two words
        String str1 = "       wooden    spoon         ";
        //          -------       ****     ---------  =====>> ---- are white spaces area

        str1 = str1.trim(); // trim methods change and fix white spaces
        System.out.println(str1);

        System.out.println("===============================================");
        int num2 = str1.indexOf("o"); // only read first case ===>> result 1 first 0 at 1 because
        System.out.println("num2 = " + num2);

        int num3 = str1.indexOf("de");
        System.out.println("num3 = " + num3); // read at left case and print that case place ===>> 3
        int num4 = str1.indexOf(" s"); // compiler search space and s " s"===>  9
        System.out.println("num4 = " + num4); // always show first matching
        int num5 = str1.lastIndexOf("n");// lastIndexOf method search right to left--- opposite indexof
        System.out.println("num5 = " + num5); // match last one. count left to right
        // if we search middle case write this case and unique case(right case becasuse read right to left index method)
        int num6 = str1.indexOf("on"+1);// compiler show "o" index number, but we search n due to add 1 to correct result
        System.out.println("num6 = " + num6);

        // if we enter invalid index number result==>> -1
    }
}
