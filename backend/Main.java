import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n========================================");
            System.out.println("   ONLINE EXAMINATION SYSTEM");
            System.out.println("========================================");
            System.out.println("1. Admin Login");
            System.out.println("2. Student Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\nAdmin Login Selected");
                    break;

                case 2:
                    System.out.println("\nStudent Login Selected");
                    break;

                case 3:
                    System.out.println("\nThank You!");
                    System.exit(0);

                default:
                    System.out.println("\nInvalid Choice");

            }

        }

    }

}
