package assignments.classConcepts;

import java.util.Scanner;

public class Payment {

    //Attributes
    int paymentMode;
    Scanner sc = new Scanner(System.in);

    //Behavior
    void startPayment(){
        System.out.println("Please proceed for payment ->");
        System.out.println("Select a payment option -> 1. By Cash, 2. By Credit Card, 3. By Debit Card, 4. By UPI: ");

        paymentMode = sc.nextInt();

        switch (paymentMode) {
            case 1:
                System.out.println("Thank You for your payment by Cash.");
                break;
            case 2:
                System.out.println("Thank You for your payment by Credit Card.");
                break;
            case 3:
                System.out.println("Thank You for your payment by Debit Card.");
                break;
            case 4:
                System.out.println("Thank You for your payment by UPI.");
                break;
            default:
                System.out.println("Invalid option.");

        }
        sc.close();
    }
}
