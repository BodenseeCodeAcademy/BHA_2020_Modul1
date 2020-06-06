package org.bca.calculation;

public class PrintPyramid {

    public static void main(String[] args) {

        /*

        **********
        *********
        ********
        *******
        ******
        *****
        ****
        ***
        **
        *

        */
        for(int i=0;i<10;i++){
            for(int j=0;j<10-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0;i<10;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1;i<5;i++){
            for(int j=1;j<5;j++){
                System.out.print(i*j);
            }
            System.out.println();
        }



    }
}
