package exercise2.application;

import exercise2.entities.Employee;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee employee = new Employee();
        System.out.println("Name: ");
        employee.setName(scan.nextLine());
        System.out.println("Gross salary: ");
        employee.setGrossSalary(scan.nextDouble());
        System.out.println("Tax: ");
        employee.setTax(scan.nextDouble());

        System.out.println(employee);

        System.out.println("whit percentage to increase salary? ");
        employee.increaseSalary(scan.nextDouble());
        System.out.println(employee);


    }
}
