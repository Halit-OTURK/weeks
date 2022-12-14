package week_10_day25_overloading;

public class O_L_Intro {
    public static int[] addToArray(int[] arr, int num) {
        int[] result = new int[arr.length + 1];

        int i = 0;
        for (int each : arr) {
            result[i++] = each;
        }
        result[i] = num;
        return result;
    }

    public static double[] addToArray(double[]arr, double num) {
        double[] result = new double[(arr.length + 1)];

        int i = 0;
        for (double each : arr) {
            result[i++] = each;
        }
        result[i] = num;
        return result;
    }

    public static char[] addToArray(char[]arr, char ch) {
        char[] result = new char [(arr.length + 1)];

        int i = 0;
        for (char each : arr) {
            result[i++] = each;
        }
        result[i] = ch;
        return result;
    }

    public static String[] addToArray(String[]arr, String ch) {
        String[] result = new String [(arr.length + 1)];

        int i = 0;
        for (String each : arr) {
            result[i++] = each;
            // result[arr.length-1]=each;
        }
        result[i] = ch;
        return result;
    }



    public static void main(String[] args) {
        int [] a={1,2,3};
        double[] d ={1.2,2.3,3.4};
        char[] ch={'a','b','c'};
        String[] str={"zxy","qwe","tyu"};

        addToArray(a,4);
        addToArray(d,5.5);
        addToArray(ch,'d');
        addToArray(str,"jkl");

    }
}

