package com.company;

import java.util.Scanner;

public class Proj3_1_LearningPackages {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int packageNo,courses,cost=0;
        System.out.println("Which of the packages do you want? 1, 2 or 3");
        packageNo = keyboard.nextInt();
        System.out.println("How many courses did you enroll in this month?");;
        courses = keyboard.nextInt();
        switch (packageNo){
            case 1:
                if(courses<=2){
                    cost = 10;
                }
                else{
                    cost = 10+ (courses-2)*6;
                }
                System.out.println("Total cost is: $"+cost);
                break;
            case 2:

                if(courses<=4){
                    cost = 12;
                }
                else{
                    cost = 12+ (courses-4)*4;
                }
                System.out.println("Total cost is: $"+cost);
                break;
            case 3:
                if(courses<=6){
                    cost = 15;
                }
                else{
                    cost = 15+ (courses-6)*3;
                }
                System.out.println("Total cost is: $"+cost);
                break;
            default:
                System.out.println("Please give a valid input");
                break;
        }

    }
}
