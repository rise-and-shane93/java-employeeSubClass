class Name {

    // initialize variables
    private String fName;
    private String lName;
    public String name;

    // Constructor function
    public Name(String firstName, String lastName) {
        this.fName = firstName;
        this.lName = lastName;
    }

    // Create output for employee's name
    public String toString() {
        name = fName + " " + lName;
        return name;
    }
}