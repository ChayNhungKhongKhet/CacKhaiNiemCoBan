package com.cackhainiemcoban.ConditionalLoop;

import java.util.Scanner;

public class FindNumberPrime {
    public static boolean conditionalChooseNumberPrime(int n) {
        if (n < 2) {
            return false;
        }
        else {
            for (int i = 2; i <= (int) Math.sqrt(n); i++) {
                if (n % i == 0 && n != i) {
                    return false;
                }
            }
        }
        return true;

    }


    public static int enter() {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        return c;
    }

    public static void main(String[] args) {
        int c = enter();
        if(conditionalChooseNumberPrime(c)){
            System.out.println(c+" is prime");
        }
        else {
            System.out.println(c+" is not prime");
        }
    }
}