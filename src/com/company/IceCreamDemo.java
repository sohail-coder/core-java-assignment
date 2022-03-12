package com.company;

public class IceCreamDemo {
    public static void main(String[] args) {
            IceCream chocolate = new IceCream("chocolate",100,3);
            chocolate.addToppings("nuts");
            chocolate.addToppings("choco chips");

            IceCream vanilla = new IceCream("vanilla",40,1);
            vanilla.addToppings("cream");

            System.out.println("Name: "+chocolate.getName());
            System.out.println("Cost: "+chocolate.getCost());
//            System.out.println(chocolate.getName());
            System.out.println("Printing toppings:  ");
            chocolate.printToppings();

            System.out.println();

            System.out.println("Name: "+vanilla.getName());
            System.out.println("Cost: "+vanilla.getCost());
//            System.out.println(vanilla.getName());
            System.out.println("Printing toppings:  ");
            vanilla.printToppings();

    }
}
