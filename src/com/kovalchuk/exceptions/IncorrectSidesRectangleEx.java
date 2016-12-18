package com.kovalchuk.exceptions;

import java.awt.*;

public class IncorrectSidesRectangleEx extends Exception {
    public Point point1,point2,point3,point4;
    public double a,b,c,d;
    public IncorrectSidesRectangleEx(Point point1, Point point2, Point point3, Point point4, Object obj)
    {
        super("Incorrect Points: "
                +"a=(" + point1.getX() +", " +point1.getY()+"); "
                +"b=" + point2.getX() +", " +point2.getY()+"); "
                +"c=" + point3.getX() +", " +point3.getY()+"); "
                +"d=" + point4.getX() +", " +point4.getY()+"); "
                + "\n"+
                ("Чотирикутник із заданими параметрами не може існувати"));
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
    }
    public IncorrectSidesRectangleEx(double a, double b, double c, double d, Object obj)
    {
        super("Incorrect Sides: "
                +"a=" + a +", "
                +"b=" + b +", "
                +"c=" + c +", "
                +"d=" + d +", "
                +"\n"+
                ("Чотирикутник із заданими параметрами не може існувати"));
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
}
