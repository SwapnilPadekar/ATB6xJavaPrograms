package ex_20042024;

/**
 * Author: Swapnil Padekar
 * Subject: Max between 3 numbers using ? operator.
 */

public class Assignment001 {

    public static void main(String[] args) {

        int a = 25, b = 50, c = 100;
        int temp, maxOfAll;

        temp = a > b ? a : b;
        maxOfAll = temp > c ? temp : c;

        System.out.println("The largest of 3 numbers -> " + maxOfAll);
    }
}
