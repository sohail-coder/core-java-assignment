package com.company;

import java.util.Scanner;

public class Proj2_1_AverageOfThreeParameters {

    public static void main(String[] args) {
	// write your code here
        Scanner keyboard = new Scanner(System.in);
        int number1,number2,number3,total=0;
        double average=0.0;
        System.out.print("Enter 1st number: ");
        number1=keyboard.nextInt();
        System.out.print("Enter 2nd number: ");
        number2=keyboard.nextInt();
        System.out.print("Enter 3rd number: ");
        number3=keyboard.nextInt();
        total=number1+number2+number3;
        average=total/3;
        System.out.println("The average of three numbers is : "+average);

    }
}
