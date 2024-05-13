package assignments.classConcepts;

import java.util.Scanner;

public class Student {

    //Attributes
    String fullName;
    String mobileNo;
    String emailId;
    String workProfile;

    Scanner sc = new Scanner(System.in);

    //Behavior
    void setDetails() {
        System.out.println("Enter your full name: ");
        fullName = sc.nextLine();
        System.out.println("Enter your mobile number: ");
        mobileNo = sc.nextLine();
        System.out.println("Enter your Email ID: ");
        emailId = sc.nextLine();
        System.out.println("Enter your work profile: ");
        workProfile = sc.nextLine();
    }

    void getDetails(){

        System.out.println("Full Name ->" + fullName);
        System.out.println("Mobile Number ->" + mobileNo);
        System.out.println("Email ID ->" + emailId);
        System.out.println("Work Profile ->" + workProfile);
    }
}
