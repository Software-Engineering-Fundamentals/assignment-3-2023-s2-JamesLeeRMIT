// The superclass for users (Students, Instructors and Employees) to be generalized into
package main.java.model;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

class user {
    // Contains private attributes and public methods for the users
    private String name;
    private String email;
    private String password;
    private String contactNumber;

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

    public void makeEnquiry() {
        // Should send an enquiry to the manager
    }

    public void postQuestion(String courseID) {
        // Should post a question to the course as provided with the courseID
    }

    public void requestCourseRefund(String courseID) {
        // requests a refund for the desired course as provided with the courseID
    }
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
