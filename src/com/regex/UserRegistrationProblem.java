package com.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationProblem {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to the User Registration Problem");
        System.out.println("Enter your first name. HINT:-'First name starts with Cap and has minimum 3 characters': ");
        String firstName = sc.nextLine();
        /*First name starts with Cap and has minimum 3 characters
         */
        boolean result = Pattern.matches("^[A-Z]{1}[a-z]{2,}$", firstName);
        if (result) {
            System.out.println("Valid");
        }else {
            System.out.println("Invalid");
        }
    }
}
