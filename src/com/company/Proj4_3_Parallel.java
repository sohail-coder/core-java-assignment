package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_3_Parallel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        String name;
        int age;

        for(int i=0;i<5;i++){
            System.out.println("Enter a name: ");
            name = scanner.nextLine();
            names.add(name);
            System.out.println("Enter age: ");
            age = scanner.nextInt();
            scanner.nextLine();
            ages.add(age);
        }
        for(int i=0;i< names.size();i++){
            System.out.println(names.get(i)+" is "+ages.get(i)+" years old");
        }
    }
}
