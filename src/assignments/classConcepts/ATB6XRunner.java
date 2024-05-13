package assignments.classConcepts;

import java.util.Scanner;

public class ATB6XRunner {

    public static void main(String[] args) {

        char optCourse;

        Course atb6x = new Course();
        System.out.println("The course details are: ");
        atb6x.getCourseDetails();

        System.out.println("Would you like to enroll this course ? Y / N?: ");
        Scanner sc = new Scanner(System.in);
        optCourse = sc.next().charAt(0);

        if (optCourse == 'N' || optCourse == 'n') {
            System.out.println("Thank You...");
        } else if (optCourse == 'Y' || optCourse == 'y') {

            Student trainee = new Student();
            System.out.println("Enter your details ->");
            trainee.setDetails();
            System.out.println("Please confirm your details ->");
            trainee.getDetails();

            Payment pay = new Payment();
            pay.startPayment();

        }
        sc.close();
    }
}