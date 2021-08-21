package com.cackhainiemcoban.Arrays;

import java.util.Scanner;

public class InsertDeleteElementOfArray {
    public static int enter(){
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        return x;
    }
    public static int[] printArray() {
        // khởi tạo mảng A
        int[] A = new int[10] ;
        A[0]=4;
        A[1]=7;
        A[2]=8;
        A[3]=1;
        A[4]=5;
        A[5]=19;
        A[6]=11;
        for (int i = 0; i < A.length; i++) {
            System.out.println("A["+i+"]"+"="+A[i]+"      ");
        }
        return A;
    }
    public static void printArrays(int[] A){
        for (int i=0;i < A.length;i++){
            System.out.println("A"+"["+i+"]"+"="+ A[i]);
        }
    }

    public static int[] insert(int[] A , int k,int value){
        for (int i=A.length-1;i>=k ;i--){
            A[i]=A[i-1];
            //left is get value of right
            //assumption k=5 then A[5]=A[4];A[4]=A[3];....
        }
        A[k]=value;
        return A;
    }
    public static int[] delete(int[] A,int k){
        for (int i=k;i<A.length;i++){
            A[i-1]=A[i];
            //assumption k=3 then A[2]=A[3];
        }
        return A;
    }

    public static void main(String[] args) {
        int[] A = printArray();
        System.out.println("enter place element and value insert: ");
        int[] B=insert(A,enter(),enter());
        printArrays(B);
        System.out.println("enter place element want delete: ");
        int[] C=delete(B,enter());
        printArrays(C);
        }


    }

