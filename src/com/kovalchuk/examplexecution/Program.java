package com.kovalchuk.examplexecution;

import com.kovalchuk.exceptions.IncorrectSidesRectangleEx;
import com.kovalchuk.exceptions.IncorrectSidesTriangleEx;
import com.kovalchuk.helpclass.Helper;
import com.kovalchuk.shapes.Shape;

import java.util.ArrayList;
import java.util.Random;

public class Program{
    public static void main(String[] args) throws IncorrectSidesTriangleEx,IncorrectSidesRectangleEx {
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        int amountShapes=new Random().nextInt(20)+20;
        try {
            for(int i = 0; i<amountShapes; i++){
                shapes.add(Helper.getRandomShape());
            }
        }
        catch (IncorrectSidesTriangleEx e){
            System.out.println(e.getMessage());
        }
        catch (IncorrectSidesRectangleEx e){
            System.out.println(e.getMessage());
        }
        for (Shape sh:shapes) {
            System.out.println(sh.getClass()+"["+shapes.indexOf(sh)+"]"+"\n"
                    +"perimeter = " + sh.perimeter() + "\n"
                    +"square = " + sh.square());
        }
    }
}
