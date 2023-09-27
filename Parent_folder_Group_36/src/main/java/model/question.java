// The class for questions
package main.java.model;

public class question {
    private int questionNum;
    private int individualMarks;
    private String questionTitle;
    private boolean questionType;  // Assuming true for MCQ and false for others

    public question(int questionNum, String questionTitle, int individualMarks, boolean questionType) {
        this.questionNum = questionNum;
        this.questionTitle = questionTitle;
        this.individualMarks = individualMarks;
        this.questionType = questionType;
    }

    public int getQuestionNum() {
        return this.questionNum;
    }

    public void assignMarks(int marks) {
        this.individualMarks = marks;
    }

    public void updateTitle(String newTitle) {
        this.questionTitle = newTitle;
    }

    public void updateType(boolean newType) {
        this.questionType = newType;
    }
}