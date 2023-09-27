package main.java.model;

public class informationSlide extends slide {
    private String type;
    // Assuming a basic structure for resources database.
    private String[] resources;

    // Constructor for InformationSlide
    public informationSlide(String title, int sequenceNumber, String type, String[] resources) {
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

