/*Q. Write a program to set the priorities of the thread.*/
package thursdayLab6;

import java.util.*;
public class TreadPriority extends Thread
{

	public void run()
	{
		System.out.println();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		TreadPriority th1=new TreadPriority();
		TreadPriority th2=new TreadPriority();
		TreadPriority th3=new TreadPriority();
		
		System.out.println("Priority of thread th1: "+th1.getPriority());
		System.out.println("Priority of thread th1: "+th2.getPriority());
		System.out.println("Priority of thread th1: "+th3.getPriority());
		
		for(int i=0;i<3;i++)
		{
			System.out.println("choose Thread you want to set Priority: ");
			System.out.println("1.th1\n2.th2\n3.th3");
			int ch=sc.nextInt();
			System.out.println("Enter priority: ");
			int pr=sc.nextInt();
			switch(ch)
			{
			case 1->{ th1.setPriority(pr);
				th1.start();
				System.out.println("Set Priority of thread th1 is: "+(pr));
			}
			case 2-> { th2.setPriority(pr);
				th2.start();
				System.out.println("Set Priority of thread th2 is: "+(pr));
			}
			case 3-> { th3.setPriority(pr);
				th3.start();
				System.out.println("Set Priority of thread th3 is: "+(pr));
			}
			default->
			    System.out.println("Enter valid choice");	
			}
		}
	}

}
