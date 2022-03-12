package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Proj6_1_AddElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> elements = new ArrayList<>();
        int n,number;
        System.out.print("Enter size :");
        n = scanner.nextInt();
        for(int i =0;i<n;i++){
            System.out.print("Enter number :");
            number=scanner.nextInt();
            elements.add(number);
        }
        System.out.println(sumElements(elements));

    }

    private static int sumElements(ArrayList<Integer> elements) {
        int sum=0;
        for(int i=0;i<elements.size();i++){
            sum+=elements.get(i);
        }
        return sum;
    }
}
