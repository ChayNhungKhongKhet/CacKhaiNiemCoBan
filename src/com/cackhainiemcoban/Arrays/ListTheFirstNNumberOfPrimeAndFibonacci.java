package com.cackhainiemcoban.Arrays;

import java.util.Scanner;

public class ListTheFirstNNumberOfPrimeAndFibonacci {
    public static long[] printTheFirstNNumberFibonacci(int n) {
        long[] A = new long[n];
        A[0] = 0;
        A[1] = 1;
        System.out.print(A[0]+"   "+A[1]+"   ");
        for (int i = 2; i < A.length; i++) {
            A[i] = A[i - 1] + A[i - 2];
            System.out.print(A[i] + "   ");
        }
        return A;
    }

    public static boolean checkPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void printTheFirstNNumberPrime(int n) {
        int count = 0;
        int i = 2;
        while (count < n) {
            if (checkPrime(i)) {
                System.out.print(i+"   ");
                count++;
            }
            i++;
        }
    }

    public static int enter() {
        Scanner s = new Scanner(System.in);
        int z = s.nextInt();
        return z;
    }

    public static void main(String[] args) {
        System.out.print("Enter n number first fibonacci want to print to the screen: ");
        int n = enter();
        long[] B = printTheFirstNNumberFibonacci(n);
        System.out.println("\nEnter n number first prime want to print to the screen: ");
        int m=enter();
        printTheFirstNNumberPrime(m);

    }
}
