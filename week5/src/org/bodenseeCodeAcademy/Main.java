package org.bodenseeCodeAcademy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the month number: ");
        int month = in.nextInt();


        if(month==1){
            System.out.println("Month is JAN");
        }else if(month==2){
            System.out.println("Month is FEB");
        }else if(month==3){
            System.out.println("Month is MAR");
        }else if(month==4){
            System.out.println("Month is APR");
        }else if(month==5){
            System.out.println("Month is MAY");
        }else if(month==6){
            System.out.println("Month is JUN");
        }else if(month==7){
            System.out.println("Month is JUL");
        }else if(month==8){
            System.out.println("Month is AUG");
        }else if(month==9){
            System.out.println("Month is SEP");
        }else if(month==10){
            System.out.println("Month is OCT");
        }else if(month==11){
            System.out.println("Month is NOV");
        }else if(month==12){
            System.out.println("Month is DEC");
        }

        if(month==12||month==1||month==2){
            System.out.println("Season: Winter");
        }else if (month==3||month==4||month==5){
            System.out.println("Season: Spring");
        }else if (month==6||month==7||month==8) {
            System.out.println("Season: Summer");
        }else if (month==9||month==10||month==11) {
            System.out.println("Season: Autumn");
        }


    }
}






