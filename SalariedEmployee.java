class SalariedEmployee extends Employee {

    private double annualSalary;

    // Constructor
    public SalariedEmployee(int number, Name name, Address address, Date hireDate, double annualSalary) {
        super(number, name, address, hireDate);
        
        this.annualSalary = annualSalary;
    }

    // inherit the showData method from parent class and also output annual salary
    public void showData() {
        super.showData();
        System.out.println(name + "'s annual salary is $" + annualSalary + ".");
    }

}