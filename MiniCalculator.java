//Q2)WAP to create a mini calculator ask the user what operation the user wants to perform, 
//and repeat the task till the user wants to perform any operation.
package com.AngularJava.ThursdayLab;

import java.util.Scanner;

public class MiniCalculator {
	int num1,num2;
	void menu() {
		char yesno;
		Scanner sc= new Scanner(System.in);
		do {
			System.out.println("\n>>>>>Menu<<<<<"
					+ "\n1)Addition"
					+ "\n2)Subtraction"
					+ "\n3)Multiplication"
					+ "\n4)Divsion"
					+ "\n4)Modulos");
			System.out.print("Enter choice:");
			int ch=sc.nextInt();
			switch(ch) {
				case 1->addition();
				case 2->subtraction();
				case 3->multiplication();
				case 4->divsion();
				case 5->modulos();
				default->System.out.println("Enter valid choice");
			}
			System.out.println("Do you want to perform more operations y/n");
			yesno=sc.next().charAt(0);
			
		}while(yesno=='y' ||yesno=='Y');
	}
	int acceptNo() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number: ");
		int no=sc.nextInt();
		return no;
	}
	void addition() {
		num1=acceptNo();
		num2=acceptNo();
		System.out.println("\n>>>Addition<<<");
		System.out.println(num1+" + "+num2+" = "+(num1+num2));
	}
	void subtraction() {
		num1=acceptNo();
		num2=acceptNo();
		System.out.println("\n>>>Subtraction<<<");
		System.out.println(num1+" - "+num2+" = "+(num1-num2));
	}
	
	void multiplication() {
		num1=acceptNo();
		num2=acceptNo();
		System.out.println("\n>>>Multiplication<<<");
		System.out.println(num1+" * "+num2+" = "+(num1*num2));
	}
	
	void divsion() {
		num1=acceptNo();
		num2=acceptNo();
		if(num2==0) {
			System.out.println("Division cannot possible");
		}else {
			System.out.println("\n>>>Divsion<<<");
			System.out.println(num1+" / "+num2+" = "+(num1/num2));
		}
	}
	
	
	void modulos() {
		num1=acceptNo();
		num2=acceptNo();
		System.out.println("\n>>>Modulos<<<");
		System.out.println(num1+" % "+num2+" = "+(num1%num2));
	}
	public static void main(String[] args) {
		MiniCalculator cal= new MiniCalculator();
		cal.menu();

	}

}
