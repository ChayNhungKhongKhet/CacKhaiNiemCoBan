package com.cackhainiemcoban.Arrays;

import java.util.Scanner;

public class InsertDeleteElementOfArray {
    public static int enter(){
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        return x;
    }
    public static int[] printArray(int n) {
        // khởi tạo mảng A
        int[] A = new int[n];
        System.out.print("Enter elements of array: \n");
        for (int i = 0; i < A.length; i++) {
            System.out.printf("a[%d] = ", i);
            A[i] = enter();
        }
        return A;
    }

    public static void main(String[] args) {
        System.out.print("Enter number element of array: ");
        int[] A = printArray(enter());
//
    }
}
