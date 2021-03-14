public class SalariedEmployee extends Employee {
    
    private double annualSalary;

    public SalariedEmployee(int number, String name, String address, String hireDate, double annualSalary) {
        super(number, name, address, hireDate);
        
        this.annualSalary = annualSalary;
    }

    public void displaySalary() {
        System.out.println(name + "'s annual salary is $" + annualSalary + ".");
    }

}