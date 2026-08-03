import java.util.ArrayList;

public class Exam {

    private int examId;
    private String examName;
    private ArrayList<Question> questions;

    public Exam(int examId, String examName) {
        this.examId = examId;
        this.examName = examName;
        this.questions = new ArrayList<>();
    }

    public int getExamId() {
        return examId;
    }

    public String getExamName() {
        return examName;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void addQuestion(Question question) {
        questions.add(question);
        System.out.println("Question added successfully.");
    }

    public void startExam() {
        System.out.println("\n===== " + examName + " =====");

        for (Question q : questions) {
            q.displayQuestion();
            System.out.println();
        }
    }

    public int getTotalQuestions() {
        return questions.size();
    }
}