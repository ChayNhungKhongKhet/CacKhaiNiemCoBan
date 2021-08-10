package com.cackhainiemcoban.ConditionalLoop;

import java.util.Scanner;

public class NumberEvenOrOdd {
    public static void main(String[] args) {
        int x = enterOneNumber();
        checkParity(x);
    }

    public static int enterOneNumber() {
        System.out.println("Enter one number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        return x;
    }

    public static void checkParity(int x) {
        if (x % 2 == 0) {
            System.out.println("The input number is even");
        } else {
            System.out.println("The input number is odd");
        }
    }


}
