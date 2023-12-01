package com.AngularJava;

public class PyramidPattern {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int space=5-i;space>1;space--){
                System.out.print(" ");
            }
            for(int j=0;j<i*2+1;j++ )
                System.out.print("*");
            System.out.println();
        }
    }
}
