package main.java.model;

public class exam extends quiz {
    private boolean attempted;

    public exam(String title, int sequenceNumber) {
        super(title, sequenceNumber);
        this.attempted = false;
    }

    public void markAsAttempted() {
        this.attempted = true;
    }
}