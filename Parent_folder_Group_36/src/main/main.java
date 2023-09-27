package main;

import java.time.LocalDate;

import main.java.model.instructor;
import main.java.model.manager;
import main.java.model.student;

public class main {
    public static void main(String[] args) {
        // Constructs used classes
        // Real implimentation would utilize a web form to add information
        System.out.println("Constructing classes for scenarios\n--------------------------------------------------");
        student testStudent = new student("Test Student", "testStudent@email.com", "StudentPassword", "0400000000", "S0000001", LocalDate.of(2002, 11, 24));
        instructor testInstructor = new instructor("Test Instructor", "testInstructor@email.com", "InstructorPassword", "0400000001", "I0000001");
        manager testManager = new manager("Test Manager", "testManager@email.com", "ManagerPassword", "0400000002", "E0000001");

        testManager.appendInstructor(testInstructor);
        testManager.appendStudent(testStudent);
        System.out.println();

        // Should print title for this scenario
        // Wouldn't be included in real implimentation
        System.out.println("Scenario 1: Instructor registering a course\n--------------------------------------------------");

        // Should create the test ID for scenario 1
        // Real implimentation would create a random, unique string with the C prefix to denote between courses
        String testCourseID = "C00001";

        // Should create a new course and add it to the list of created courses for this instructor
        // Real implimentation would use a web form to provide information and toggle properties
        testInstructor.createCourse(testCourseID);

        // Should print title for this scenario
        // Wouldn't be included in real implimentation
        System.out.println("Scenario 2: Student lodging an enquiry and recieving a response\n--------------------------------------------------");

        // Should create a new enquiry object and pass it to the manager
        // In real implimentation, this will utilize a web form and database in order to store enquiries and their responces
        System.out.println("Student's initial enquiry\n");
        testStudent.makeEnquiry(testManager);

        // Should mark the student's enquiry as read, create a response enquiry, and pass it to the student
        // In real implimentation, this will 
        System.out.println("Manager's reponse to enquiry\n");
        testManager.respondEnquiry(null);

        // Should read the manager's response from the students perspective and mark it as read
        System.out.println("Manager's response from student's perspective\n");
        testStudent.enquiryRecieved();
    }
}
