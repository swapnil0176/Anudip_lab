package com.AngularJava;

import java.util.Scanner;

public class DecendingSort {
    static int size;
    static int [] arr;

    public static void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many array elements you want: ");
        size=sc.nextInt();
        arr=new int[size];
        System.out.println("Enter "+size+" array elements");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
    }
    public static void display(){
        for (int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sortDescending(){
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<size;i++){
            for (int j=i+1;j<size;j++){
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("\nDescending order elements are:");
        display();
    }
    public static void main(String[] args) {
        accept();
        System.out.print("Array elements are: ");
        display();
        sortDescending();

    }
}
