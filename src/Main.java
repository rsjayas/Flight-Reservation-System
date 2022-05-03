import java.util.*;

public class Main {
    public static void main(String[] args) {

        boolean exit = false;
        int choice,st1,st2, ticketType, flightselected;

        String name, email, phoneNumber, city, state, street;

        String stations[] = {"Ayodhya", "Mathura", "Mayapuri", "Kashi", "kanchipuram", "Avantika", "Puri", "Dwarka"};


        Scanner sc = new Scanner(System.in);

        // Available flights

        RegularTicket rt = new RegularTicket();
        TouristTicket tt = new TouristTicket();

        Passenger.Contact passenger = new Passenger.Contact();

        Flight flight = new Flight();

        Flight flight1 = new Flight("AI0001", "TAJ_EXPRESS", "AIR_INDIA",10, 0, 10, "09:00AM", "09:30AM");
        Flight flight2 = new Flight("AI0002", "JET_EXPRESS", "AIR_INDIA",10, 0, 10, "10:30AM", "11:00AM");
        Flight flight3 = new Flight("AI0003", "TEJ_EXPRESS", "AIR_INDIA",10, 0, 10, "12:30PM", "01:00PM");

        //Loop to show various options available in Flight Booking System

        do {

            System.out.println();
            System.out.println("*************************WELCOME TO THE FLIGHT BOOKING SYSTEM**********************");
            System.out.println();
            System.out.println("1.Check flights between Stations.");
            System.out.println("2.Check seats in flights.");
            System.out.println("3.Book a Ticket.");
            System.out.println("4.Cancel a ticket.");
            System.out.println("4.Check ticket status.");
            System.out.println("5.Exit.");
            System.out.println();
            System.out.println("Enter Your Choice!");

            choice = sc.nextInt();

            switch(choice) {

                /* Check flights ---------------------------------------------------------------------------------------------------- */

                case 1: {

                    System.out.println();
                    System.out.println("Following flights are available");
                    System.out.println();
                    System.out.println(flight1);
                    System.out.println(flight2);
                    System.out.println(flight3);

                }

                /* Book Ticket ------------------------------------------------------------------------------------------------------- */

                case 2: {

                    /* Print Source Station ------------------------------------------------------ */

                    System.out.println("------------------select Source station-------------");
                    System.out.println();
                    for(int i=0; i<stations.length-1; i++){
                        System.out.println(i+1 + ". " + stations[i]);
                    }
                    st1 = sc.nextInt();

                    flight.setDepartureLocation(stations[st1-1]);
                    System.out.println(flight.getDepartureLocation());


                    /* Print Destination Station ---------------------------------------------------- */

                    System.out.println();
                    System.out.println("------------------select Destination Station station-------------");
                    System.out.println();
                    for(int i=st1; i<stations.length; i++){
                        System.out.println(i+1 + ". " + stations[i]);
                    }
                    st2 = sc.nextInt();

                    flight.setDestinationLocation(stations[st2-1]);
                    System.out.println(flight.getDestinationLocation());

                    // select flight ----------------------------------------------------------------------

                    do{
                        System.out.println();
                        System.out.println("Following flights are available b/w " + flight.getDepartureLocation() + " and " + flight.getDestinationLocation());
                        System.out.println();
                        System.out.println(flight1);
                        System.out.println(flight2);
                        System.out.println(flight3);

                        System.out.println();
                        System.out.println("select a flight");

                        flightselected = sc.nextInt();

                        if(flightselected==1){
                            System.out.println();
                            System.out.println("flight Number: " + flight1.getFlightNumber());
                            System.out.println("flight Name: " + flight1.getFlightName());
                            System.out.println("flight Airline: " + flight1.getAirline());
                            System.out.println();
                            System.out.println("flight Total capacity: " + flight1.getTotalCapacity());
                            System.out.println("flight Seat Booked: " + flight1.getSeatBooked());
                            System.out.println("flight Current seat Available: " + flight1.getCurrentCapacity());
                            System.out.println();
                            System.out.println("flight Time Of arrival: " + flight1.getTimeOfArrival());
                            System.out.println("flight Time of Deaparture: " + flight1.getTimeOfDeparture());
                            System.out.println("duration Of Journey: " + flight.getDurationOfjourney() + " Hours");

                        }
                        else if(flightselected==2){
                            System.out.println();
                            System.out.println("flight Number: " + flight2.getFlightNumber());
                            System.out.println("flight Name: " + flight2.getFlightName());
                            System.out.println("flight Airline: " + flight2.getAirline());
                            System.out.println();
                            System.out.println("flight Total capacity: " + flight2.getTotalCapacity());
                            System.out.println("flight Seat Booked: " + flight2.getSeatBooked());
                            System.out.println("flight Current seat Available: " + flight2.getCurrentCapacity());
                            System.out.println();
                            System.out.println("flight Time Of arrival: " + flight2.getTimeOfArrival());
                            System.out.println("flight Time of Deaparture: " + flight2.getTimeOfDeparture());
                            System.out.println("duration Of Journey: " + flight.getDurationOfjourney() + " Hours");
                        }
                        else if(flightselected==3){
                            System.out.println();
                            System.out.println("flight Number: " + flight3.getFlightNumber());
                            System.out.println("flight Name: " + flight3.getFlightName());
                            System.out.println("flight Airline: " + flight3.getAirline());
                            System.out.println();
                            System.out.println("flight Total capacity: " + flight3.getTotalCapacity());
                            System.out.println("flight Seat Booked: " + flight3.getSeatBooked());
                            System.out.println("flight Current seat Available: " + flight3.getCurrentCapacity());
                            System.out.println();
                            System.out.println("flight Time Of arrival: " + flight3.getTimeOfArrival());
                            System.out.println("flight Time of Deaparture: " + flight3.getTimeOfDeparture());
                            System.out.println("duration Of Journey: " + flight.getDurationOfjourney() + " Hours");
                        }
                        else{
                            System.out.println();
                            System.out.println("Wrong Choice! select again");
                        }
                    }while(flightselected!=1 || flightselected!=2 || flightselected!=3);

                    /* Select Ticket type-------------------------------------------------------------------- */

                    do{
                        System.out.println();
                        System.out.println("select ticket type");
                        System.out.println("1. Regural Ticket");
                        System.out.println("2. Tourist Ticket");

                        ticketType = sc.nextInt();

                        if(ticketType==1){
                            rt.setTicketType("Regular Ticket");
                            System.out.println("you selected: " + rt.getTicketType());
                        }
                        else if(ticketType==2){
                            tt.setTicketType("Tourist Ticket");
                            System.out.println("you selected: " + tt.getTicketType());
                        }
                        else{
                            System.out.println();
                            System.out.println("Wrong Choice! select again");
                        }
                    }while(ticketType!=1 || ticketType!=2);

                    //  Register paassenger ----------------------------------------------------------------

                    System.out.println();
                    System.out.println("Register your self for Ticket Booking, kindly provide the below details");

                    System.out.println();
                    System.out.println("Enter your name");
                    name  = sc.next();
                    passenger.setName(name);

                    System.out.println();
                    System.out.println("Enter your email");
                    email  = sc.next();
                    passenger.setName(email);

                    System.out.println();
                    System.out.println("Enter your phoneNumber");
                    phoneNumber  = sc.next();
                    passenger.setName(phoneNumber);

                    System.out.println();
                    System.out.println("Enter your street");
                    street  = sc.next();
                    passenger.setName(street);

                    System.out.println();
                    System.out.println("Enter your city");
                    city  = sc.next();
                    passenger.setName(city);

                    System.out.println();
                    System.out.println("Enter your state");
                    state  = sc.next();
                    passenger.setName(state);

                    /* show the details of Passenger and Ticket */




                }

                case 5: {
                    System.out.println();
                    System.out.println("Do you want to Exit? Press (Y/N)!");
                    char ch = sc.next().charAt(0);

                    if(ch =='Y' || ch=='y') {
                        exit = true;
                    }

                }

            }


        } while (!exit);

    }

}

