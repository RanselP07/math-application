package com.pluralsight;

import static java.lang.Math.max;
import static java.lang.Math.negateExact;

public class MathApp {
    static void main(String[] args) {
        /**
         * Question 1: Create two variables to represent the salary for Bob and Gary and determine which salary is greater.
         */
        // Declare and Initialize Variables
        double bobSalary = 30000.00;
        double garySalary = 50000.00;

        // Solution
        double highestSalary = Math.max(bobSalary, garySalary);

        // Display the Result
        System.out.println("The highest salary is " + highestSalary);


        /**
         * Question 2: Find and display the smallest of two variables.
         */
        // Declare and Initialize Variables
        double carPrice = 130000.11;
        double truckPrice = 95000.59;

        // Solution
        double smallestVariable = Math.min(carPrice, truckPrice);

        // Display the Result
        System.out.println("The smallest variable is " + smallestVariable);

        /**
         * Question 3: Find and display the area of a circle whose radius is 7.25
         */
        // Declare and Initialize Variables
        double radius = 7.25;

        // Solution
        double area = Math.PI * Math.pow(radius, 2);

        // Display the Result
        System.out.println("The area of a circle with a " + radius + " is " + area);


        /**
         * Question 4: Find and display the square root of a variable after it is set to 5.0
         */
        // Declare and Initialize Variables
        double squareRoot = 5.0;

        // Solution
        double result = Math.sqrt(squareRoot);

        // Display the Result
        System.out.println("The square root of" + squareRoot + " is " + result);

        /**
         * Question 5: Find and display the distance between the points (5, 10) and (85, 50)
         */
        // Declare and Initialize Variables
        int coordinateX1 = 5;
        int coordinateY1 = 10;
        int coordinateX2 = 85;
        int coordinateY2 = 50;

        // Solution
        int distanceOfX = coordinateX2 - coordinateX1;
        int distanceOfY = coordinateY2 - coordinateY1;

        // Display the Result
        System.out.println("The distance between (" + coordinateX1 + ", " + coordinateY1 + ") and (" + coordinateX2 + ", " + coordinateY2 + ") is (" + distanceOfX + ", " + distanceOfY + ").");

        /**
         * Find and display the absolute (positive) value of a variable after it is set to -3.8
         */
        // Declare and Initialize Variables
        double negativeValue = -3.8;

        // Solution
        double positiveValue = negativeValue * -1;

        // Display the Result
        System.out.println("The absolute (positive) value of the variable" + negativeValue + " is " + positiveValue);

        /**
         * Find and display a random number between 0 and 1
         */
        // Solution and Display the Result
        System.out.println("The random number is " + Math.random());

        /**
         * Calculate how many minutes are in 24 days, use a variable for each value you calculate with.
         * BONUS: How many milliseconds?
         */
        // Declare and Initialize Variables
        int days = 24;

        // Solution

        int minutes = (days * 24) * 60;
        // int hours = 24 * days;
        // int minutes = 60 * hours;

        // BONUS: MILLISECONDS
        int milliseconds = (minutes * 60) * 1000;
        // int seconds = minutes * 60;
        // int milliseconds = seconds * 1000;

        // Display the Result
        System.out.println("In " + days + " days there are " + minutes + " minutes.");
        // BONUS: MILLISECONDS
        System.out.println("In " + days + " days there are " + milliseconds + " milliseconds.");

    }
}