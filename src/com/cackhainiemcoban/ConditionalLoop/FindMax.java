package com.cackhainiemcoban.ConditionalLoop;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        int a = enter();
        int b = enter();
        findMax(a, b);
    }
    public static void findMax(int x, int y) {
        if (x >= y) {
            System.out.println("The number bigger is :" + x);
        } else {
            System.out.println("The number bigger is :" + y);
        }
    }
    public static int enter(){
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        return z;
    }

}


