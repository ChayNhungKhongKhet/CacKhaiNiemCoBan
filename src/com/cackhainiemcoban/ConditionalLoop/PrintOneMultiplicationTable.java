package com.cackhainiemcoban.ConditionalLoop;

import java.util.Scanner;

public class PrintOneMultiplicationTable {
    public static int enterNumber(){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        return x;
    }
    public static void print(int x){
        int y;
        for(int i=1;i<=10;i++){
            y=i*x;
            System.out.println(x+ "*"+ i+ "="+y);
        }
    }

    public static void main(String[] args) {
        int a = enterNumber();
        print(a);

    }
}
