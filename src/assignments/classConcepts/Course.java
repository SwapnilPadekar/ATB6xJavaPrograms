package assignments.classConcepts;

public class Course {
    // Attributes
    String courseName = "Automation Tester Blueprint with JAVA By Pramod Dutta - 6x";
    String courseDurationInDays = "4 - months";
    String courseFees = "Rs.9999/- Only";


    //Behavior
    void getCourseDetails(){
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Duration: " + courseDurationInDays);
        System.out.println("Course Fees: " + courseFees);
    }

}
