package com.company;

import java.util.Scanner;

public class Proj4_1_WorkingWithArrays {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.print("Enter number: ");
            array[i] = scanner.nextInt();
        }
        for (int i=array.length-1;i>=0;i--){
            System.out.println(array[i]*2);
        }
    }
}
