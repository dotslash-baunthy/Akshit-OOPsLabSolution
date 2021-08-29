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

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                if (i == 0) {
                    password[i + j] = upperCaseLetters.charAt(rand.nextInt(upperCaseLetters.length()));
                    continue;
                } else if (i == 1) {
                    password[i + j + 1] = lowerCaseLetters.charAt(rand.nextInt(lowerCaseLetters.length()));
                    continue;
                } else if (i == 2) {
                    password[i + j + 2] = numbers.charAt(rand.nextInt(numbers.length()));
                    continue;
                } else {
                    password[i + j + 3] = specialCharacters.charAt(rand.nextInt(specialCharacters.length()));
                    continue;
                }
            }
        }

        return (String.valueOf(password));

    }
}
