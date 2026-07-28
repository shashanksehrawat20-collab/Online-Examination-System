public class Result {

    private int studentId;
    private String studentName;
    private int marks;

    public Result(int studentId, String studentName, int marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.marks = marks;
    }

    public void displayResult() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Marks Obtained: " + marks);
    }

    public String getStatus() {
        if (marks >= 40) {
            return "PASS";
        } else {
            return "FAIL";
        }
    }
}
