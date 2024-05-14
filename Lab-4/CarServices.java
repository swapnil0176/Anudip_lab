package thursdaylab4;

import java.util.*;

public class CarServices extends CarWashing 
{
	Scanner sc=new Scanner(System.in);
	int ch;
	char yesno;
	public void carrepaire()
	{
		do {
		System.out.println(" Car Repairing Services :  ");
		System.out.println(" 1).Basic Problems\n 2).Engine Problem\n 7).Exit");
		System.out.println("Which service you want : ");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				basicproblems();
				break;
			case 2:
				engineProblems();
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Enter valid choice only!!!!");
		}
		System.out.println("You want to more CarRepaire services(y/n):  ");
		yesno=sc.next().charAt(0);
		}while (yesno=='Y' || yesno=='y');
	}
	
	public void  basicproblems()
	{
		do
		{
		System.out.println("Services=>>>>"
				+ "\n1.Clutch Problem         150 Rs"
				+ "\n2.Gear Problem           100Rs"
				+ "\n3.Break Problem          200Rs");
		System.out.println("Enter your choice: ");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1: 
			 System.out.println("For Clutch Repairing you have pay 150 Rs.");
			 bill+="\nClutch problem               150 Rs.";
			 setPrice(150+getPrice());
		     break;
		case 2:
			System.out.println("For Gear Problem Repairing you have pay 100 Rs.");
			bill+="\nGear problem                 100 Rs.";
			setPrice(100+getPrice());
			break;
		case 3:
			System.out.println("For Gear Problem Repairing you have pay 100 Rs.");
			bill+="\nBreak problem                200 Rs.";
			setPrice(200+getPrice());
			break;
		default:
			System.out.println("Enter valid choice");
			System.out.println("You want to more basicproblems services(y/n):  ");
			yesno=sc.next().charAt(0);
		}
		}while (yesno=='Y' || yesno=='y');
	}
	
	public void engineProblems()
	{
		do
		{
		System.out.println("Services=>>>>"
				+ "\n1.change engine oil                        150 Rs"
				+ "\n2.Replace oil filter                       100Rs"
				+ "\n3.other service                            200Rs");
		System.out.println("Enter your choice: ");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			 System.out.println("For change engine oil you have pay 100 Rs.");
			 bill+="\nchange engine oil            150 Rs.";
			 setPrice(150+getPrice());
		     break;
		case 2:
			System.out.println("For Replace the engine oil filter you have pay 100 Rs.");
			bill+="\nReplace oil filter           100 Rs.";
			setPrice(100+getPrice());
			break;
		case 3:
			System.out.println("For other service you have pay 100 Rs.");
			bill+="\nother service                200 Rs.";
			setPrice(200+getPrice());
			break;
		default:
			System.out.println("Enter valid choice");
		
		}
		System.out.println("You want to more engineProblems services(y/n):  ");
		yesno=sc.next().charAt(0);
		}while (yesno=='Y' || yesno=='y');
	}

	public void carWash()
	{
		do
		{
		System.out.println("\n1.CarWash                      100 Rs"
				          +"\n2.Deep clean                   200Rs"
			           	  +"\n3.full wash with deep clean    300Rs");
		System.out.println("Enter your choice:  ");
		int ch=sc.nextInt();
		switch(ch)
		{           
		case 1: 
			 System.out.println("For CarWash you have pay 100 Rs.");
			 bill+="\nCarWash                      150 Rs.";
			 setPrice(100+getPrice());
		     break;
		case 2:
			 System.out.println("For Deep clean you have pay 100 Rs.");
			 bill+="\nDeep clean            	   150 Rs.";
			 setPrice(200+getPrice());
			 break;
		case 3:
			 System.out.println("For full wash with deep clean you have pay 100 Rs.");
			 bill+="\nfull wash with deep clean    150 Rs.";
			 setPrice(300+getPrice());
			break;
		default:
			System.out.println("Enter valid choice...");
		}
		System.out.println("You want to more carWash services(y/n):  ");
		yesno=sc.next().charAt(0);
		}while (yesno=='Y' || yesno=='y');
		
	}
}
