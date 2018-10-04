package me.samuel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    //Dimensions of roof in feet.
	Scanner input = new Scanner(System.in);
        System.out.println("In feet, what is the length of your roof? ");
        double lengthFeet = input.nextDouble();
        System.out.println("In feet, what is the width of your roof? ");
        double widthFeet = input.nextDouble();

        //Dimensions of roof in inches.
        double lengthInches = lengthFeet*12;
        double widthInches = widthFeet*12;

        System.out.println("Okay, your roof's dimensions in inches is: " + lengthInches + " x "+ widthInches);

        //Calculate cubic inches of rainfall.
        System.out.println("\nHow many inches of rain fell in the last storm? ");
        double rainInches = input.nextDouble();
        double cubicRainInches = rainInches*lengthInches*widthInches;

        //Calculate gallons of rainfall.
        double gallons = cubicRainInches/231;

        System.out.printf("%.2f gallons of rain ran off your roof in the last storm. ", gallons);
    }
}