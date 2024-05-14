//Write a program to create automobile serive( Car Service Center ) by using inhertitance , Encapsulation, Abstraction, Polymorphism


package thursdaylab4;

import java.util.*;

public class Car_serviceCenter extends CarServices implements ServiceOffice
{
	public long contactno;
	String c_name,address,carname;
	String model,reg_no;
	Scanner sc=new Scanner(System.in);
	Car_serviceCenter(){
		
	}
	Car_serviceCenter(String c_name,String address,int contactno,String carname,String model,String reg_no)
	{
		this.c_name=c_name;
		this.address=address;
		this.contactno=contactno;
		this.carname=carname;
		this.model=model;
		this.reg_no=reg_no;
	}
	public void customerdetails()
	{
		
		System.out.println("***********Welcome to Car Service Center*************");
		System.out.println("Enter Customer Name: ");
		c_name=sc.next();
		System.out.println("Enter Address: ");
		address=sc.next();
		System.out.println("Enter contact no.: ");
		contactno=sc.nextLong();
	}
	public void cardetails()
	{
		System.out.println("Enter Car Details=>    ");
		System.out.println("Enter car name: ");
		carname=sc.next();
		System.out.println("Enter car model: ");
		model=sc.next();
		System.out.println("Enter car reg.no.: ");
		reg_no=sc.next();
	}
	public void services()
	{
		int ch;
		char yesno;
		do {
		System.out.println("Services provided By Our Center:  ");
		System.out.println(" 1).Car Repairing \n 2).car washing\n 3).Any other service you want");
		System.out.println("Which service you want : ");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				carrepaire();
				break;
			case 2:
				carWash();
				break;
			case 3:
				System.out.println("Bill is fix extra service.....");
				System.out.println("Enter service you want: ");
				String service=sc.next();
				bill+="\nextra service               150 Rs.";
				break;
			default:
				System.out.println("Enter valid choice only!!!!");
		}
		 System.out.println("You want to more services(y/n):  ");
		 yesno=sc.next().charAt(0);
		}while (yesno=='Y' || yesno=='y');
	}
	
	public void display()
	{
		System.out.println(" Customer name : "+c_name);
		System.out.println(" Customer address: "+address);
		System.out.println(" Customer contactno: "+contactno);
		System.out.println(" Car name: "+carname);
		System.out.println(" car model: "+model);
		System.out.println(" car Register no: "+reg_no);
		displayBill();
	}
	
	public void displayBill()
	{
		    System.out.println(">>>>>>>> Bill Details <<<<<<<<<<<<");
	        System.out.print("Service Name                  Price");
	        System.out.println(bill);
	        System.out.println("-------------------------------------\n" +
	                "Total                       "+getPrice()+"Rs");
	        payment();
	}
	
	public void payment()
	{
		boolean f=true;
		int ch,otp;
		do {
			System.out.println("-----Payment Mode------");
			System.out.println("\n1:Google pay\n2: Phone pay\n3:Paytm\n4:cash");
			System.out.println("select payment mode");
			ch=sc.nextInt();
			int temp=0176;
			switch(ch)
			{
			case 1:
				System.out.println("Welcome to Google pay mode \nEnter your OTP: ");
				otp=sc.nextInt();
				if(temp==otp)
				{
					 System.out.println("Payment Done.....\nThank you!\nSir Please visit again....");
					 f=false;
				}
				else 
				{
					System.out.println("Entered wrong OTP");
				}
			    break;
			case 2:
				 System.out.println("Welcome to Phone pay mode \nenter your OTP");
                 otp=sc.nextInt();
                 if(temp==otp) {
                     f=false;
                     System.out.println("Payment Done.....\nThank you!\nSir Please visit again....");
                 } else {
                     System.out.println("Enter wrong OTP");
                 }
                 break;
			case 3:
				System.out.println("Welcome to Paytm mode \nenter your OTP");
                otp= sc.nextInt();
                if (temp == otp) {
                    f=false;
                    System.out.println("Payment Done.....\nThank you!\nSir Please visit again....");
                } else
                {
                    System.out.println("Enter wrong OTP");
                }
                break;
			case 4:
				 f=false;
                 System.out.println("Payment Done.....\nThank you Sir Please visit again....");
                 break;
             default:
            	 System.out.println("Payment process not done\nPlease try again");
			}
		}while(f);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car_serviceCenter c=new Car_serviceCenter();
		c.customerdetails();
		c.cardetails();
		c.services();
		c.display();
	}

}
