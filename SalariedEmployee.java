public class SalariedEmployee extends Employee {
    
    private double earnings;

    public SalariedEmployee(int number, String name, String address, String hireDate, double payRate, double hoursWorked, double earnings) {
        super(number, name, address, hireDate);
        
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.earnings = earnings;
    }

    public void displayEarnings() {
        System.out.println(earnings);
    }

}