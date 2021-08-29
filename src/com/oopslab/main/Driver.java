package com.oopslab.main;

import java.util.Scanner;

import com.oopslab.models.Employee;
import com.oopslab.services.CredentialGeneratorService;

public class Driver {

    public static void main(String[] args) {

        // Define and initialize variables used further in the program
        String firstName = "";
        String lastName = "";
        String department = "";
        int choice = 0;
        CredentialGeneratorService generatorService = new CredentialGeneratorService();
        Scanner scn = new Scanner(System.in);

        // User input
        System.out.println("Please enter the department from the following -");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resources");
        System.out.println("4. Legal");
        System.out.print("Enter your choice: ");
        choice = scn.nextInt();

        // Switched over choice to define department
        switch (choice) {
            case 1:
                department = "tech";
                break;
            case 2:
                department = "admin";
                break;
            case 3:
                department = "hr";
                break;
            case 4:
                department = "legal";
                break;
            default:
                System.out.println("Please select one of the four departments.");
                department = "peopledefault";
        }

        // User input
        System.out.print("Enter your first name: ");
        firstName = scn.next();
        System.out.print("Enter your last name: ");
        lastName = scn.next();

        // Credential generator (User CLI)
        Employee employee = new Employee(firstName, lastName);
        System.out.println("Dear " + firstName + ",\nYour generated credentials are as follows -");
        System.out.println("Email --> " + generatorService.generateEmail(employee, department));
        System.out.println("Password --> " + generatorService.generatePassword());

    }
}