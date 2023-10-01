package main.java.model;
import java.util.List;

/**
 * Represents a multiple choice slide, which is a type of quiz.
 * This slide contains multiple options, out of which one or more options can be correct.
 */
public class multiChoiceSlide extends quiz {
    // Number of times the multi-choice question has been attempted.
    private int attempts;

    // List of correct answer choices (represented by their indices).
    private List<Integer> correctAnswers;

    /**
     * Constructs a new MultiChoiceSlide with a specified title, sequence number, and correct answers.
     *
     * @param title The title of the multi-choice slide.
     * @param sequenceNumber The sequence number of the slide.
     * @param correctAnswers A list of integers representing the correct answer choices.
     */
    public multiChoiceSlide(String title, int sequenceNumber, List<Integer> correctAnswers) {
        super(title, sequenceNumber);
        this.attempts = 0;
        this.correctAnswers = correctAnswers;
    }

    /**
     * Increments the number of times the multi-choice slide has been attempted.
     */
    public void updateAttempts() {
        this.attempts++;
    }
}

