package main.java.model;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

public class student extends user {
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

