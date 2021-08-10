package com.cackhainiemcoban.ConditionalLoop;

import java.util.Scanner;

public class FindDaysFromInputMonth {
    public static int enter(){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        return a;

    }
    public static void findTheNumberOfDays(int z){
        if (z==4 || z==6 || z==9 ||z==11){
            switch (z){
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("Month has 30 days");
            }
        }
        if (z==1 || z==3 || z==5 || z==7 || z==8 || z==10){
            switch (z){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Month has 31 days");
            }
        }
        if (z==2){
            System.out.println("Month has 29 days");
        }
        else {
            System.out.println("You enter invalid,please re-run and enter true !");
        }
    }

    public static void main(String[] args) {
        int z= enter();
        findTheNumberOfDays(z);
    }

}
