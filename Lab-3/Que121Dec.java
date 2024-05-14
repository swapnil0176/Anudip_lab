/*Write a program to do the process by using inheritance. create a class which will having the process of prime number  series, check the given no is palindrome number. Create another class which will check the given no is armstrong number or not .and also will display teh following pattern
generate below pattern


1      
121
12321
1234321
Multilevel Inheritance*/
package lab3;
import java.util.*;

class primeseries
{ 
	public void checkprimeNo(int num)
	{
		//To check no. is prime or not
		int count=0,i=2;
		while(count<num) {
			boolean flag=true;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					flag=false;
					break;
				}
			}
			if(flag==true) {
				count++;
				System.out.print(i+" ");
			}
			i++;
		}
    }
	public void checkpalindrome(int num)
	{
		int sum=0;
		int temp=num,ld;
		while(temp>0)
		{
			ld=temp%10;
			sum=(sum*10)+ld;
			temp=temp/10;
		}
		if(num==sum)
			System.out.println("no.is palindrome");
		else
			System.out.println("no.is not palindrome");
	}
}
class armstrong extends primeseries
{
	public void checkarmstrong(int num)
	{
		int temp;
		int count=0;
		int sum=0;
		temp=num;
		int ld=0;
		while(temp>0)
		{
			temp/=10;
			count++;
		}
		temp=num;
		while(temp>0)
		{   ld=temp%10;
			sum+=(Math.pow(ld,count));
			temp=temp/10;
		}
		if(sum==num)
		{
			System.out.println("no.is armstrong");
		}
		else
			System.out.println("no.is not armstrong");
	}
	public void displaypattern(int num)
	{
		int i,j;
		for(i=1;i<=num;i++)
		{
			for(j=1; j<=i; j++)
	        {
				System.out.print(j);
	        }
	        for(j=i-1; j>=1; j--)
	        {
	        	System.out.print(j);
	        }
	        System.out.println("\n");
		}
	}
}

class Que121Dec extends armstrong
{

	public void menu()
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("\n******Operations*******\n1.checkPrime\n2.checkpalindrome\n3.checkarmstrong\n4.display pattern\n5.Exit\n");
			System.out.println("Enter your choice: ");
			int ch=sc.nextInt();
			int n;
			switch(ch)
			{
				case 1:
					System.out.println("Enter no.: ");
					n=sc.nextInt();
					checkprimeNo(n);
					break;
				case 2:
					System.out.println("Enter no.: ");
					n=sc.nextInt();
					checkpalindrome(n);
					break;
				case 3:
					System.out.println("Enter no.: ");
					n=sc.nextInt();
					checkarmstrong(n);
					break;
				case 4:
					System.out.println("Enter no.: ");
					n=sc.nextInt();
					displaypattern(n);
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
		Que121Dec obj=new Que121Dec();
		obj.menu();
	}
}
