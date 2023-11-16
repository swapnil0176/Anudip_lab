//2)Write a program to accept age and gender from the user and check the ROI according to condition
//        above 60  M: 7% F: 7.5%
//        below 60 M,F: 5%
//        eg( age : 20 G: M  ROI=7%)
package com.AngularJava;

import java.util.Scanner;

public class CheckRateOfInterest16Nov {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //accepting the age of user
        System.out.println("Enter age ");
        int age=sc.nextInt();
        //accepting the gender of user
        System.out.println("Enter gender ");
        String gender=sc.next();
        if(age>=60){
            switch (gender){
                case "Male","male"->
                        //male have interest rate is 7%
                System.out.println("Age= "+age+"\n"+"Gender= "+gender+"\nRate of interest rate is 7%");
                case "Female","female"->
                    //female have interest rate is 7%
                        System.out.println("Age= "+age+"\n"+"Gender= "+gender+"\nRate of interest rate is 7.5%");
                default -> System.out.println("Enter valid gender");
            }
        }
        else
            //both have same interest rate
            System.out.println("Age= "+age+"\n"+"Gender= "+gender+"\nFor you rate of interest rate is 5%");
    }
}
