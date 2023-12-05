package com.AngularJava.DailyPrograms;

public class Staff_bank extends Bank_BOB
{
    String mail_id,pan_no;
    int type_ac,choice;
    int age,phone;
    public void cus_supp()
    {
        System.out.println("1:For new Ac \n2:Any kind help");
        choice=sc.nextInt();
        if(choice==1)
        {
            new_ac_create();
            System.out.println("Account created Successfully :)");

        }
        else
        {
            call_support();
        }


    }

    public void call_support()
    {
        System.out.println("You can contact by call , Email Or MSG for any kind of support");
    }
    public void new_ac_create()
    {
        System.out.println("Enter Your name:");
        name=sc.next();
        System.out.println("Type of Account \n1:Major \n2:Minor");
        type_ac=sc.nextInt();
        switch(type_ac)
        {
            case 1:
                System.out.println("Enter initial amount to create account");
                balance=sc.nextInt();
                System.out.println("Enter Your Pan No");
                pan_no=sc.next();
                break;
            case 2:
                System.out.println("Zero balance ac will create.");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        System.out.println("Enter Your age");
        age=sc.nextInt();
        System.out.println("Enter Your aadhar No");
        adhar_no=sc.nextLong();

    }
    public void ac_user_display() {
        if (name == null || adhar_no == 0) {
            System.out.println("Please create an account...");
        }
        else {
            System.out.println("Name:" + name);
            System.out.println("Age:" + age);
            System.out.println("Aadhar No:" + adhar_no);
            switch (type_ac) {
                case 1:
                    System.out.println("Pan No:" + pan_no);
                    break;
            }
            System.out.println("Accout Balance:" + balance);
        }
    }
}