package main.java.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class manager {
    private List<enquiry> enquiries = new ArrayList<enquiry>();
    private HashMap<String, employee> employees;
    private HashMap<String, instructor> instructors;
    private HashMap<String, student> students;

    public void respondEnquiry(enquiry originalEnquiry) {
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
        this.enquiries.add(enquiry);
    }
}

