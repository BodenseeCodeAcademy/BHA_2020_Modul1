package org.bca.calculation;


public class GreatestCommonDivisor {

    public static void main(String[] args) {

        int gcd = findGreatestCommonDivisor(12,30);

        System.out.println(gcd);

    }

    private static int findGreatestCommonDivisor(int first, int second) {
        int gcd=0;

       if(first<10||second<10)
            return -1;

        // how to find greatest common Divisor?
        // 12-> 1 2 3 4 6 12
        // 30-> 1 2 3 5 6 10 15 30

        // 12 % 1 --> 0   *
        // 30 % 1 --> 0
        // 12 % 2 --> 0   *
        // 30 % 2 --> 0
        // 12 % 3 --> 0   *
        // 30 % 3 --> 0
        // 12 % 4 --> 0
        // 30 % 4 -->XXX
        // 12 % 5 -->XX
        // 30 % 5 -->0
        // 12 % 6 -->0   *
        // 30 % 6 -->0

// common divisor can NOT be bigger than the smaller number

        for(int i=1; i<=first && i<=second; i++){

            if (first % i==0 && second % i==0){

                gcd=i;

            }
        }

       return gcd;
    }


}
