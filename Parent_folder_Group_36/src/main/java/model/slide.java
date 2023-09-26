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
class InformationSlide extends slide {
    private String type;
    // Assuming a basic structure for resources database.
    private String[] resources;

    // Constructor for InformationSlide
    public InformationSlide(String title, int sequenceNumber, String type, String[] resources) {
        super(title, sequenceNumber, type);
        this.resources = resources;
    }

    // Method to change slide type
    public void changeType(String newType) {
        this.type = newType;
    }

    // Method to add a resource
    public void addResource(String resource) {
        // Simple logic to add a resource to the resources list.
        // In a real-world scenario, you might want a more sophisticated approach.
        int length = this.resources.length;
        String[] newResources = new String[length + 1];
        System.arraycopy(this.resources, 0, newResources, 0, length);
        newResources[length] = resource;
        this.resources = newResources;
    }
}


