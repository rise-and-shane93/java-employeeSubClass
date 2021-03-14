public class SalariedEmployee extends Employee {
    
    private double earnings;

    public SalariedEmployee(int number, String name, String address, String hireDate, double earnings) {
        super(number, name, address, hireDate);
        
        this.earnings = earnings;
    }

    public void displayAttributes() {
        System.out.println(name + "'s earnings is " + earnings);
    }

}