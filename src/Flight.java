public class Flight extends Airline{

    private String airline;
    private String flightName;
    private String flightNumber;
    private int totalCapacity;
    private int currentCapacity;
    private int seatBooked;
    private int price;

    private int seatNo;
    private String timeOfDeparture;
    private String timeOfArrival;
    private int durationOfjourney;
    private int distance; //for calculating fare


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
        this.seatNo = 0;
    }

    public String toString()
    {
        return this.flightNumber + " " + this.flightName + " " + this.airline + " " + this.totalCapacity;
    }

    // to calculate distance
    public int calcDistance(int source, int destination) {
        distance = (destination - source) * 800;
        setDistance(distance);
        return distance;
    }

    // method to find duration of journey
    public int timeTravel(){
        durationOfjourney = (distance/200);
        setDurationOfjourney(durationOfjourney);
        return durationOfjourney;
    }

    public int calcPrice(){
        price = distance*2;
        return price;
    }


    public String getAirline() {
        return airline;
    }

    public String getFlightName() {
        return flightName;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public int getSeatNo() {
        return seatNo;
    }


    public String getTimeOfDeparture() {
        return timeOfDeparture;
    }

    public String getTimeOfArrival() {
        return timeOfArrival;
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

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }
}
