package com.cackhainiemcoban.Arrays;

import java.util.Scanner;

public class ParsingIntoPrimes {
    public static void printPrimesParsingFromN(int n){
        int i=2;
        if (n==1){
            System.out.println("="+n);
        }
        else {
            if (conditionalChooseNumberPrime(i)) {
                while (n > 1) {
                    if (n % i == 0) {
                        n = n / i;
                        System.out.print(i + " x" + " ");
                    } else {
                        i++;
                    }
                }
            }
            System.out.print("\b\b\b");
        }

    }
    public static boolean conditionalChooseNumberPrime(int n) {
        if (n <2 ) {
            return true;
        }
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int enter(){
        Scanner s= new Scanner(System.in);
        int z =s.nextInt();
        return z;
    }

    public static void main(String[] args) {
        int b=enter();
        printPrimesParsingFromN(b);
    }
}
