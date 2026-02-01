public class Ticket {
    private String ticket_id;
    private Movie movie;
    private String show_time;
    private String seat_number;
    private double price;
    private boolean is_booked;
    private boolean is_used;

    Ticket(String ticket_id, Movie movie, String show_time, String seat_number, double price) {
        this.ticket_id = ticket_id;
        this.movie = movie;
        this.show_time = show_time;
        this.seat_number = seat_number;
        this.price = price;
        this.is_booked = false;
        this.is_used = false;
    }

    Ticket() {
        this("", null, "", "", 0.0);
    }

    String getTicket_id() {
        return this.ticket_id;
    }

    Movie getMovie() {
        return this.movie;
    }

    String bookTicket() {
        if (!this.is_booked) {
            this.is_booked = true;
            return "Ticket booked successfully!";
        } else {
            return "This ticket is already booked";
        }
    }

    String useTicket() {
        if (!this.is_booked) {
            return "Please book the ticket first";
        }
        if (this.is_used) {
            return "Ticket already used";
        }
        this.is_used = true;
        return "Enjoy the movie!!";
    }

    public String toString() {
        return "Ticket Id: " + this.ticket_id +
                "\nMovie: " + this.movie +
                "\nShow Time: " + this.show_time +
                "\nSeat Number: " + this.seat_number +
                "\nTicket Price: " + this.price +
                "\nBooked: " + (this.is_booked ? "Yes" : "No") +
                "\nUsed: " + (this.is_used ? "Yes" : "No");
    }
}

