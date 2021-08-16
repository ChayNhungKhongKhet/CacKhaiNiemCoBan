package com.cackhainiemcoban.ConditionalLoop;

import java.util.Scanner;

public class PrintNumberPrimeLessN {
    public static boolean conditionalChooseNumberPrime(int n) {
        if (n ==2 ) {
            return true;
        }
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static int enter() {
        System.out.println("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        return c;
    }

    public static void main(String[] args) {
        int n = enter();
        for (int i = 2; i < n; i++) {
            if (conditionalChooseNumberPrime(i)) {
                System.out.println(i);
            }
        }
    }
}