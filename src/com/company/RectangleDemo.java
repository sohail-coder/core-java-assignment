package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RectangleDemo {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles= new ArrayList<>();

        fillRectangle(rectangles);
        printRectangles(rectangles);

    }

    private static void printRectangles(ArrayList<Rectangle> rectangle)  {
        for(Rectangle r :rectangle){
            System.out.println("length : "+r.getLength());
            System.out.println("width : "+r.getWidth());
            System.out.println("area : "+r.area());
            System.out.println("perimeter : "+r.perimeter());
            System.out.println();
        }
    }

    private static void fillRectangle(ArrayList<Rectangle> rectangle) {
        Scanner file;
        try {
            file = new Scanner(new File("src/dimensions"));
            Rectangle temp;
            double length,width;

            while (file.hasNext()){
                length = file.nextDouble();
                width = file.nextDouble();
                temp= new Rectangle(length,width);
                rectangle.add(temp);
            }
            file.close();
        }
        catch (Exception exception){
            System.out.println(exception.getMessage());

        }
    }
}
