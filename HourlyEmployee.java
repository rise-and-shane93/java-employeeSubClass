class HourlyEmployee extends Employee {

    private double payRate;
    private double hoursWorked;
    private double earnings;

    // Constructor
    public HourlyEmployee(int number, Name name, Address address, Date hireDate, double payRate, double hoursWorked) {
        // inherit parent attributes via super function
        super(number, name, address, hireDate);
        
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.earnings = calcEarnings(payRate, hoursWorked);
    }

    // calculate weekly earnings
    public double calcEarnings(double rate, double hours) {
        double result = 0;

        if (hours > 40) {
            // if the employee worked overtime, get the # of OT hours, calc the OT pay, and add to the rest of the weekly pay
            double overtimeHours = hours - 40;
            result += ((rate * 1.5) * overtimeHours);
            result += rate * 40;
        } else {
            // else, calculate the rate by multiplying the number of hours worked by the pay rate
            result += rate * hours;
        }
        
        return result;
    }

    // inherit the showData method from parent class and also output weekly earnings, pay rate and hours worked per week
    public void showData() {
        super.showData();
        System.out.println(name + " earned $" + earnings + " this week.");
        System.out.println(name + "'s pay rate is $" + payRate + " per hour.");
        System.out.println(name + " worked " + hoursWorked + " this week.");
    }

}