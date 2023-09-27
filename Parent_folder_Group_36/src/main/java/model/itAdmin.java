package main.java.model;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import main.java.model.enquiry;

public class itAdmin extends employee {
    private List<String> instructors = new ArrayList<String>();
    private List<String> students = new ArrayList<String>();

    public itAdmin(String name, String email, String password, String contactNumber, String employeeID) {
        // Should construct the itAdmin class using the provided attributes
        super(name, email, password, contactNumber, employeeID);
        System.out.println("Constructing the IT Admin class");
    }
}