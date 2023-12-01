package com.AngularJava;

import java.util.Scanner;

public class SmallestNo {
    static int size=6;
    static int [] arr= new int[size];

    public static void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 6 array elements");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
    }
    public static void display(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Array elements are: ");
        for (int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void smallest(){
        Scanner sc = new Scanner(System.in);
        int smallestno=arr[0];
        for (int i=0;i<size;i++){
            if(smallestno>arr[i]){
                smallestno=arr[i];
            }
        }
        System.out.println("\nSmallest no is: "+smallestno);
    }

    public static void greatest(){
        Scanner sc = new Scanner(System.in);
        int greatestno=arr[0];
        for (int i=0;i<size;i++){
            if(greatestno<arr[i]){
                greatestno=arr[i];
            }
        }
        System.out.println("\nGreatest no is: "+greatestno);
    }
    public static void main(String[] args) {
        accept();
        display();
        smallest();
        accept();
        display();
        greatest();

    }
}