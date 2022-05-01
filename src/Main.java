import java.util.*;

public class Main {
    public static void main(String[] args) {

        boolean exit = false;
        int choice,st1,st2;
        String stations[] = {"Ayodhya", "Mathura", "Mayapuri", "Kashi", "kanchipuram", "Avantika", "Puri", "Dwarka"};

        Scanner sc = new Scanner(System.in);
        Flight flight = new Flight();

        //Loop to show various options available in Flight Booking System

        do {

            System.out.println();
            System.out.println("*************************WELCOME TO THE FLIGHT BOOKING SYSTEM**********************");
            System.out.println();
            System.out.println("1.Check flights between Stations.");
            System.out.println("2.Book a Ticket.");
            System.out.println("3.Cancel a ticket.");
            System.out.println("4.Check ticket status.");
            System.out.println("5.Exit.");
            System.out.println();
            System.out.println("Enter Your Choice!");

            choice = sc.nextInt();

            switch(choice) {

                case 1: {

                    /* Print Source Station*/

                    System.out.println("------------------select Source station-------------");
                    System.out.println();
                    for(int i=0; i<stations.length-1; i++){
                        System.out.println(i+1 + ". " + stations[i]);
                    }
                    st1 = sc.nextInt();

                    flight.setDepartureLocation(stations[st1-1]);
                    System.out.println(flight.getDepartureLocation());


                    /* Print Destination Station*/

                    System.out.println();
                    System.out.println("------------------select Destination Station station-------------");
                    System.out.println();
                    for(int i=st1; i<stations.length; i++){
                        System.out.println(i+1 + ". " + stations[i]);
                    }
                    st2 = sc.nextInt();

                    flight.setDestinationLocation(stations[st2-1]);
                    System.out.println(flight.getDestinationLocation());


                }

                case 5: {
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

