package com.example;

import com.example.PasswordGenerator;

public class Main {

    public static void main(String[] args) {
        String password = PasswordGenerator.generatePassword(12);
        System.out.println("Generated password: " + password);
    }
}
