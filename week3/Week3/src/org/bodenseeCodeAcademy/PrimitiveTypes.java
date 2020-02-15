package org.bodenseeCodeAcademy;

public class PrimitiveTypes {
    public static void main(String[] args) {

        byte b=127;

        System.out.println("value of b="+b);

        short s=32767;

        System.out.println("value of s="+s);

        int i=-2147483648;
        i=i-1;
        System.out.println("value of i="+i);

        long l=i;
         l=l+1;

        System.out.println("value of l="+l);

        int division=22/5;

        System.out.println("value of division="+division);

        float division_float= (float) 22/5;

        System.out.println("value of division_float="+division_float);

        double d= 5e10; // 5x10(power10)

        System.out.println("value of double="+d);

        boolean smallerThan= 10<5;

        System.out.println("Compare two integers= 10 < 5 "+ smallerThan);


        boolean biggerThan= 10>5;

        System.out.println("Compare two integers= 10 < 5 "+ biggerThan);


        boolean equals=10==5;
        System.out.println("Compare two integers= 10 equals 5 "+ equals);

        boolean notEqual=10!=5;
        System.out.println("Compare two integers= 10 equals 5 "+ notEqual);


        char c=64+10;  //unicode table

        System.out.println(" Char ="+c);

        char charVariable='c';

    }
}
