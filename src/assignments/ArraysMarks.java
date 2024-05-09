package assignments;

import java.util.Scanner;

public class ArraysMarks {
    public static void main(String[] args) {

        //Defining variables
        float[] marks = new float[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sub1 marks: ");
        marks[0] = sc.nextFloat();
        System.out.println("Enter Sub2 marks: ");
        marks[1] = sc.nextFloat();
        System.out.println("Enter Sub3 marks: ");
        marks[2] = sc.nextFloat();
        System.out.println("Enter Sub4 marks: ");
        marks[3] = sc.nextFloat();
        System.out.println("Enter Sub5 marks: ");
        marks[4] = sc.nextFloat();

        //Using enhanced for loop
        for (float mark : marks) {
            System.out.println(mark);
        }

        sc.close();
    }
}
