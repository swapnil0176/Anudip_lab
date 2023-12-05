package com.AngularJava.DailyPrograms;

import java.util.Scanner;

public class Bank_BOB
{
    int  balance=0;
    int amount;
    String name;
    long adhar_no;
    Scanner sc=new Scanner(System.in);
    public void Main_balance()
    {
        System.out.println(name+" "+adhar_no);
        if(name==null || adhar_no==0){
            System.out.println("Please create an account...");
        }
        else{
            System.out.println("The account balance is ="+balance);
        }

    }
    public void depo_process()
    {
        if(name==null || adhar_no==0){
            System.out.println("Please create an account...");
        }else {
            System.out.println("Enter Your amount");
            amount = sc.nextInt();
            if (amount <= 0) {
                System.out.println("Enter valid amount");
            } else {
                balance += amount;
            }
        }

    }
    public void with_process()
    {
        if(name==null || adhar_no==0){
            System.out.println("Please create an account...");
        }else {
            System.out.println("Enter Your amount");
            amount = sc.nextInt();
            if (amount <= 0) {
                System.out.println("Enter valid amount");
            } else if (amount > balance) {
                System.out.println("Your balance is low...");
            } else {
                balance -= amount;
            }
        }
    }
}
