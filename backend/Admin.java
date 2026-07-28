public class Admin extends User {

    public Admin(int id, String username, String password) {
        super(id, username, password);
    }

    public void addQuestion() {
        System.out.println(username + " can add questions.");
    }

    public void manageExam() {
        System.out.println(username + " is managing exam.");
    }
}
