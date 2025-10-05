import java.util.Scanner;

class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

public class ExamMarksEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter marks obtained (0-100): ");
            int marks = sc.nextInt();

            if (marks < 0 || marks > 100) {
                throw new InvalidMarksException("Marks must be between 0 and 100!");
            }

            System.out.println("Marks recorded: " + marks);

        } catch (InvalidMarksException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a number.");
        }

        sc.close();
    }
}
