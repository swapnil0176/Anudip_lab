//Write a program to perform the choice
//        1:Sum of digit
//        2:Prime No
//        3:Fibonacci series
//        Using Function
package com.AngularJava.DailyPrograms;
import java.util.Scanner;

public class Dec2MenuDriven {
    public  void menu(){
        do {
            System.out.println("-->-->-->--> MENU <--<--<--<--\n" +
                    "1:Sum of digit\n" +
                    "2:Prime No\n" +
                    "3:Fibonacci series\n" +
                    "4:Exit");
            System.out.print("Enter Choice: ");
            Scanner sc=new Scanner(System.in);
            int ch=sc.nextInt();
            switch (ch){
                //calling the sum Of digit function in these we use accept function to accept number and pass to sum of digit function
                case 1->System.out.println("The sum of digit is: "+sumOfDighit(accept()));
                //calling of check prime function
                case 2->checkPrime(accept());
                //calling of fibonacciSeries function
                case 3->fibonacciSeries(accept());
                case 4->System.exit(0);
                default->System.out.println("Enter valid case ");
            }
        }while(true);
    }
    public void fibonacciSeries(int num){
        System.out.print(0+" "+1);
        int num1=0,num2=1,num3;
        for(int i=2;i<=num;i++){
            num3=num1+num2;//store the addition of num1 and num2 in num3
            num1=num2;//swapping the values
            num2=num3;//swapping the values
            System.out.print(" "+num3);
        }
    }
    public void checkPrime(int num){
        //checking 0,1 these numbers are not prime numbers
        if(num==1 || num==0){
            System.out.println(num+" number is NOT prime");
            return;
        }else if(num==2){
            System.out.println(num+" is prime number");
        }
        boolean f=true;
        for (int i=2;i<=num/2;i++){
            if(num%i==0){
                f=false;
                break;
            }
        }
        if(f){
            //if f value is true the print the below statement
            System.out.println(num+" is prime number");
        }
        else {
            System.out.println(num+" is NOT prime number");
        }

    }
    public int accept(){
        //accept the number
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number ");
        int num=sc.nextInt();
        //return the accepted number
        return num;
    }
    public int sumOfDighit(int num){
        int sum=0;
        while(num!=0){
            sum+=num%10;//get a last digit of number and add in sum
            num/=10;
        }
        //return sum of digit
        return sum;
    }
    public static void main(String[] args) {
        //calling menu function
        new Dec2MenuDriven().menu();
    }
}
