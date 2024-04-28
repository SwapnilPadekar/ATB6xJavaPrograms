package src.ex_13042024;

/**
 * Author: Swapnil Padekar
 * Subject: Interview Questions - Behavior of the int, string variables while printing
 */

public class IQ003 {
    public static void main(String[] args) {
        int a = 10;
        int b = 45;
        System.out.println(a + b); // 55
        // Interview - left -> right & BODMAS rule
        String name = "Pramod";

        System.out.println(a + name); // 10Pramod
        System.out.println(name + a); // Pramod10
        System.out.println(a + b + name); // 55Pramod

        // All the + below are concatenation
        System.out.println(name + a + b); // Pramod1045


    }
}
