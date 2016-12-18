package com.kovalchuk.exceptions;

public class IncorrectSidesTriangleEx extends Exception {
    public double a;
    public double b;
    public double c;
    public IncorrectSidesTriangleEx(double a, double b, double c, Object obj)
    {
        super("Incorrect Sides: "
                +"a=" + a +", "
                +"b=" + b +", "
                +"c=" + c +", " +"\n"+
                ("Трикутник із заданими параметрами не може існувати"));
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
