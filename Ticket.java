abstract class Ticket extends Flight{


    private String ticketType;
    private String pnr;
    private String ticketStatus;


    void cancellTicket(){}


    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }


    public String getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(String ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(int counter) {
        pnr = new String("AIR101000"+counter);
    }

}
