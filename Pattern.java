package com.AngularJava;

public class Pattern {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=4;i++) {
            for (j = 1; j <= 7; j++) {
                if (i == 1 || i == 4 || j == 1 || j == 7)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
