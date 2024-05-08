package assignments;

import java.util.Scanner;

public class CharType {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any character to know if it's Vowel OR Consonant: ");
        char ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
            System.out.println(ch + " -> This is a Vowel");
        } else {
            System.out.println(ch + " -> This is a Consonant");
        }

        sc.close();

    }
}
