import java.util.Scanner;

// Custom Exception
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class BankWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = sc.nextDouble();

        try {
            System.out.print("Enter amount to withdraw: ");
            double amount = sc.nextDouble();

            if (amount > balance) {
                throw new InsufficientBalanceException("Withdrawal failed! Insufficient balance.");
            }

            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }

        sc.close();
    }
}
