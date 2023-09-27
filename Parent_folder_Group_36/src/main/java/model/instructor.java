package main.java.model;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import main.java.model.enquiry;

public class instructor extends user {
    private String instructorID;
    private ArrayList<String> coursesCreated;

    // Constructor for Instructor
    public instructor(String name, String email, String password, String contactNumber, String instructorID) {
        super(name, email, password, contactNumber);
        this.instructorID = instructorID;
        this.coursesCreated = new ArrayList<>();
    }

    // Method for Instructor to create a course
    public void createCourse(String courseID) {
        coursesCreated.add(courseID);
        System.out.println("Course " + courseID + " has been created.");

        // Real Implementation: This is where database operations or API calls to create a course would be added.
    }

    // Toggle refund option for a course
    public void toggleRefund(String courseID) {
        System.out.println("Refund option for Course " + courseID + " has been toggled.");

        // Real Implementation: Call to a service or database operation to update the course refund option would be added here.
    }

    // Toggle visibility for a course
    public void toggleCourseVisibility(String courseID) {
        System.out.println("Visibility for Course " + courseID + " has been toggled.");

        // Real Implementation: Database operations or API calls to update the course visibility would be added here.
    }

    // Get list of students enrolled in a course
    public ArrayList<String> enrolledStudents(String courseID) {
        System.out.println("Fetching list of students enrolled in Course " + courseID + ".");

        // Real Implementation: Database operations or API calls to fetch the list of enrolled students would be added here.

        // Dummy return for the sake of this example:
        return new ArrayList<>();
    }

    // Send automated email for a course
    public void automatedEmailSending(String courseID) {
        System.out.println("Automated email sent for Course " + courseID + ".");

        // Real Implementation: Integration with an email service to send automated emails would be added here.
    }

    // Pay the registration fee
    public boolean makePayment() {
        System.out.println("Payment of $50 made successfully for registration.");

        // Real Implementation: Integration with a payment gateway to process the payment would be added here.

        return true;  // Assuming the payment was successful for this example.
    }

    // Make an enquiry
    public void makeEnquiry(String message) {
        System.out.println("Enquiry made: " + message);

        // Real Implementation: This would typically involve saving the enquiry to a database or sending it to a specific department or email.
    }

}

