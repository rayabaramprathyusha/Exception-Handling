import java.util.Scanner;

public class ProductPurchase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stock = 50;

        try {
            System.out.print("Enter quantity to purchase: ");
            int quantity = sc.nextInt();

            if (quantity <= 0) {
                throw new IllegalArgumentException("Quantity must be greater than 0!");
            }

            if (quantity > stock) {
                throw new IllegalArgumentException("Not enough stock available.");
            }

            stock -= quantity;
            System.out.println("Purchase successful. Remaining stock: " + stock);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }

        sc.close();
    }
}
