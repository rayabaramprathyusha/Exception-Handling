import java.util.Scanner;

// Custom Exception
class SeatAlreadyBookedException extends Exception {
    public SeatAlreadyBookedException(String message) {
        super(message);
    }
}

public class TicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] seats = new boolean[5]; // 5 seats: false = available

        try {
            boolean continueBooking = true;

            while (continueBooking) {
                System.out.print("Enter seat number to book (1-5): ");
                int seatNo = sc.nextInt();

                if (seatNo < 1 || seatNo > 5)
                    throw new IllegalArgumentException("Invalid seat number.");

                if (seats[seatNo - 1]) {
                    throw new SeatAlreadyBookedException("Seat " + seatNo + " is already booked!");
                }

                seats[seatNo - 1] = true;
                System.out.println("✅ Seat " + seatNo + " booked successfully.");

                // Ask user if they want to continue
                System.out.print("Do you want to book another seat? (yes/no): ");
                String choice = sc.next().toLowerCase();

                if (!choice.equals("yes")) {
                    continueBooking = false;
                    System.out.println("Thank you! Booking session ended.");
                }
            }

        } catch (SeatAlreadyBookedException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error occurred.");
        } finally {
            sc.close();
        }
    }
}
