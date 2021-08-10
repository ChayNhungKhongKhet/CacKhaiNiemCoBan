package com.cackhainiemcoban.ConditionalLoop;

import java.util.Scanner;

public class DaysOfWeek {
    public static int enter() {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
       if(a>=0 && a<=7){
           return a;
       }
       else{
           System.out.println("Retype this number is invalid,please !");
           int b= sc.nextInt();
           return b;
       }
    }
    public static void conditionalChooseDays(int a) {
            switch (a) {
                case 0:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
                case 7:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("Had not day");
            }


    }
    public static void main(String[] args) {
        int c= enter();
        conditionalChooseDays(c);
    }
}
