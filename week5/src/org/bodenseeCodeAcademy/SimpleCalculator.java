package org.bodenseeCodeAcademy;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int firstNumber = in.nextInt();
        System.out.println("Input the second number: ");
        int secondNumber = in.nextInt();
        System.out.println("Input the operand (+-/*): ");
        char operand = in.next().charAt(0);
        if(operand=='+'){
            System.out.println("Result is:"+sum(firstNumber,secondNumber));
        }else if(operand=='-'){
            System.out.println("Result is:"+ subtract(firstNumber,secondNumber));
        }else if(operand=='/'){
            System.out.println("Result is:"+divide(firstNumber,secondNumber));
        }else if(operand=='*'){
            System.out.println("Result is:"+multiply(firstNumber,secondNumber));
        }
    }
    static int sum(int firstNumber,int secondNumber){
        return firstNumber+secondNumber;
    }
    static int subtract(int firstNumber, int secondNumber){
        return  firstNumber-secondNumber;
    }
    static int multiply(int firstNumber, int secondNumber){
        return  firstNumber*secondNumber;
    }
    static double divide(int firstNumber,int secondNumber){
        return firstNumber/secondNumber;
    }

}
