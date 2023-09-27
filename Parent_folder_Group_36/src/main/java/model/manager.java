package main.java.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class manager extends employee{
    private List<enquiry> enquiries = new ArrayList<enquiry>();
    private HashMap<String, employee> employees;
    private HashMap<String, instructor> instructors;
    private HashMap<String, student> students;

    public manager(String name, String email, String password, String contactNumber, String employeeID) {
        // Should contruct the manager class using the provided arguments
        super(name, email, password, contactNumber, employeeID);
        System.out.println("Constructing manager class");
        System.out.println();
    }

    public void appendStudent(student student) {
        // Should add the student to the managers list of students using the provided student's ID as the key
        System.out.println("Adding student to list of students");
    }

    public void appendInstructor(instructor instructor) {
        // Should add the instructor to the managers list of instructors using the provided student's ID as the key
        System.out.println("Adding instructor to list of instructors");
    }

    public void respondEnquiry(enquiry originalEnquiry) {
        // Should generate a responce to an enquiry and pass it to the correct recipient as based on their ID
        System.out.println("To: Student");
        System.out.println("Title: Re: Instructor question visibility");
        System.out.println("Body: Hello, yes, everyone is able to see questions you ask the instructor spesifically through the course page, hope this helps!");
        System.out.println("Passing back to student as response");
        System.out.println();
    }

    public void appendEnquiry(enquiry enquiry) {
        // Should append an enquiry to be read by the manager
        this.enquiries.add(enquiry);
    }
}

