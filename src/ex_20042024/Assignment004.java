package ex_20042024;

/**
 * Author: Swapnil Padekar
 * Subject: Using Math class calculate - Math.cbrt(Math.sqrt(x) + Math.sqrt(y) - Math.abs(z)) for given values
 */

public class Assignment004 {
    public static void main(String[] args) {
        int x = 10;
        double y = 12.4, z = 56.78;

        double result = Math.cbrt(Math.sqrt(x) + Math.sqrt(y) - Math.abs(z));

        System.out.println(result);
    }
}
