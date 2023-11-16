//3)Write a program to accept choice from the user and perform the operation
//        1.Find out greater between 3 NO
//        2.Check given no is even or odd
//        3.Check the given character is vowel or not
//        4.check the given no is divible by 5 or not
package com.AngularJava;

import java.util.Scanner;

public class MenuDriven16Nov {
    void checkLargestNo(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3)
            //check for first number
            System.out.println(num1 + " is the largest number.");

        else if (num2 >= num1 && num2 >= num3)
            //check for second number
            System.out.println(num2 + " is the largest number.");

        else
            //check for last number
            System.out.println(num3 + " is the largest number.");
    }

    public static void main(String[] args) {
        MenuDriven16Nov m = new MenuDriven16Nov();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(">>>>>>>MENU<<<<<<\n1.Find out greater between 3 NO\n" +
                    "2.Check given no is even or odd\n" +
                    "3.Check the given character is vowel or not\n" +
                    "4.check the given no is divisible by 5 or not"+
                    "5.Exit");
            System.out.println("Enter your choice");
            int ch = sc.nextInt();
            switch (ch) {

                case 1 -> {
                    //Accepting 3 numbers
                    System.out.println("Enter first number");
                    int num1 = sc.nextInt();
                    System.out.println("Enter second number ");
                    int  num2 = sc.nextInt();
                    System.out.println("Enter third number ");
                    int num3 = sc.nextInt();
                    //using non static function checkLargestNo 3 numbers pass to function
                    m.checkLargestNo(num1, num2, num3);
                }
                case 2 -> {
                    System.out.println("Enter number");
                    int num1 = sc.nextInt();
                    if (num1 % 2 == 0)
                        //check for number is even
                        System.out.println("Number is even");
                    else
                        //check for number is odd
                        System.out.println("Number is odd");

                }
                case 3 -> {
                    System.out.println("Enter character");
                    char character = sc.next().charAt(0);
                    switch (character) {
                        case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' ->
                                // this check the character is vowel or not
                        System.out.println("You enter Vowel");
                        default ->
                            //if character is not vowel then it also special character,integer or constant
                                System.out.println("You enter either special character,integer or constant");
                    }

                }
                case 4 -> {
                    System.out.println("Enter number");
                    int num1 = sc.nextInt();
                    if (num1 % 5 == 0)
                        //mod is 0 then this condition is true
                        System.out.println("Number is divisible by 5");
                    else
                        //num is not divisible by 5 then it comes to else block
                        System.out.println("Number is NOT divisible by 5");
                }
                case 5->System.exit(0);
                default -> System.out.println("Enter valid case");
            }
        }
    }
}
