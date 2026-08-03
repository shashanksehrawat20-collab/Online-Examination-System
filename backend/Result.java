public class Result {

    private int studentId;
    private String studentName;
    private int marks;
    private int totalMarks;

    public Result(int studentId, String studentName, int marks, int totalMarks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.marks = marks;
        this.totalMarks = totalMarks;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getMarks() {
        return marks;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public double getPercentage() {
        return (marks * 100.0) / totalMarks;
    }

    public String getStatus() {
        return getPercentage() >= 40 ? "PASS" : "FAIL";
    }

    public void displayResult() {
        System.out.println("===== RESULT =====");
        System.out.println("Student ID      : " + studentId);
        System.out.println("Student Name    : " + studentName);
        System.out.println("Marks           : " + marks + " / " + totalMarks);
        System.out.printf("Percentage      : %.2f%%\n", getPercentage());
        System.out.println("Status          : " + getStatus());
    }
}