package com.cackhainiemcoban.ConditionalLoop;

import java.util.Scanner;

public class EnoughOld {
    public static int enter(){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        return a;
    }
    public static void conditionalOld(int a){
        if(a<0){
            System.out.println("This old not invalid");
        }
        if (0<=a&&a<18){
            System.out.println("You is young buffalo");
        }
        else {
            System.out.println("You are old enough to go to prison");
        }
        if (a>200){
            System.out.println("You is monster");
        }
    }

    public static void main(String[] args) {
        int b= enter();
        conditionalOld(b);
    }
}
