public class Student extends User {

    private String course;

    public Student(int id, String username, String password, String course) {
        super(id, username, password);
        this.course = course;
    }

    public void giveExam() {
        System.out.println(username + " is giving the exam.");
    }

    public void displayStudent() {
        displayUser();
        System.out.println("Course: " + course);
    }
}
