package assignments;

/**
 * @Author: Swapnil Padekar
 * Problem Statement: int b = 10; System.out.println(--b + b++ + ++b);
 */

public class IncrDecrOps2 {
    public static void main(String[] args) {
        int b = 10;

        System.out.println(--b + b++ + ++b); //9+9+11=29
    }
}
