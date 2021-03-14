public class Main {
    public static void main(String[] Args) {
        SalariedEmployee john = new SalariedEmployee(1, "John Harper", "321 Any Ave", "1/1/2010", 75000);
        HourlyEmployee shane = new HourlyEmployee(2, "Shane Harper", "123 Main St", "10/17/2020", 15.5, 42.5);
        HourlyEmployee seth = new HourlyEmployee(3, "Seth Harper", "10 Light St", "8/19/2019", 20, 40);
        
        john.displayAttributes();
        System.out.println();
        seth.displayAttributes();
        System.out.println();
        shane.displayAttributes();
    }
}