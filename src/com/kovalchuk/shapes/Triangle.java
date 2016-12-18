package com.kovalchuk.shapes;

import com.kovalchuk.exceptions.IncorrectSidesTriangleEx;
import com.kovalchuk.helpclass.Helper;

import java.awt.*;

public class Triangle implements Shape{
    private double a,b,c;
    private Point[] points;
    public Triangle(double a,double b,double c) throws IncorrectSidesTriangleEx {
        if(isTriangle(a,b,c)) {
            points = new Point[3];
            this.a = a;
            this.b = b;
            this.c = c;
        }
        else {
            throw new IncorrectSidesTriangleEx(a,b,c,this);
        }
    }
    public Triangle(Point point1,Point point2,Point point3) throws IncorrectSidesTriangleEx {
        double temp_a=Helper.distanceBetweenPoints(point1,point2);
        double temp_b=Helper.distanceBetweenPoints(point1,point3);
        double temp_c=Helper.distanceBetweenPoints(point3,point2);
        if(isTriangle(temp_a,temp_b,temp_c)) {
            points=new Point[3];
            points[0] = point1;
            points[1] = point2;
            points[2] = point3;
            a = temp_a;
            b = temp_b;
            c = temp_c;
        }
        else {
            throw new IncorrectSidesTriangleEx(a,b,c,this);
        }
    }
    public Triangle() throws IncorrectSidesTriangleEx{
        this(1.0,1.0,1.5);
    }
    private boolean isTriangle(double a, double b, double c){
        return ((a+b)>c)?
                (((a+c)>b)?
                        (((c+b)>a)? true
                                :false)
                        :false)
                :false;
/*        if (((a+b)>c)&&((a+c)>b)&&((c+b)>a)){
            return true;
        }
        else return false;*/
    }
    @Override
    public double square() {
        double halfPerimetr=perimeter()/2.0;
        return Math.sqrt(halfPerimetr*(halfPerimetr-a)*(halfPerimetr-b)*(halfPerimetr-c));
    }
    @Override
    public double perimeter() {
        return a+b+c;
    }
}
