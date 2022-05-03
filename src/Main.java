import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        boolean exit = false;
        int choice,st1,st2, ticketType, flightselected, rs,selectLocation, index=0, abort, counter=0;

        String name, email, phoneNumber, city, state, street, hotelAddress;
        String requestService[] = new String[5];
        String touristLocation[] = new String[5];

        String stations[] = {"Ayodhya", "Mathura", "Mayapuri", "Kashi", "kanchipuram", "Avantika", "Puri", "Dwarka"};


        Scanner sc = new Scanner(System.in);

        // Available flights

        RegularTicket rt = new RegularTicket();
        TouristTicket tt = new TouristTicket();

        Passenger.Contact passenger = new Passenger.Contact();
        Passenger.Address address = new Passenger.Address();

        Flight flight = new Flight();

        Flight flight1 = new Flight("AI0001", "TAJ_EXPRESS", "AIR_INDIA",10, 0, 10, "09:00AM", "09:30AM");
        Flight flight2 = new Flight("AI0002", "JET_EXPRESS", "AIR_INDIA",10, 0, 10, "10:30AM", "11:00AM");
        Flight flight3 = new Flight("AI0003", "TEJ_EXPRESS", "AIR_INDIA",10, 0, 10, "12:30PM", "01:00PM");

        //Loop to show various options available in Flight Booking System

        do{

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

                break;
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
                            exit = true;
                            System.out.println();
                            System.out.println("---------------------------Flight Details Are---------------------------");
                            System.out.println();
                            System.out.println("flight Number: " + flight1.getFlightNumber() + ",          " + "flight Name: " + flight1.getFlightName() + ",          " + "Airline: " + flight1.getAirline());
                            System.out.println("flight Total capacity: " + flight1.getTotalCapacity() + ",           " + "flight Seat Booked: " + flight1.getSeatBooked() + ",          " + "flight Current seat Available: " + flight1.getCurrentCapacity());
                            System.out.println("flight Time Of arrival: " + flight1.getTimeOfArrival() + ",          " + "flight Time of Deaparture: " + flight1.getTimeOfDeparture());

                        }
                        else if(flightselected==2){
                            exit = true;
                            System.out.println();
                            System.out.println("---------------------------Flight Details Are---------------------------");
                            System.out.println();
                            System.out.println("flight Number: " + flight2.getFlightNumber() + ",          " + "flight Name: " + flight2.getFlightName() + ",          " + "Airline: " + flight2.getAirline());
                            System.out.println("flight Total capacity: " + flight2.getTotalCapacity() + ",          " + "flight Seat Booked: " + flight2.getSeatBooked() + ",          " + "flight Current seat Available: " + flight2.getCurrentCapacity());
                            System.out.println("flight Time Of arrival: " + flight2.getTimeOfArrival() + ",          " + "flight Time of Deaparture: " + flight2.getTimeOfDeparture());

                        }
                        else if(flightselected==3){
                            exit = true;
                            System.out.println();
                            System.out.println("---------------------------Flight Details Are---------------------------");
                            System.out.println();
                            System.out.println("flight Number: " + flight3.getFlightNumber() + ",          " + "flight Name: " + flight3.getFlightName() + ",           " + "Airline: " + flight3.getAirline());
                            System.out.println("flight Total capacity: " + flight3.getTotalCapacity() + ",           " + "flight Seat Booked: " + flight3.getSeatBooked() + ",           " + "flight Current seat Available: " + flight3.getCurrentCapacity());
                            System.out.println("flight Time Of arrival: " + flight3.getTimeOfArrival() + ",           " + "flight Time of Deaparture: " + flight3.getTimeOfDeparture());


                        }
                        else{
                            System.out.println();
                            System.out.println("Wrong Choice! select again");
                        }
                    }while(!exit);
                    exit = false;

                    /* Select Ticket type-------------------------------------------------------------------- */

                    System.out.println();
                    System.out.println("select ticket type");
                    System.out.println("1. Regural Ticket");
                    System.out.println("2. Tourist Ticket");

                    ticketType = sc.nextInt();

                    if(ticketType==1) {
                        rt.setTicketType("Regular Ticket");
                    }
                    else {
                        tt.setTicketType("Tourist Ticket");
                    }

                    /* calculate fair */

                    System.out.println();
                    System.out.println("--------------------------Distance And fare-------------------------");
                    System.out.println();
                    System.out.println("Total distance to Travell: " + flight.calcDistance(st1, st2) + " Km");
                    System.out.println("Total Time Taken: " + flight.timeTravel() + " Hours");
                    System.out.println("Total Travel Fair: Rs." + flight.calcPrice());

                    //  Register passenger ----------------------------------------------------------------

                    System.out.println();
                    System.out.println("Register yourself for Ticket Booking, kindly provide the below details");

                    System.out.println();
                    System.out.println("Enter your name");
                    name  = sc.next();
                    passenger.setName(name);

                    System.out.println();
                    System.out.println("Enter your email");
                    email  = sc.next();
                    passenger.setEmailId(email);

                    System.out.println();
                    System.out.println("Enter your phoneNumber");
                    phoneNumber  = sc.next();
                    passenger.setPhoneNumber(phoneNumber);

                    System.out.println();
                    System.out.println("Enter your street");
                    street  = sc.next();
                    address.setStreet(street);

                    System.out.println();
                    System.out.println("Enter your city");
                    city  = sc.next();
                    address.setCity(city);

                    System.out.println();
                    System.out.println("Enter your state");
                    state  = sc.next();
                    address.setState(state);

                    /* show the details of Passenger and Ticket */

                    System.out.println();
                    System.out.println("----------------------------------------------------------------------------------------------------------------");
                    System.out.println("                                             /* Review Your Details */                                          ");
                    System.out.println("----------------------------------------------------------------------------------------------------------------");
                    //Displaying Personel Details
                    System.out.println();
                    System.out.println("Personal Details:- ");
                    System.out.println("Name: "+passenger.getName()+",   Email: "+passenger.getEmailId()+",   Phone Number: "+passenger.getPhoneNumber());

                    //Displaying Address details
                    System.out.println();
                    System.out.println("Address Details:- ");
                    System.out.println("Street: "+address.getStreet() +",   City: "+ address.getCity()+",   State: "+ address.getState());

                    //Displaying Flight details
                    System.out.println();
                    System.out.println("Flight Details:- ");

                    if(flightselected==1){
                        System.out.println();
                        System.out.println("flight Number: " + flight1.getFlightNumber() + ", " + "flight Name: " + flight1.getFlightName() + ", " + "Airline: " + flight1.getAirline());
                        System.out.println("flight Time Of arrival: " + flight1.getTimeOfArrival() + ", " + "flight Time of Deaparture: " + flight1.getTimeOfDeparture());

                    }
                    if(flightselected==2){
                        System.out.println();
                        System.out.println("flight Number: " + flight2.getFlightNumber() + ", " + "flight Name: " + flight2.getFlightName() + ", " + "Airline: " + flight2.getAirline());
                        System.out.println("flight Time Of arrival: " + flight2.getTimeOfArrival() + ", " + "flight Time of Deaparture: " + flight2.getTimeOfDeparture());

                    }
                    if(flightselected==3) {
                        System.out.println();
                        System.out.println("flight Number: " + flight3.getFlightNumber() + ", " + "flight Name: " + flight3.getFlightName() + ", " + "Airline: " + flight3.getAirline());
                        System.out.println("flight Time Of arrival: " + flight3.getTimeOfArrival() + ", " + "flight Time of Deaparture: " + flight3.getTimeOfDeparture());
                    }

                    //Displaying Ticket details
                    System.out.println();
                    System.out.println("Ticket Details:- ");
                    if(ticketType==1){
                        System.out.println("Ticket Type: " + rt.getTicketType());
                        System.out.println("Service Opted: ");
                        System.out.println(rt.getServiceRequested());

                    }
                    if(ticketType==2){
                        System.out.println("Ticket Type: " + tt.getTicketType());
                        System.out.println("Service Opted: ");
                        System.out.println(tt.getServiceRequested());
                        System.out.println(tt.getTouristlocations());
                        System.out.println(tt.getHotelAddress());
                    }

                    //Displaying Ticket details
                    System.out.println();
                    System.out.println("Fare Details:- ");
                    System.out.println("Total distance to Travell: " + flight.calcDistance(st1, st2) + " Km,   Total Time Taken: " + flight.timeTravel() + " Hours,   Total Travel Fair: Rs." + flight.calcPrice());

                    //Confirmation

                    System.out.println();
                    System.out.println("1. Confirm you details");
                    System.out.println("2. Abort Operation");
                    abort = sc.nextInt();

                   do{
                       if(abort ==1){
                           exit = true;
                           counter++;
                           passenger.setId(counter);
                           flight.setSeatNo(counter);
                           flight.setSeatBooked(counter);

                           System.out.println();
                           System.out.println("Your Ticket is Booked! See detils:");
                           System.out.println("------------------------------------");
                           System.out.println("Passenger Id: PID000" + passenger.getId());
                           System.out.println("Seat No: " + flight.getSeatNo());

                           if(ticketType==1){
                               rt.setTicketStatus("Comfirmed");
                               rt.setPnr(counter);

                               System.out.println("Ticket Status: " + rt.getTicketStatus());
                               System.out.println("PNR No: " + rt.getPnr());
                           }
                           else{
                               tt.setTicketStatus("Confirmed");
                               tt.setPnr(counter);

                               System.out.println("Ticket Status: " + tt.getTicketStatus());
                               System.out.println("PNR No: " + tt.getPnr());
                           }

                       }
                       else if(abort ==2){
                           exit = true;
                           break;
                       }
                       else{
                           System.out.println();
                           System.out.println("Wrong Choice! select again");
                       }

                   }while(!exit);
                   exit = false;

                break;
                }

                case 3: {

                    do{
                        System.out.println();
                        System.out.println("select ticket type");
                        System.out.println("1. Regural Ticket");
                        System.out.println("2. Tourist Ticket");

                        ticketType = sc.nextInt();

                        if(ticketType==1){
                            rt.setTicketType("Regular Ticket");

                            //Request a service.

                            System.out.println("Do you want to add some services?");

                            do{

                                System.out.println();
                                System.out.println("Add a services or Choose None?");
                                System.out.println("1. Food");
                                System.out.println("2. Water");
                                System.out.println("3. Snacks");
                                System.out.println("4. None");
                                rs = sc.nextInt();

                                if (rs == 1) {
                                    requestService[index] = "Food";
                                }
                                if (rs == 2) {
                                    requestService[index] = "Water";
                                }
                                if (rs == 3) {
                                    requestService[index] = "Snacks";
                                }
                                if (rs == 4) {

                                    exit = true;
                                }
                                index++;


                            }while(!exit);
                            exit = false;
                            index=0;

                            rt.setServiceRequested(requestService);

                        }
                        else if(ticketType==2){
                            tt.setTicketType("Tourist Ticket");

                            //Reguest services for tourist

                            System.out.println("Select at most 5 tourist locations");
                            System.out.println();

                            do{

                                System.out.println("select Station");
                                for(int i=0; i<stations.length-1; i++){
                                    System.out.println(i+1 + ". " + stations[i]);
                                }
                                selectLocation = sc.nextInt();
                                touristLocation[index++] = stations[selectLocation];
                                System.out.println("do you want to add more station?");
                                System.out.println("1. Yes,     2. No");
                                rs = sc.nextInt();
                                if(rs == 2){
                                    exit = true;
                                }

                            }while(!exit);
                            exit = false;
                            index=0;

                            tt.setTouristlocations(touristLocation);

                            System.out.println();
                            System.out.println("Enter Your Hotel address");
                            hotelAddress=sc.next();
                            tt.setHotelAddress(hotelAddress);

                            System.out.println();
                            System.out.println("Do you want to add some services?");

                            do{

                                System.out.println();
                                System.out.println("Add a services or Choose None?");
                                System.out.println("1. Food");
                                System.out.println("2. Water");
                                System.out.println("3. Snacks");
                                System.out.println("4. None");
                                rs = sc.nextInt();

                                if (rs == 1) {
                                    requestService[index] = "Food";
                                }
                                if (rs == 2) {
                                    requestService[index] = "Water";
                                }
                                if (rs == 3) {
                                    requestService[index] = "Snacks";
                                }
                                if (rs == 4) {

                                    exit = true;
                                }
                                index++;

                            }while(!exit);

                            index=0;

                            tt.setServiceRequested(requestService);

                        }

                        else{
                            exit = false;
                            System.out.println();
                            System.out.println("Wrong Choice! select again");
                        }
                    }while(!exit);
                    exit = false;

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


        }while(!exit);

    }

}

