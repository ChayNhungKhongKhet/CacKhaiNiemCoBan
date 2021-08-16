package com.cackhainiemcoban.Arrays;

import java.util.Scanner;

public class FindElementsAppearedOnce {
    public static void elementsRepeat(int[] A) {
        for (int i = 0; i < A.length; i++) {
            int count = 0;
            for (int j = 0; j < A.length; j++) {
                if (A[i]==A[j]){
                    count++;
                }
            }
            if (count==1){
                System.out.println("A["+i+"]"+"="+A[i]);
            }
        }

    }


    public static int[] enterArrays(int n) {
        int[] A = new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i < A.length; i++) {
            A[i] = enter();
        }
        return A;
    }

    public static int enter() {
        Scanner s = new Scanner(System.in);
        int z = s.nextInt();
        return z;
    }

    public static void main(String[] args) {
        System.out.println("Enter number elements");
        int n = enter();
        int[] B = enterArrays(n);
        System.out.println("Elements appeared once is: ");
        elementsRepeat(B);

    }
}
