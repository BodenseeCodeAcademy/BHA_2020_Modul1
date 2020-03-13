package com.bca;

import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {
        //		int n = 42;
        //		n = n + 13;
        //		n = n - 10;
        //		//...
        //		// ternary operators
        //		// 			= Vergleich ?  ... :  ...
        //		boolean foo = n == 45 ? true : false;
        //		System.out.println( " ist n=45 : " + foo );
        //
        //		int m = 10;
        //		m = m * n; // 450
        //		int oVar = m > 400 ? 1 : 0;
        //		System.out.println( "o ist " + oVar );
        //
        //		// pre-increment ++Var  || post-increment oVar++
        //		System.out.println( "o is after pre+increment = " + (++oVar) );
        //
        //		System.out.println( "o is after post+increment = " + (oVar++) );
        //		System.out.println( oVar );
        //
        //
        Scanner in = new Scanner( System.in );
        System.out.print( "Input the month number: " );
        int month = in.nextInt();

        // Alt + Up/down --> Verschiebung der Zeile
        // Strg + / --> Ein- / Auskommentiert
        // Strg + Alt + L --> Aufräumen vom Kode
        switch(month)
        {
            case 1:
                System.out.println( "Month is JAN" );
                break;
            case 2:
                System.out.println( "Month is FEB" );
                break;
            case 3:
                System.out.println( "Month is MAR" );
                break;
            case 4:
                System.out.println( "Month is APR" );
                break;
            case 5:
                System.out.println( "Month is MAY" );
                break;
            case 6:
                System.out.println( "Month is JUN" );
                break;
            case 7:
                System.out.println( "Month is JUL" );
                break;
            case 8:
                System.out.println( "Month is AUG" );
                break;
            case 9:
                System.out.println( "Month is SEP" );
                break;
            case 10:
                System.out.println( "Month is OCT" );
                break;
            case 11:
                System.out.println( "Month is NOV" );
                break;
            case 12:
                System.out.println( "Month is DEC" );
                break;
            default:
                System.out.println( "Month is not valid number" );
        }
    }

}