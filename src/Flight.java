public class Flight extends Airline{

    private String airline;
    private String flightName;
    private String flightNumber;
    private int totalCapacity;
    private int currentCapacity;
    private int seatBooked;

    private int seatNo;
    private String timeOfDeparture;
    private String timeOfArrival;
    private int durationOfjourney;
    private int distance; //for my comfortness


    //Constructor for flight
    public Flight(){
    }
    public Flight(String flightNumber, String flightName, String airline, int totalCapacity, int seatBooked, int currentCapacity, String timeOfArrival, String timeOfDeparture){
        this.flightNumber = flightNumber;
        this.flightName = flightName;
        this.airline = airline;
        this.totalCapacity = totalCapacity;
        this.seatBooked = seatBooked;
        this.currentCapacity = currentCapacity;
        this.timeOfArrival = timeOfArrival;
        this.timeOfDeparture = timeOfDeparture;
    }

    public String toString()
    {
        return this.flightNumber + " " + this.flightName + " " + this.airline + " " + this.totalCapacity;
    }

    // to calculate distance
    public int calcDistance(int destination, int source) {
        distance = (destination - source) * 800;
        return distance;
    }

    // method to find duration of journey
    public int timeTravel(){
        durationOfjourney = (distance/200);
        return durationOfjourney;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(int totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCurrentCapacity(int currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    public String getTimeOfDeparture() {
        return timeOfDeparture;
    }

    public void setTimeOfDeparture(String timeOfDeparture) {
        this.timeOfDeparture = timeOfDeparture;
    }

    public String getTimeOfArrival() {
        return timeOfArrival;
    }

    public void setTimeOfArrival(String timeOfArrival) {
        this.timeOfArrival = timeOfArrival;
    }

    //getter and setter for distance
    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    //getter and setter for journey duration
    public int getDurationOfjourney() {
        return durationOfjourney;
    }

    public void setDurationOfjourney(int durationOfjourney) {
        this.durationOfjourney = durationOfjourney;
    }

    //getter and setter for seetbooked
    public int getSeatBooked() {
        return seatBooked;
    }

    public void setSeatBooked(int seatBooked) {
        this.seatBooked = seatBooked;
    }
}
