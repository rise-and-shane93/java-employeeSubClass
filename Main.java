public class Main {
    public static void main(String[] Args) {

        // create employees
        SalariedEmployee john = new SalariedEmployee(1, 
            new Name("John", "Harper"), 
            new Address("10 Light St", "Baltimore", "MD", 21202), 
            new Date(1, 1, 2010), 
            75000);
        HourlyEmployee shane = new HourlyEmployee(2, 
            new Name("Shane", "Harper"),
            new Address("1125 N Charles St", "Baltimore", "MD", 21202), 
            new Date(10, 17, 2020), 
            15.5, 42.5);
        HourlyEmployee seth = new HourlyEmployee(3, 
            new Name("Seth", "Harper"),
            new Address("111 Market Pl", "Baltimore", "MD", 21202), 
            new Date(8, 19, 2019), 
            20, 40);
        
        // output employee information and earnings/salary
        john.showData();
        System.out.println();
        shane.showData();
        System.out.println();
        seth.showData();
    }
}