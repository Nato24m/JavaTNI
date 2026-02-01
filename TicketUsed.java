import javax.swing.*;

public class TicketUsed {

    public static String show_movie_list(Ticket... tickets) {
        String result = "";
        for (Ticket t : tickets) {
            result += t.getTicket_id() + ": " + t.getMovie() + "\n";
        }
        return result;
    }
    static Ticket findTicketById(String id, Ticket[] tickets) {
        for (Ticket t : tickets) {
            if (t.getTicket_id().equalsIgnoreCase(id)) {
                return t;
            }
        }
        return null;
    }
    public static void main(String[] args) {

        Ticket[] tickets = {
                new Ticket("T001", new Movie("Titanic", 120, "PG-13"), "12:00", "B7", 280),
                new Ticket("T002", new Movie("A Walk to Remember", 102, "PG"), "11:00", "G11", 240),
                new Ticket("T003", new Movie("Silent Hill", 125, "R-13"), "14:30", "H2", 240)
        };

        boolean running = true;

        while (running) {

            //1
            int confirm = JOptionPane.showConfirmDialog(
                    null,
                    "Do you want to book or use a ticket?",
                    "Ticket",
                    JOptionPane.YES_NO_OPTION
            );

            if (confirm == JOptionPane.NO_OPTION) break;

            //2
            String ticketId = JOptionPane.showInputDialog(
                    show_movie_list(tickets) +
                            "\nEnter a ticket id for booking:"
            );

            Ticket selectedTicket = findTicketById(ticketId, tickets);

            if (selectedTicket == null) {
                JOptionPane.showMessageDialog(null, "Invalid ticket id");
                continue;
            }

            //3
            String menu = JOptionPane.showInputDialog(
                    selectedTicket.getTicket_id() + ": " + selectedTicket.getMovie() +
                            "\n\nPress 1 to book a ticket" +
                            "\nPress 2 to use a ticket" +
                            "\nPress 3 to see a ticket status" +
                            "\n\nEnter a menu:"
            );
            int choice = Integer.parseInt(menu);
            if (choice == 1) {
                JOptionPane.showMessageDialog(
                        null,
                        selectedTicket.bookTicket() + "\n\n" + selectedTicket
                );
            } else if (choice == 2) {
                JOptionPane.showMessageDialog(null, selectedTicket.useTicket());
            } else if (choice == 3) {
                JOptionPane.showMessageDialog(null, selectedTicket);
            }
            //4
            int again = JOptionPane.showConfirmDialog(
                    null,
                    "Do you want to book or use other tickets?",
                    "Continue",
                    JOptionPane.YES_NO_OPTION
            );
            if (again == JOptionPane.NO_OPTION) {
                running = false;
            }
        }
    }
}
