package org.bca.calculation;

import java.util.Arrays;

public class FindTheBiggestNumber {

    public static void main(String[] args) {
        int arr[]= {5,8,2,78,99,10,5,6,45,88};
        int biggestNumber=findTheBiggest(arr);
        System.out.println("The Biggest Number in the Array:"+biggestNumber);
        bubleSort(arr);

    }

    private static void bubleSort(int[] arr) {

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static int findTheBiggest(int[] arr) {
        int theBiggest=Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>theBiggest){
                theBiggest=arr[i];
            }
        }
        return theBiggest;
    }



}
