public class HourlyEmployee extends Employee {
    private double payRate;
    private double hoursWorked;
    private double earnings;

    public HourlyEmployee(int number, String name, String address, String hireDate, double payRate, double hoursWorked) {
        super(number, name, address, hireDate);
        
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.earnings = calcEarnings(payRate, hoursWorked);
    }

    public double calcEarnings(double rate, double hours) {
        double result = 0;

        if (hours > 40) {
            double overtimeHours = hours - 40;
            result += ((rate * 1.5) * overtimeHours);
            result += rate * 40;
        } else {
            result += rate * 40;
        }
        
        return result;
    }

    public void displayAttributes() {
        System.out.println(name + "'s earnings is $" + earnings);
        System.out.println(name + "'s pay rate is $" + payRate + " per hour.");
        System.out.println(name + " worked " + hoursWorked + " this week.");
    }

}