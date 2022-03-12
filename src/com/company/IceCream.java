package com.company;

import java.util.ArrayList;

public class IceCream {
    private String name;
    private int cost;
    private int numScoops;
    private ArrayList<String> toppings;

    IceCream(String name,int cost,int numScoops){
    this.name=name;
    this.cost=cost;
    this.numScoops=numScoops;
    this.toppings = new ArrayList<>();
    }
    public void addToppings(String topping){
        toppings.add(topping);

    }
    String getName(){
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getNumScoops() {
        return numScoops;
    }
    void printToppings(){
        for(int i=0;i<toppings.size();i++){
            System.out.println('\t'+toppings.get(i));
        }
    }
}
