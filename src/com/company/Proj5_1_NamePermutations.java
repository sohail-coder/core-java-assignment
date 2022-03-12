package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Proj5_1_NamePermutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String > first = new ArrayList<>();
        ArrayList<String > last = new ArrayList<>();
        String fullName,firstName,lastName;
        int count =0 ;
        int NUMS_LENGTH = 5,spaceat=0;
        for(int i=0;i<NUMS_LENGTH;i++){
            System.out.print("Enter full name: ");
            fullName=scanner.nextLine();
            spaceat=fullName.indexOf(" ");
            firstName = fullName.substring(0,spaceat);
            lastName = fullName.substring(spaceat+1);

            first.add(firstName);
            last.add(lastName);

        }
        for(int i=0;i<NUMS_LENGTH;i++){
            for (int j=0;j<NUMS_LENGTH;j++){
                count++;
                System.out.println(first.get(i)+" "+last.get(j));
            }
        }
        System.out.println(count);



    }
}
