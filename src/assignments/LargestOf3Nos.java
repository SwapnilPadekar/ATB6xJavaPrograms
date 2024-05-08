package assignments;

/**
 * @Author: Swapnil Padekar
 * Problem Statement: Max between 3 numbers using ? operator.
 */

public class LargestOf3Nos {

    public static void main(String[] args) {

        int a = 25, b = 50, c = 100;
        int temp, maxOfAll;

        temp = a > b ? a : b;
        maxOfAll = temp > c ? temp : c;

        System.out.println("The largest of 3 numbers -> " + maxOfAll);
    }
}
