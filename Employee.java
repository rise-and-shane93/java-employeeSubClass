class Employee {
    // initialize the variables
    public int number;
    public Name name;
    public Address address;
    public Date hireDate;

    // Constructor function
    public Employee(int number, Name name, Address address, Date hireDate) {
        // return name.toString() + address.toString() + hireDate.toString();
        this.number = number;
        this.name = name;
        this.address = address;
        this.hireDate = hireDate;
    }

    // output employee number, name, address & hire date
    public void showData() {
        System.out.println("Employee number is: " + number);
        System.out.println("Employee name is: " + name);
        System.out.println("Employee address is: " + address);
        System.out.println("Employee hire date is: " + hireDate);
    }
}