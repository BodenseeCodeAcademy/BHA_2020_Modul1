package org.bca.inheritance;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle( 10);
        System.out.println("Radius of Circle = "+circle1.getRadius());
        System.out.println("Area of Circle = "+circle1.getArea());
        System.out.println("Class Var ="+circle1.getClassVar());

        Circle.classVar=2;

        Cylinder cylinder1= new Cylinder(10,10);
        System.out.println("Radius of Cylinder = "+cylinder1.getRadius());
        System.out.println("Area of Cylinder = "+cylinder1.getArea());
        System.out.println("Volume of Cylinder = "+cylinder1.getVolume());
        System.out.println("Class Var="+cylinder1.getClassVar());

        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        System.out.println("Class Var="+circle.getClassVar());

        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());
        System.out.println("Class Var ="+cylinder.getClassVar());


    }
}
