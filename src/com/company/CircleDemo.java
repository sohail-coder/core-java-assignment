package com.company;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Circle 1:");
        circle1.setRadius(5);
        System.out.println(circle1.getRadius());
        System.out.println(circle1.circumference());
        System.out.println(circle1.area());

        System.out.println();
        System.out.println();
        System.out.println("Circle 2:");
        Circle circle2 = new Circle(10);
        System.out.println(circle2.getRadius());
        System.out.println(circle2.circumference());
        System.out.println(circle2.area());
    }
}
