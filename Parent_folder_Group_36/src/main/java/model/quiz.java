package main.java.model;

import java.util.HashMap;

/**
 * Represents a quiz, which is a type of slide.
 * A quiz can contain multiple questions.
 */
public class quiz extends slide {
    // Collection of questions in the quiz.
    // The key is the question number and the value is the question object.
    protected HashMap<Integer, question> questions;

    // The total marks attainable in the quiz.
    protected int totalMarks;

    // Indicates if the quiz has been completed.
    protected boolean completed;

    /**
     * Constructs a new Quiz with a specified title and sequence number.
     *
     * @param title The title of the quiz.
     * @param sequenceNumber The sequence number of the quiz slide.
     */
    public quiz(String title, int sequenceNumber) {
        super(title, sequenceNumber, "Quiz");
        this.questions = new HashMap<>();
        this.totalMarks = 0;
        this.completed = false;
    }

    /**
     * Adds a new question to the quiz.
     *
     * @param question The question to be added.
     */
    public void newQuestion(question question) {
        this.questions.put(question.getQuestionNum(), question);
    }

    /**
     * Removes a question from the quiz based on its number.
     *
     * @param questionNum The unique identifier of the question to be removed.
     */
    public void removeQuestion(int questionNum) {
        this.questions.remove(questionNum);
    }
}
