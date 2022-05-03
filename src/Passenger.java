public class Passenger extends  Ticket {

   //todo: get details and set details
    //todo: update user details

    Contact contact;
    Address address;

    private static int idCounter;
    public int getPassengerCount(int idCounter){
        return ++idCounter;

    }


    static class Contact{
        private int id;
        private String name;
        private String phoneNumber;
        private String emailId;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getEmailId() {
            return emailId;
        }

        public void setEmailId(String emailId) {
            this.emailId = emailId;
        }
    }

    private static class Address{
        private String street;
        private String city;
        private String state;

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }


}
