package me.samuel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	int counter = 1;
	double total = 0;
	while(counter<11){
        System.out.println("Enter test score " +counter+":");
        double testScore = input.nextDouble();
        total = total+testScore;
        counter = counter+1;
    }
    double average = total/10;
        System.out.printf("Your average is: %.2f", average);
    }
}
