/*Q2)WAP to create a mini calculator ask the user what operation the user wants to perform, and repeat the task till the user wants to perform any operation.
*/
package lab3;

import java.util.Scanner;

class Operations
{
	Scanner sc=new Scanner(System.in);
	void addition(int n1,int n2)
	{
		int sum=n1+n2;
		System.out.println("Addition of "+n1+" and "+n2+": "+sum);
	}
	void subtraction(int n1,int n2)
	{
		int sub=n1-n2;
		System.out.println("subtraction of "+n1+" and "+n2+": "+sub);
	}
	void multiplication(int n1,int n2)
	{
		int mul=n1*n2;
		System.out.println("multiplication of "+n1+" and "+n2+": "+mul);
	}
	void division(int n1,int n2)
	{
	    double div=n1/n2;
		System.out.println("division of "+n1+" and "+n2+": "+div);
	}
}
public class Que221Dec extends Operations
{
	void menu()
	{
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			do
			{
				System.out.println("\n******Operations*******\n1.Addition\n2.Subtraction\n3.multiplication\n4.Division\n5.Exit\n");
				System.out.println("which operation you want to perform? => ");
				int ch=sc.nextInt();
				int n1,n2;
				switch(ch)
				{
					case 1:
						System.out.println("Enter 1st no: ");
						n1=sc.nextInt();
						System.out.println("Enter 1st no: ");
						n2=sc.nextInt();
						addition(n1,n2);
						break;
					case 2:
						System.out.println("Enter 1st no: ");
						n1=sc.nextInt();
						System.out.println("Enter 1st no: ");
						n2=sc.nextInt();
						subtraction(n1,n2);
						break;
					case 3:
						System.out.println("Enter 1st no: ");
						n1=sc.nextInt();
						System.out.println("Enter 1st no: ");
						n2=sc.nextInt();
						multiplication(n1,n2);
						break;
					case 4:
						System.out.println("Enter 1st no: ");
						n1=sc.nextInt();
						System.out.println("Enter 1st no: ");
						n2=sc.nextInt();
						division(n1,n2);
						break;
					case 5:
						System.exit(0);
						break;
					default:
						System.out.println("Enter valid choice only!!!");
				}
				
			}while(true);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que221Dec obj=new Que221Dec();
		obj.menu();
	}

}
