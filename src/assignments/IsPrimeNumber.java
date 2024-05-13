package assignments;

import java.util.Scanner;

/**
 * A prime number is a number that is divisible by only two numbers: 1 and itself.
 * So, if any number is divisible by any other number, it is not a prime number.
 * 0 & 1 are not prime numbers. So we can start considering from 2.
 */


public class IsPrimeNumber {

    public static void main(String[] args) {

        int num;
        boolean flag = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number you want to check for Prime : ");
        num = sc.nextInt();

        for (int i = 2; i <= num / 2; ++i) {
            // condition for non-prime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");

        sc.close();
    }
}
