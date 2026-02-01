import javax.swing.*;
public class TicketInfo {
    static String select_showtime(Movie movie) {
        String input = JOptionPane.showInputDialog(
                movie +
                        "\nPress 1 to select show time = 13:00" +
                        "\nPress 2 to select show time = 14:30" +
                        "\nPress 3 to select show time = 15:00" +
                        "\nEnter a number:"
        );

        if (input == null) return "Error time";

        int choice = Integer.parseInt(input);

                   if (choice == 1) return "13:00";
               if (choice == 2) return "14:30";
               if (choice == 3) return "15:00";
        return "Error time";
    }
    static String select_seat_number() {
        String row = JOptionPane.showInputDialog("Select seat row (A-G):");
        String number = JOptionPane.showInputDialog("Select seat number (1-12):");

        return row + number;
    }

    public static void main(String[] args) {

        //1
        Movie movie = new Movie("Titanic", 120, "PG-13");

        //2
        String show_time = select_showtime(movie);

        //3
        String seat_number = select_seat_number();

        //4
        Ticket ticket = new Ticket("T001", movie, show_time, seat_number, 240.0);
        //5
        JOptionPane.showMessageDialog(null, ticket);
    }
}

