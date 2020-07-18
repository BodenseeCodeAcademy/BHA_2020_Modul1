package org.bca.inheritance;

public class Circle extends Object {

    //class variable
    public static double classVar=1;

    //instance variable
    private double radius;

    public Circle(double radius){
       if(radius<0)
           radius=0;
       this.radius=radius;
    }

    public double getRadius(){
        return radius;
    }

    protected double getArea(){
        return radius*radius*Math.PI;
    }

    public double getClassVar(){
        return classVar;
    }
}
