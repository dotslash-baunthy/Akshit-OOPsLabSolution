package com.oopslab.services;

import java.util.Random;

import com.oopslab.models.Employee;

public class CredentialGeneratorService {

    public String generateEmail(Employee employee, String department) {

        return ((employee.getFirstName()).toLowerCase() + (employee.getLastName()).toLowerCase() + "." + department
                + "@abc.com");
    }

    public String generatePassword() {

        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialCharacters = "!@#$";
        char[] password = new char[8];
        Random rand = new Random();

        for (int i = 0; i < 2; i++) {
            password[0 + 4 * i] = upperCaseLetters.charAt(rand.nextInt(upperCaseLetters.length()));
            password[1 + 4 * i] = lowerCaseLetters.charAt(rand.nextInt(lowerCaseLetters.length()));
            password[2 + 4 * i] = numbers.charAt(rand.nextInt(numbers.length()));
            password[3 + 4 * i] = specialCharacters.charAt(rand.nextInt(specialCharacters.length()));
        }

        return password.toString();

    }
}
