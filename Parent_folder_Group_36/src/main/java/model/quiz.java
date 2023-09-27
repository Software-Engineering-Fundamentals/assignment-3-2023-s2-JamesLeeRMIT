package main.java.model;
import java.util.HashMap;

public class quiz extends slide {
    protected HashMap<Integer, question> questions;
    protected int totalMarks;
    protected boolean completed;

    public quiz(String title, int sequenceNumber) {
        super(title, sequenceNumber, "Quiz");
        this.questions = new HashMap<>();
        this.totalMarks = 0;
        this.completed = false;
    }

    public void newQuestion(question question) {
        this.questions.put(question.getQuestionNum(), question);
    }

    public void removeQuestion(int questionNum) {
        this.questions.remove(questionNum);
    }
}
