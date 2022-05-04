public class TouristTicket extends Ticket{

    private String[] serviceRequested = new String[3]; //food,water,snack
    private String hotelAddress;
    private String[] touristlocations =new String[5]; // maximum five tourist location

    /*
    add or remove tourist loaction
     */

    public String[] getServiceRequested() {
        return serviceRequested;
    }

    public void setServiceRequested(String[] serviceRequested) {
        this.serviceRequested = serviceRequested;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String[] getTouristlocations() {
        return touristlocations;
    }

    public void setTouristlocations(String[] touristlocations) {
        this.touristlocations = touristlocations;
    }
}
