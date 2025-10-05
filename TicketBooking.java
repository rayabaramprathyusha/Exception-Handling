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
        boolean[] seats = new boolean[5]; // 5 seats, false = available

        try {
            System.out.print("Enter seat number to book (1-5): ");
            int seatNo = sc.nextInt();

            if (seatNo < 1 || seatNo > 5) throw new IllegalArgumentException("Invalid seat number.");

            if (seats[seatNo - 1]) {
                throw new SeatAlreadyBookedException("Seat " + seatNo + " is already booked!");
            }

            seats[seatNo - 1] = true;
            System.out.println("Seat " + seatNo + " booked successfully.");

        } catch (SeatAlreadyBookedException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error occurred.");
        }

        sc.close();
    }
}
