package com.AngularJava.ThursdayLab.Anudip_lab;

import java.util.Scanner;

public class CarWashing extends CarService{//single inheritance is use
    public void carWashing() {
        //incomplete method is completed
        Scanner sc= new Scanner(System.in);
        System.out.println("\n1)Car Wash                      200 Rs" +
                "\n2)Car Wash with Deep Cleaning   300 Rs" +
                "\n3)Deep cleaning                 100 Rs" );
        System.out.println("Enter choice ");
        int ch=sc.nextInt();
        switch(ch){
            case 1-> {
                    System.out.println("For Car wash charges 200 Rs");
                    bill+="\nCar Wash                     200 Rs";
                    setPrice(200 + getPrice());
            }

            case 2->{
                System.out.println("For Car wash with deep clean charges 300 Rs");
                bill+="\nCar Wash with deep clean     300 Rs";
                setPrice(300 + getPrice());
            }
            case 3->{
                System.out.println("For Deep clean charges 100 Rs");
                bill+="\nDeep cleaning                100 Rs";
                setPrice(100 + getPrice());
            }
            default -> System.out.println("Enter valid case");
        }
    }
}
