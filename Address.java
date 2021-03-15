class Address {

    // initialize variables
    private String street;
    private String city;
    private String stateCode;
    private int postalCode;
    public String address;

    // Constructor function
    public Address(String street, String city, String stateCode, int postalCode) {
        this.street = street;
        this.city = city;
        this.stateCode = stateCode;
        this.postalCode = postalCode;
    }

    // Create string output for employee's address
    public String toString() {
        address = street + " " + city + ", " + stateCode + " " + postalCode;
        return address;
    }

}