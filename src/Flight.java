public class Flight {


    private String departureLocation;
    private String destinationLocation;
    private boolean flightAvailabe;
    private int capacity;
    private int currentCapacity;
    private String flightName;
    private String flightNumber;
    private String airline;
    private int seatBooked;

    Flight(){
    }

    //getter and setter departure location

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    //getter and setter for destination location

    public String getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }
}
