package com.kovalchuk.shapes;

import com.kovalchuk.exceptions.IncorrectSidesRectangleEx;
import com.kovalchuk.helpclass.Helper;

import java.awt.*;

public class Rectangle implements Shape{
    private double a,b;
    private Point[] points;
    public Rectangle()throws IncorrectSidesRectangleEx{
        this(1.0,1.0);
    }
    public Rectangle(double a,double b) throws IncorrectSidesRectangleEx{
        if(isRectangle(a,b,a,b)) {
            points=new Point[4];
            this.a = a;
            this.b = b;
        }
        else {
            throw new IncorrectSidesRectangleEx(a,b,a,b,this);
        }
    }
    public Rectangle(Point point1,Point point2,Point point3,Point point4) throws IncorrectSidesRectangleEx{
        double temp_a= Helper.distanceBetweenPoints(point1,point2);
        double temp_b=Helper.distanceBetweenPoints(point2,point3);
        double temp_c=Helper.distanceBetweenPoints(point3,point4);
        double temp_d=Helper.distanceBetweenPoints(point4,point1);
        if(isRectangle(temp_a,temp_b,temp_c,temp_d)) {
            points=new Point[4];
            points[0] = point1;
            points[1] = point2;
            points[2] = point3;
            points[3] = point4;
            a = temp_a;
            b = temp_b;
        }
        else {
            throw new IncorrectSidesRectangleEx(point1,point2,point3,point4,this);
        }
    }
    private boolean isRectangle(double a, double b,double c,double d){
        return ((a+b+c)>d)?
                (((a+b+d)>c)?
                        (((a+c+d)>b)?
                                (((b+c+d)>a)? true
                                        :false
                                )
                                :false)
                        :false)
                :false;
    }
    @Override
    public double square() {
        return a*b;
    }

    @Override
    public double perimeter() {
        return 2.0*(a+b);
    }
}
