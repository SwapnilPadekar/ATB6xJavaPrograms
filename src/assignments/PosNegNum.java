package assignments;

import java.util.Scanner;

public class PosNegNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int a = sc.nextInt();

        if(a<0){
            System.out.println("It's a negative number");
        }
        else{
            System.out.println("It's a positive number");
        }

        sc.close();
    }
}
