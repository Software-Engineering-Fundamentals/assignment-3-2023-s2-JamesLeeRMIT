// The superclass for users (Students, Instructors and Employees) to be generalized into
package main.java.model;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import main.java.model.enquiry;

class user {
    // Contains private attributes and public methods for the users
    private String name;
    private String email;
    private String password;
    private String contactNumber;
    private List<enquiry> recieved;

    // All set methods below should update their respective attributes
    public void updateName(String name) {
        this.name = name;
    }

    public void updateEmail(String email) {
        this.email = email;
    }

    public void updatePassword(String password) {
        this.password = password;
    }

    public void updateContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setRecieved(List<enquiry> recieved) {
        this.recieved = recieved;
    }

    // All get methods should return their respective attributes
    public String getName() {
        return name;
    }
    
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public List<enquiry> getRecieved() {
        return recieved;
    }

    public void appendRecieved(enquiry enquiry) {
        recieved.add(enquiry);
    }

    public void enquiryRecieved() {
        enquiry enquiryRecieved = recieved.get(0);


    }

}

class student extends user {
    private String studentID;
    private LocalDate dateOfBirth;
    private List<String> enrolledCourses;
    private HashMap<String, Float> courseProgress;
    private HashMap<String, Float> marks;

    // The methods below should set their respective attributes
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setEnrolledCourses(List<String> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    public void setCourseProgress(HashMap<String, Float> courseProgress) {
        this.courseProgress = courseProgress;
    }

    public void setMarks(HashMap<String, Float> marks) {
        this.marks = marks;
    }

    // The methods below should get their respecitve attributes
    public String getStudentID() {
        return studentID;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public List<String> getEnrolledCourses() {
        return enrolledCourses;
    }

    public HashMap<String, Float> getCourseProgress() {
        return courseProgress;
    }

    public HashMap<String, Float> getMarks() {
        return marks;
    }

    // The methods below should append to their respective attributes
    public void updateEnrolledCourses(String courseID) {
        // Should append to enrolledCourses
    }

    public void updateCourseProgress(String courseID, Float progress) {
        // Should check to see if there's already progress on the course
        // If not, create a new entry in courseProgess with the courseID as the key
        // If so, simply update progress
    }

    public void updateMarks(String courseID, Float marks) {
        // Should checl to see if there's already marks for a course
        // if not, create a new entry in marks with the course and assosiated marks
        // if so, simply update marks
    }

    public boolean makeCoursePayment(int cost) {
        // Should send a payment through to the payment handler with cost and return True if successful and vice versa
        return false;
    }

    public boolean enrollCourse(String courseID) {
        // Should utilize makeCoursePayment in order to pay for course enrollment
        // upon enrollment, update enrolled course
        return false;
    }

    public void makeEnquiry(manager manager) {
        String title = "Instructor question visibility";
        String body = "Hello, I'm quickly writing to ask if everyone can see the questions I ask the instructor.";
        enquiry newEnquiry = new enquiry();
        
        newEnquiry.generateEnquiry("Enq00001", title, this.getName(), this.studentID, body);
        manager.appendRecieved(newEnquiry);
    }

    public void postQuestion(String courseID) {
        // Should post a question to the course as provided with the courseID
    }

    public void requestCourseRefund(String courseID) {
        // requests a refund for the desired course as provided with the courseID
    }
}

class instructor extends user {

}

class employee extends user {
    private String employeeID;

    public String getEmployeeID() {
        // Should return employeeID
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        // should set employeeID
        this.employeeID = employeeID;
    }


    public void automatedEmailSending() {
        // Should toggle the allowance the sending of automated emails
    }

    public void editCourseVisibility(String courseID) {
        // Should toggle the visibility of a course as provided with the courseID
    }

    public List<String> studentDetails(String studentID) {
        List<String> myList = new ArrayList<String>();
        // Should return a given student's details as provided with the studentID
        return myList;
    }
}

class itAdmin extends employee {
    private List<String> instructors = new ArrayList<String>();
    private List<String> students = new ArrayList<String>();
}

class manager extends employee {
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

class financeManager extends employee {
    // The finance manager has exclusive access to a database with the financial information of the business
    // for this skeleton code, we'll use a list

    private List<String> financialInformation = new ArrayList<String>();

    public void generateReport(List<String> financialInformation) {
        // Should be responsible for generating a report for the financial manager
    }

    public void generateDashboard(List<String> financialInformation) {
        // Should be responsible for generating a report for the financial manager
    }
}