package main.java.model;
import java.util.List;

public class multiChoiceSlide extends quiz {
    private int attempts;
    private List<Integer> correctAnswers;

    public multiChoiceSlide(String title, int sequenceNumber, List<Integer> correctAnswers) {
        super(title, sequenceNumber);
        this.attempts = 0;
        this.correctAnswers = correctAnswers;
    }

    public void updateAttempts() {
        this.attempts++;
    }
}
