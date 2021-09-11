package Exercise12;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Evan Verdu
 */

import java.util.Scanner;

public class Exercise12 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        String principal = scanner.nextLine();

        System.out.print("Enter the rate of interest: ");
        String interestRate = scanner.nextLine();

        System.out.print("Enter the number of years: ");
        String years = scanner.nextLine();

        int Principal = Integer.parseInt(principal);
        double InterestRate = Double.parseDouble(interestRate);
        int Years = Integer.parseInt(years);

        double Total;

        Total = Principal*(1 + ((InterestRate*Years)/100));

        System.out.print("After " + Years + " years at " + InterestRate + "%, the investment will be worth $" + Total);




    }

}
