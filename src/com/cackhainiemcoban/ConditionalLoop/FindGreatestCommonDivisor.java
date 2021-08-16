package com.cackhainiemcoban.ConditionalLoop;

import java.util.Scanner;

public class FindGreatestCommonDivisor {
    public static int findGreatestCommonDivisor(int a, int b) {
        int greatestCommonDivisor = 0;
        if (a <= b) {
            for (int i = 1; i <= a; i++) {
                if (a % i == 0 && b%i==0) {
                        greatestCommonDivisor = i;
                }
            }

        } else {
            for (int i = 1; i <= b; i++) {
                if (b % i == 0 && a % i ==0 ) {
                        greatestCommonDivisor = i;

                }
            }
        }if(a==0) {
            return  b;
        }
        if(b==0) {
            return a;
        }

        return greatestCommonDivisor;
    }

    public static int enter() {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        return z;
    }

    public static void main(String[] args) {
        int d = findGreatestCommonDivisor(enter(), enter());
        System.out.println("Greatest common divisor is : = "+d);
    }
}