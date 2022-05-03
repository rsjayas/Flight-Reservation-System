abstract class Ticket extends Flight{

    Flight flightChoosen;
    Passenger passenger;

    private String ticketType;
    private String pnr;
    private int price;
    private String ticketStatus;
    private boolean isCancelled;


    void cancellTicket(){}

    public int calcPrice(int dist){
        price = dist*2;
        return price;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(String ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public boolean isCancelled() {
        return isCancelled;
    }

    public void setCancelled(boolean cancelled) {
        isCancelled = cancelled;
    }
}
