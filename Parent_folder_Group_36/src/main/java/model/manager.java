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
        // Should contruct the manager class
        updateName(name);
        updateEmail(email);
        updatePassword(password);
        updateContactNumber(contactNumber);
        setEmployeeID(employeeID);
    }

    public void appendStudent(student student) {
        // Should add the student to the managers list of students using the provided student's ID as the key
        students.put(student.getStudentID(), student);
    }

    public void respondEnquiry(enquiry originalEnquiry) {
        // Should generate a responce to an enquiry and pass it to the correct recipient as based on their ID
        enquiry response = new enquiry();
        String title = "Re: ";
        String body = "Hello, yes, everyone is able to see questions you ask the instructor spesifically through the course page, hope this helps!";

        title = title.concat(originalEnquiry.getTitle());
            
        response.generateResponce("00002", title, body);

        if (students.get(originalEnquiry.getSenderID()) != null) {
            student sender = students.get(originalEnquiry.getSenderID());
            sender.appendRecieved(response);
        }

        else {
            instructor sender = instructors.get(originalEnquiry.getSenderID());
            sender.appendRecieved(response);
        }
    }

    public void appendEnquiry(enquiry enquiry) {
        // Should append an enquiry to be read by the manager
        this.enquiries.add(enquiry);
    }
}

