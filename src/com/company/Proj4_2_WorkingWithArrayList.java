package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_2_WorkingWithArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Enter a number greater than or equal to 0");
        int number = scanner.nextInt();
        while((number>=0)){
            arrayList.add(number);
            System.out.println("Enter a number greater than or equal to 0");
            number = scanner.nextInt();
        }
        if(arrayList.size()>0) {
            for (int i = 0; i < arrayList.size(); i++) {
                System.out.println(arrayList.get(i));
            }
        }
        else {
            System.out.println("No elements in arraylist");
        }

    }
}
