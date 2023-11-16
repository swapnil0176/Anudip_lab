//1)Write a program to accept choice from the user and display the output
//        1.Arithmetic operator
//        2.Logical Operator
//        3.Relational Operator
//        4.Bitwise Operator
//        5.Conditional Operator
//        6.Assignment Operator
package com.AngularJava;

import java.util.Scanner;

public class MenuDrivenAllOperator {
    Scanner sc= new Scanner(System.in);
    void aritmeticOpertor(){
        //Accepting inputs
        System.out.println("Enter number 1");
        int num1=sc.nextInt();
        System.out.println("Enter number 2");
        int num2=sc.nextInt();
        System.out.println("Enter operator out of these + - * % /");
        char ch=sc.next().charAt(0);
        switch(ch){
            case '+'-> System.out.println("Addition of "+num1+"+"+num2+"="+(num1+num2));
            case '-'-> System.out.println("Subtraction of "+num1+"-"+num2+"="+(num1-num2));
            case '*'-> System.out.println("Multiplication of "+num1+"*"+num2+"="+(num1*num2));
            case '/'-> System.out.println("Division of "+num1+"/"+num2+"="+(num1/num2));
            case '%'-> System.out.println("Mod of "+num1+"%"+num2+"="+(num1%num2));
        }
    }
    void logicalOpertor(){
        System.out.println("Enter number 1");
        int num1=sc.nextInt();
        System.out.println("Enter number 2");
        int num2=sc.nextInt();
        System.out.println("Enter number 3");
        int num3=sc.nextInt();
        System.out.println("Enter choice \n1.Logical AND(&)\n2.Logical OR(||)\n3.Logical NOT(!)");
        int ch=sc.nextInt();
        switch(ch){
            case 1->{
                if ((num1 >= num2) && (num1 >= num3))
                    System.out.println(num1 + " is the largest number.");
                else
                    System.out.println(num1 + " is the smaller number than ."+num1+" & "+num2);
            }
            case 2->{
                if (num1 > num2 || num2 == num3)
                    System.out.println("One or both the conditions are true");
                else
                    System.out.println("Both the + conditions are false");
            }
            case 3->{
                if(!(num1==0))
                    System.out.println("Number is not 0");
                else
                    System.out.println("Number is 0");
            }
            default -> System.out.println("You enter wrong choice");
        }
    }
    void relationalOperator(){
        System.out.println("Enter number 1");
        int num1=sc.nextInt();
        System.out.println("Enter number 2");
        int num2=sc.nextInt();
        System.out.println("Enter choice \n1.>\n2.<\n3.>=\n4.<=\n5.==\n6)!=");
        int ch=sc.nextInt();
        switch(ch){
            case 1->{
                if ((num1>num2))
                    System.out.println(num1 + " is the largest number.");
                else
                    System.out.println(num1 + " is the smaller number than ."+num1+" & "+num2);
            }
            case 2->{
                if (num1 < num2 )
                    System.out.println(num1+" less than "+num2);
                else
                    System.out.println(num1+" Not less than "+num2);
            }
            case 3->{
                if ((num1>=num2))
                    System.out.println(num1 + " is the greater than equal to "+num2);
                else
                    System.out.println(num1 + " is the smaller number than "+num1+" & "+num2);
            }
            case 4->{
                if (num1 <= num2 )
                    System.out.println(num1+" less than or equal "+num2);
                else
                    System.out.println(num1+" Not less than or equal "+num2);
            }
            case 5->{
                if(!(num1==num2))
                    System.out.println(num1+" is equal to "+num2);
                else
                    System.out.println(num1+" is NOT equal to "+num2);
            }
            case 6->{
                if(!(num1!=num2))
                    System.out.println(num1+" is Not equal to "+num2);
                else
                    System.out.println(num1+" is  equal to "+num2);
            }
            default -> System.out.println("You enter wrong choice");
        }
    }
    void bitwiseOperator(){
        System.out.println("Enter number 1");
        int num1=sc.nextInt();
        System.out.println("Enter number 2");
        int num2=sc.nextInt();
        System.out.println("Enter choice \n1.&\n2.|\n3.^\n4.~\n");
        int ch=sc.nextInt();
        switch (ch){
            case 1->System.out.println("num1 & num2 = " + (num1 & num2));
            case 2-> System.out.println("num1 | num2 = " + (num1 | num2));
            case 3-> System.out.println("num1 & num2 = " + (num1 ^ num2));
            case 4-> System.out.println("~ num2 = " + ( ~num2));
            default -> System.out.println("You enter wrong choice");        }
    }
    void conditionalOperator(){
        System.out.println("Enter number 1");
        int num1=sc.nextInt();
        System.out.println("Enter number 2");
        int num2=sc.nextInt();
        System.out.println( (num1 == num2) ? num1: num2);
    }
    void assignmentOperator(){

    }
    public static void main(String[] args) {
        MenuDrivenAllOperator m= new MenuDrivenAllOperator();
        Scanner sc= new Scanner(System.in);
        while(true){
            System.out.println(">>>>MENU<<<<\n" +
                    "1.Arithmetic operator\n" +
                    "2.Logical Operator\n" +
                    "3.Relational Operator\n" +
                    "4.Bitwise Operator\n" +
                    "5.Conditional Operator\n" +
                    "6.Assignment Operator");
            System.out.println("Enter your choice");
            int ch=sc.nextInt();
            switch (ch){
                case 1->
                    //use function for checking arithmetic Operator function
                m.aritmeticOpertor();
                case 2->
                    //use function for checking logical Operator function
                m.logicalOpertor();
                case 3 ->
                    //use function for checking relational Operator function
                        m.relationalOperator();
                case 4 ->
                    //use function for checking bitwise Operator function
                        m.bitwiseOperator();
                case 5 ->
                    //use function for checking the conditional Operator function
                        m.conditionalOperator();
                case 6 ->
                    //use function for checking the assignment Operator function
                m.assignmentOperator();
                default -> System.out.println("Enter valid case");
            }
        }
    }
}
