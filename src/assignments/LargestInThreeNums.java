package assignments;

import java.util.Scanner;

public class LargestInThreeNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println(a + " -> a is the largest number.");
        } else if (b >= c) {
            System.out.println(b + " -> b is the largest number.");
        } else {
            System.out.println(c + " -> c is the largest number.");
        }

        sc.close();

    }
}
