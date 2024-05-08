package assignments;

import java.util.Scanner;

/**
 * A century year is a year ending with 00. A century year is a leap year only if it is divisible by 400.
 * A leap year (except a century year) can be identified if it is exactly divisible by 4.
 * A century year should be divisible by 4 and 100 both.
 * A non-century year should be divisible only by 4.
 */

public class LeapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = sc.nextInt();

        // century year
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " : This is aLeap Year");
        } else {
            System.out.println(year + " : This is not a Leap Year");
        }
    }
}
