
package com.AngularJava;

public class Pattern10 {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            for (int space=1;space<i;space++){
                System.out.print(" ");
            }
            for (int j=5;j>=i;j--) {
                if ((j+i)%2==0)
                    System.out.print("1");
                else System.out.print("0");
            }
            System.out.println();
        }
    }
}
