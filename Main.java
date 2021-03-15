/**
 * This program shows the concept of inheritance by allowing the programmer to create either
 * a salaried or hourly employee, input all the necessary data and have the program output
 * all of the attributes.
 * 
 * @author Shane Harper
 * EN.605.201.84.SP21
 * Assignment 7 - Employee Records with salary/earnings data
 */

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