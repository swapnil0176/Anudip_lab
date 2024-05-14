package lab3;

import java.util.Scanner;

public class Que321Dec {

	String cust_name;
	long mobileno;
	double cost,amount,dis;
	Scanner sc= new Scanner(System.in);
	Que321Dec(){
		cust_name=null;
		mobileno=0;
		cost=0;
		amount=0;
	}
	void input() {
		System.out.println("\nWelcomes to Swapnil`s Furniture Showroom");

		System.out.print("Enter name:- ");
		cust_name=sc.nextLine();
		System.out.print("Enter mobile number:- ");
		mobileno=sc.nextInt();
		furniture();
		display();
	}
	void chooseSofas() {
		System.out.println("Item name\t\t Price"
				+ "\n1)Fabric sofa  5000"
				+ "\n2)Leatherrette sofa   6000"
				+ "\n3)Sofa Cum Beds   8000");
		System.out.print("Select Item:- ");
		int choose=sc.nextInt();
		switch(choose) {
			case 1->cost+=5000;
			case 2->cost+=6000;
			case 3->cost+=8000;
			default->System.out.println("Enter valid case");
		}
	}
	void chooseChairs() {
		System.out.println("\nItem name\t\t Price"+
				"\n1)Lounge Chairs	 3,799"+
				"\n2)Accent Chairs	 3,799"+
				"\n3)Recliners  11,839");
		System.out.print("Select Item:- ");
		int choose=sc.nextInt();
		switch(choose) {
			case 1->cost+=3799;
			case 2->cost+=3799;
			case 3->cost+=11839;
			default->System.out.println("Enter valid case");
		}
	}
	void chooseTable() {
		System.out.println("Product List\t\t  Price"+
				"\n1)Meraki Coffee Table  19,580"
				+"\n2)Caliber 202 Computer Table 7,480"
				+"\n3)Grove Bedside Table 9,180"
				+"\n4)Arbor Side Table	 8,910");
		System.out.print("Select Item:- ");
		int choose=sc.nextInt();
		switch(choose) {
			case 1->cost+=19580;
			case 2->cost+=7480;
			case 3->cost+=9180;
			case 4->cost+=8910;
			default->System.out.println("Enter valid case");
		}
	}
	void furniture() {
		Scanner sc= new Scanner(System.in);
		char choice;
		do {
			System.out.println("\nSections"
					+ "\n1)Sofas"
					+ "\n2)Chairs"
					+ "\n3)Tables");
			int select=sc.nextInt();
			switch(select) {
				case 1->chooseSofas();
				case 2->chooseChairs();
				case 3->chooseTable();
				default ->System.out.println("Enter valid case");
			}
			System.out.println("You want to purchase more items y/n");
			choice=sc.next().charAt(0);
		}while(choice=='y' ||choice=='Y');
		
	}
	
	void calculate() {
		if(cost<10000) {
			 dis = (cost*5)/100;
			dis=((cost-(cost*0.05))/cost)*100;
			System.out.println("Total amount:- "+cost);
			System.out.println("Discount:-"+dis);
			System.out.println("Bill you have to pay:- "+(cost-dis));
			
		}
		else if(cost<20000) {
			dis = (cost*10)/100;
			System.out.println("Total amount:-  "+cost);
			System.out.println("Discount:- "+dis);
			System.out.println("Bill you have to pay:- "+(cost-dis));
		}
		else if(cost<=35000) {
			dis = (cost*15)/100;
			System.out.println("Total amount:-  "+cost);
			System.out.println("Discount:- "+dis);
			System.out.println("Bill you have to pay:- "+(cost-dis));
		}
		else {
			dis = (cost*20)/100;
			System.out.println("Total amount:-   "+cost);
			System.out.println("Discount:- "+dis);
			System.out.println("Bill you have to pay:- "+(cost-dis));
		}
	}
	void display() {
		System.out.println("Customer name:- "+cust_name);
		System.out.println("Customer mobile number:- "+mobileno);
		calculate();
		
	}
	public static void main(String[] args) {
		Que321Dec s = new Que321Dec();
		s.input();
	}

}
