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
        // Should pop the first enquiry recieved to be printed, marking it as read
        
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





