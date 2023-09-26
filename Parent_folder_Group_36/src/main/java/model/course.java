// The class for courses
package main.java.model;

public class course {
    private String courseID;
    private String title;
    private String category;
    private float cost;
    private String duration;
    private boolean refundOption;

    // Constructor for Course
    public course(String courseID, String title, String category, float cost, String duration, boolean refundOption) {
        this.courseID = courseID;
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.duration = duration;
        this.refundOption = refundOption;
    }

    // Method to add a slide
    public void addSlide(String type) {
        System.out.println("Slide of type " + type + " added to course " + this.title);
    }

    // Method to update course title
    public void updateTitle(String newTitle) {
        this.title = newTitle;
    }

    // Method to update course category
    public void updateCategory(String newCategory) {
        this.category = newCategory;
    }

    // Method to update course cost
    public void updateCost(float newCost) {
        this.cost = newCost;
    }
}