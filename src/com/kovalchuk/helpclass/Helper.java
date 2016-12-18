package com.kovalchuk.helpclass;

import com.kovalchuk.exceptions.IncorrectSidesRectangleEx;
import com.kovalchuk.exceptions.IncorrectSidesTriangleEx;
import com.kovalchuk.shapes.*;

import java.awt.*;
import java.util.Random;

public class Helper {
    public static double distanceBetweenPoints(Point point1, Point point2){
        return Math.sqrt(Math.pow(point1.getX()-point2.getX(),2)+Math.pow(point1.getY()-point2.getY(),2));
    }
    public static com.kovalchuk.shapes.Shape getRandomShape() throws IncorrectSidesTriangleEx, IncorrectSidesRectangleEx {
        Random random = new Random();
        int number=random.nextInt(2);
        switch (number){
            case 0:
                try {
                    return new com.kovalchuk.shapes.Triangle(random.nextInt(10),random.nextInt(10),random.nextInt(10));
                }
                catch (IncorrectSidesTriangleEx e){
                    e.getMessage();
                    return new com.kovalchuk.shapes.Triangle(1,4,4);
                }
            case 1:
                try {
                    return new com.kovalchuk.shapes.Rectangle(random.nextInt(10),random.nextInt(10));
                }
                catch (IncorrectSidesRectangleEx e){
                    e.getMessage();
                    return new com.kovalchuk.shapes.Rectangle(1,4);
                }
        }
        return new Triangle();
    }
}