package org.example;
import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee(1, "John Doe", "john@example.com", "password123", new String[3]);
        employee.addHealthPlan(0, "Basic Health");
        System.out.println(employee.toString());

        Healthplan healthplan = new Healthplan(1, "Standard Health Plan", Plan.BASIC);
        System.out.println(healthplan.toString());

        Company company = new Company(1, "Workintech", 100.000, new String[5]);
        company.addEmployee(1, "Bob");
        company.setGiro(-1000);
        System.out.println(company.toString());
    }
}