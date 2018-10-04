package me.samuel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner keyboard = new Scanner (System.in);
        System.out.println("Enter an integer");
        int input = keyboard.nextInt();
        while (input>1){
            if(input%2==0) {
                input = input / 2;
                System.out.println(input);
            }
            else{
                input = ((input*3)+1);
                System.out.println(input);
            }
        }
    }
}
