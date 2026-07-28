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

    public void addQuestion(Question question) {
        questions.add(question);
        System.out.println("Question added to exam.");
    }

    public void startExam() {
        System.out.println("Exam Started: " + examName);

        for (Question q : questions) {
            q.displayQuestion();
        }
    }
}
