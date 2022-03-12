package com.company;

public class Circle {
    private double radius;
    Circle(){
        this(0);
    }
    Circle(double radius){
        this.radius=radius;
    }
    double getRadius(){
        return radius;
    }
    void setRadius(double radius){
        this.radius=radius;
    }
    double circumference(){
        return 2*Math.PI*radius;
    }
    double area(){
        return Math.PI*Math.pow(radius,2);
    }
}
