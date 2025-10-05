import java.util.Scanner;

class InvalidSalaryException extends Exception {
    public InvalidSalaryException(String message) {
        super(message);
    }
}

public class SalaryProcessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter employee salary: ");
            double salary = sc.nextDouble();

            if (salary < 0) throw new InvalidSalaryException("Salary cannot be negative!");

            System.out.println("Salary recorded: " + salary);

        } catch (InvalidSalaryException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }

        sc.close();
    }
}
