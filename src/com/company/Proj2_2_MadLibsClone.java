package com.company;

import java.util.Scanner;

public class Proj2_2_MadLibsClone {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String adjective1,girl_name,adjective2,occupation1,place,clothing,hobby,adjective3,occupation2,boy_name,man_name;
        System.out.print("Enter an adjective : ");
        adjective1= keyboard.nextLine();

        System.out.print("Enter a girl's name : ");
        girl_name= keyboard.nextLine();

        System.out.print("Enter another adjective : ");
        adjective2= keyboard.nextLine();

        System.out.print("Enter an occupation : ");
        occupation1= keyboard.nextLine();

        System.out.print("Enter the name of a place : ");
        place= keyboard.nextLine();

        System.out.print("Enter the name of a peice of clothing : ");
        clothing= keyboard.nextLine();

        System.out.print("Enter the name of a hobby : ");
        hobby= keyboard.nextLine();

        System.out.print("Enter another adjective : ");
        adjective3= keyboard.nextLine();

        System.out.print("Enter another occupation : ");
        occupation2= keyboard.nextLine();

        System.out.print("Enter a boy's name : ");
        boy_name= keyboard.nextLine();

        System.out.print("Enter aman's name : ");
        man_name= keyboard.nextLine();

        System.out.println("There once was a "+adjective1+" girl named "+girl_name+" who was a "+adjective2+" "+occupation1+" in the "+
        " kingdom of "+place+".");
        System.out.println("She loved to wear "+clothing+" and to "+hobby+". She wanted to marry the "+adjective3+" "+occupation2+" named "+boy_name+" but her father, king "+man_name+" forbid her from seeing him.");

    }

}
