// The superclass for infoSlides and quizes to be generalized into
package main.java.model;

public class slide {
    private String title;
    private int sequenceNumber;
    private String type;

    // Constructor for Slide
    public slide(String title, int sequenceNumber, String type) {
        this.title = title;
        this.sequenceNumber = sequenceNumber;
        this.type = type;
    }

    // Method to update slide title
    public void updateTitle(String newTitle) {
        this.title = newTitle;
    }

    // Method to update slide sequence number
    public void updateSequenceNum(int newNumber) {
        this.sequenceNumber = newNumber;
    }
}
