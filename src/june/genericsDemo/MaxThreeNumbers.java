package june.genericsDemo;

public class MaxThreeNumbers {

    public static void main(String[] args) {

        //34, 54,76
        //4.2, 3.4, 1.2
        //p, z, a - z as per ascii value

        int max1 = maximumNumberOf(34, 54, 76);
        double max2 = maximumNumberOf(4.2, 3.4, 1.2);
        //String max3 = maximumNumberOf('p', 'z', 'a');

        //This do not have a reusable code

    }

    public static int maximumNumberOf(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static double maximumNumberOf(double a, double b, double c) {
        double max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static String maximumNumberOf(String a, String b, String c) {
        String max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

}