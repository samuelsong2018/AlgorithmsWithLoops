package me.samuel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	    int counter = 1;
	    int total = 0;
	    while (counter<4){
            System.out.println("Enter Integer "+counter+":");
            int addThisNumber = input.nextInt();
            total = total+addThisNumber;
            counter = counter+1;
        }
        System.out.println("Your sum is: "+total);
    }
}
