package com.company;

import java.util.Random;
import java.util.Scanner;

public class Proj3_3_GuessRandom {
    public static void main(String[] args) {
        int computerNumber,userNumber,count=0;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        computerNumber = random.nextInt(100) + 1 ;
        System.out.println("Enter a number between 0 and 100 inclusive only");
        userNumber = scanner.nextInt();

            while (computerNumber != userNumber) {

                if(userNumber >=0 && userNumber <=100) {
                count++;
                if (userNumber > computerNumber) {
                    System.out.println("Your guess was too high");
                } else if (userNumber < computerNumber) {
                    System.out.println("Your guess was too low");
                }

            }
            else{
                System.out.println("That was a wasted guess! Pick a number between 1 and 100, inclusive!");

            }
                System.out.println("Enter a number: ");
                userNumber = scanner.nextInt();
        }

            System.out.println("Congratulations! you guessed the number in " + count + " guesses! Thanks for playing!");

    }
}
