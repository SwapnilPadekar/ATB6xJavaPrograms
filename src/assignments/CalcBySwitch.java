package assignments;

import java.util.Scanner;

public class CalcBySwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = sc.nextInt();

        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Enter your operation - For Addition +, Subtraction -, Multiplication *, Division / & Modulus % =>");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case '+':
                System.out.println(a + b); break;
            case '-':
                System.out.println(a - b); break;
            case '*':
                System.out.println(a * b); break;
            case '/':
                System.out.println(a / b); break;
            case '%':
                System.out.println(a % b); break;
            default:
                System.out.println("Invalid Operation");
        }
        sc.close();

    }
}
