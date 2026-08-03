import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Admin admin = new Admin(1, "Admin", "admin123");

        Student student = new Student(101, "Shashank", "12345", "BCA");

        Question q1 = new Question(
                1,
                "Java is which type of language?",
                "Programming",
                "Markup",
                "Database",
                "Operating System",
                "Programming"
        );

        Exam exam = new Exam(1, "Java Exam");

        exam.addQuestion(q1);

        while (true) {

            System.out.println("\n==============================");
            System.out.println("ONLINE EXAMINATION SYSTEM");
            System.out.println("==============================");
            System.out.println("1. Admin");
            System.out.println("2. Student");
            System.out.println("3. Start Exam");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch(choice) {

                case 1:
                    admin.displayUser();
                    admin.manageExam();
                    break;

                case 2:
                    student.displayStudent();
                    break;

                case 3:
                    exam.startExam();
                    break;

                case 4:
                    System.out.println("Thank You!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}