package com.cackhainiemcoban.Arrays;

import java.util.Scanner;

public class PrintArrays {
    public static int enter(){
        Scanner s= new Scanner(System.in);
        int z =s.nextInt();
        return z;
    }
    public static int[] enterArrays(int n){
        int[] A=new int [n];
        System.out.println("Enter elements");
        for (int i=0;i < A.length;i++){
            A[i]=enter();
        }
        return A;
    }
    public static void printArrays(int[] A){
        for (int i=0;i < A.length;i++){
            System.out.println("A"+"["+i+"]"+"="+ A[i]);
        }
    }
    public static int sumArrays(int[] A){
        int sum = A[0]+A[9];
        return sum;
    }
    public static void printEven(int[] A){
        for( int i=0;i< A.length;i++){
            if (A[i]%2==0){
                System.out.println("Number of arrays is even:"+A[i]);
            }

        }
    }
    public static void main(String[] args) {
        System.out.println("Enter number element of array");
        int n=enter();
        int [] A2=enterArrays(n);
        printArrays(A2);
        int sum=sumArrays(A2);
        printEven(A2);
    }
}
