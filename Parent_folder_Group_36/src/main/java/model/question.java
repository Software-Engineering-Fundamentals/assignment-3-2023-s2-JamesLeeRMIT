// The class for questions
package main.java.model;

/**
 * Represents a question that can be a part of quizzes, exams, or other assessments.
 */
public class question {
    // A unique identifier for the question.
    private int questionNum;

    // The marks allocated to this question.
    private int individualMarks;

    // The content/title of the question.
    private String questionTitle;

    // Type of the question: true for MCQ and false for others.
    private boolean questionType;

    /**
     * Constructs a new Question with specified attributes.
     *
     * @param questionNum The unique identifier for the question.
     * @param questionTitle The content/title of the question.
     * @param individualMarks The marks allocated to this question.
     * @param questionType The type of the question (true for MCQ, false for others).
     */
    public question(int questionNum, String questionTitle, int individualMarks, boolean questionType) {
        this.questionNum = questionNum;
        this.questionTitle = questionTitle;
        this.individualMarks = individualMarks;
        this.questionType = questionType;
    }

    /**
     * Returns the unique identifier of the question.
     * 
     * @return The question number.
     */
    public int getQuestionNum() {
        return this.questionNum;
    }

    /**
     * Assigns a new mark value to the question.
     * 
     * @param marks The new mark value.
     */
    public void assignMarks(int marks) {
        this.individualMarks = marks;
    }

    /**
     * Updates the title/content of the question.
     * 
     * @param newTitle The new title for the question.
     */
    public void updateTitle(String newTitle) {
        this.questionTitle = newTitle;
    }

    /**
     * Updates the type of the question.
     * 
     * @param newType The new type for the question (true for MCQ, false for others).
     */
    public void updateType(boolean newType) {
        this.questionType = newType;
    }
}
