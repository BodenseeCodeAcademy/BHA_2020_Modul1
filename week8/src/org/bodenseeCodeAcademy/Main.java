package org.bodenseeCodeAcademy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // switch case with months to seasons
        // showSeason();
        // increment decrement
        //incDec();
        //loops();
        // calculateFactorial();
        // loopsExtended();
         //forLoop();
         //calculateFactorialWithForLoop();
        // forLoopExample();
        nestedLoop();
         // intro to arrays
    }

    private static void nestedLoop() {
         // the multiplication table
        for(int i=1;i<11;i++){
            System.out.print(String.format("i= %2s :",i));
            for (int j=1;j<11;j++){
                //j 1 - 2 -3 -4 -5 -6 -7 -8 -9- 10
                System.out.print(String.format("%4s", (i * j)));
            }
            System.out.println();
        }

//                j=1   2   3   4   5   6   7   8   9  10
//        i=  1 :   1   2   3   4   5   6   7   8   9  10
//        i=  2 :       4   6   8  10  12  14  16  18  20
//        i=  3 :           9  12  15  18  21  24  27  30
//        i=  4 :              16  20  24  28  32  36  40
//        i=  5 :                  25  30  35  40  45  50
//        i=  6 :                      36  42  48  54  60
//        i=  7 :                          49  56  63  70
//        i=  8 :                              64  72  80
//        i=  9 :                                  81  90
//        i= 10 :                                     100


        for(int i=1;i<11;i++){
            System.out.print(String.format("i= %2s :",i));
            for (int j=i;j<11;j++){
                //j 1 - 2 -3 -4 -5 -6 -7 -8 -9- 10
                System.out.print(String.format("%4s", (i * j)));
            }
            System.out.println();
        }


    }

    private static void forLoopExample() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the starting number : ");
        int start = in.nextInt();
        System.out.print("Input the limit number : ");
        int limit = in.nextInt();
        System.out.print("Input the number for increment : ");
        int inc = in.nextInt();

        for(int i=start;i<=limit;i=i+inc){
            System.out.print(" "+i+" ");
        }
        //0  1  2  3  4  5  6  7  8  9  10


    }

    private static void calculateFactorialWithForLoop() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number for factorial calculation: ");
        int number = in.nextInt();
        double factorial =1;
        for (int i=1;i<=number;i++){
            factorial *=i; // factorial = factorial*i;
        }
        System.out.println("Factorial of "+number+" is = "+factorial );
    }

    private static void forLoop() {
        // write the numbers from 0 to 10
        int sum =0;
//        for(int i=0;i<=10;i++){
//            System.out.println("number is now: "+i);
//            sum +=i; // sum= sum +i;
//        }
//        System.out.println("sum is :"+sum);

        // write the even numbers from 0 to 10
        // i<=10 ==== i<11
        for (int i=0;i <11;i++){
            if (i % 2 ==0){
                System.out.println("number is now: "+i);
            }
        }
        System.out.println("-----------");
        for (int i=0;i<=10;i=i+2){
             System.out.println("number is now: "+i);
        }


    }

    private static void loopsExtended() {
        int i=6;
        // infinite loop
//        while(true){
//            System.out.println(i++);
//        }
        do{
            System.out.println("number is now: "+i);
            i++;
        }while (i<5);
        System.out.println("------------------");
        i =6;
        while (i<5){
            System.out.println("number is now: "+i);
            i++;
        }

    }

    private static void calculateFactorial() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number for factorial calculation: ");
        int number = in.nextInt();
        //factorial
        // 5!= 5*4*3*2*1;
        // 5!= 2*3*4*5;
        int factorial = 1;
        int i = 1;
        while (i <= number) {
            factorial = factorial * i;
            System.out.print(i + "*");
            i++;
        }
        System.out.println("= " + factorial);
        System.out.println("Factorial of " + number + " is= " + factorial);

    }

    private static void loops() {
        int number = 0;
        // check out for the corner cases
        // numbers from 0 to 10 (10 included)

//        while(number<11) {
//            System.out.println("number is now:" + 1);
//           // number++;
//        }
//        System.out.println("----------");

        // numbers from 10 to 0
//        number=10;
//        while(number>-1) {
//            System.out.println("number is now:" + number);
//            number--;
//        }

        //even numbers from 0 to 100
        int i = 0;
//        while (i<=100){
//            if(i%2==0){
//                System.out.println("number ="+i);
//            }
//            i++;
//        }

        //sum of numbers from 0 to 100
        i = 0;
        int sum = 0;
        while (i <= 100) {
            sum = sum + i;
            i++;
        }
        System.out.println("sum of numbers from 0 to 100 is: " + sum);

        //sum of odd numbers from 0 to 100
        i = 0;
        sum = 0;
        while (i <= 100) {
            if (i % 2 == 1) {
                sum = sum + i;
            }
            i++;
        }
        System.out.println("sum of odd numbers from 0 to 100 is: " + sum);
        //sum of even numbers from 0 to 100
        i = 0;
        sum = 0;
        while (i <= 100) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
            i++;
        }
        System.out.println("sum of even numbers from 0 to 100 is: " + sum);


        System.out.println("loop has ended.");
    }

    private static void incDec() {

        int i = 0;
//        System.out.println("i is now:"+ i); //0
//        i++; // post increment 1
//        System.out.println("i is now:"+ i); //1
//         i=i+1; //2
//        System.out.println("i is now:"+ i); //2
//         i +=1; //3
//        System.out.println("i is now:"+ i); //3
////--------------------------------------------------------
//        i--; // post decrement
//        System.out.println("i is now:"+ i); //2
//        i=i-1;
//        System.out.println("i is now:"+ i); //1
//        i -=1;
//        System.out.println("i is now:"+ i); //0
//--------------------------------------------------------
        i = 0;
        System.out.println("i is now:" + i++); //0?
        // i is 1 now
        System.out.println("i is now:" + i); //1
        i = 0;
        System.out.println("i is now:" + (i + 1));//1

//----------------------------------------------------


    }

    private static void showSeason() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the month number: ");
        int month = in.nextInt();

        switch (month) {
            case 12:
//                System.out.println( "Month is DEC" );
            case 1:
//                System.out.println( "Month is JAN" );
            case 2:
//                System.out.println( "Month is FEB" );
                System.out.println("Season is Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Season is Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Season is Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Season is Autum");
                break;
            default:
                System.out.println("Month is not valid number");
        }
        System.out.println("End of program");
    }

}
