public class Passenger {

   //todo: get details and set details
    //todo: update user details

    Contact contact;
    Address address;

    private static int idCounter;
    public int getPassengerCount(int idCounter){
        return ++idCounter;

    }


    private static class Contact{
        private int id;
        private String name;
        private String phoneNumber;
        private String emailId;
    }

    private static class Address{
        private String street;
        private String city;
        private String state;
    }
}
