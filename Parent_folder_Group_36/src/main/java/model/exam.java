package main.java.model;

/**
 * Represents an exam, which is a type of quiz.
 * The primary distinction is the "attempted" status, which indicates if the exam has been taken.
 */
public class exam extends quiz {
    // Indicates if the exam has been attempted by the student.
    private boolean attempted;

    /**
     * Constructs a new Exam with a specified title and sequence number.
     *
     * @param title The title of the exam.
     * @param sequenceNumber The sequence number of the exam.
     */
    public exam(String title, int sequenceNumber) {
        super(title, sequenceNumber);
        this.attempted = false;
    }

    /**
     * Marks the exam as attempted.
     */
    public void markAsAttempted() {
        this.attempted = true;
    }
}
