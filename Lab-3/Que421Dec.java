/*Q4)Create an interface called "BankAccount" with methods called "deposit" and "withdraw". Create a class called "CheckingAccount"
 *  that implements the BankAccount interface and implements the "deposit" and "withdraw" methods. Create an object of the CheckingAccount 
 *  class and call both the "deposit" and "withdraw" methods.1.Create a parent class called "Vehicle" with attributes such as brand, model, 
 *  year, and a method called "drive". Create a child class called "Car" that inherits from Vehicle and has an additional attribute called "color" and a
 *   method called "honk". Create an object of the Car class and call both the "drive" and "honk" methods. 

*/
package lab3;

interface BankAccount
{
	void deposit();
	void withdraw();
}
class CheckingAccount implements BankAccount
{
	public void deposit()
	{
		System.out.println("I am in deposit method");
	}
	public void withdraw()
	{
		System.out.println("I am in withdraw method");
	}
}
class Vehicle 
{
	 String brand="TATA Harrier",model="XUV";
	 int year=2015;
	 public void drive()
	 {
		 System.out.println("Drive Method----");
		 System.out.println("Brand: "+brand);
		 System.out.println("Model: "+model);
		 System.out.println("year: "+year);
	 }
}
class Car extends Vehicle
{ 
	String colour="Black";
	public void honk()
	{
		System.out.println("Honk Method----");
		System.out.println("colour: "+colour);
	}
}
public class Que421Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckingAccount c=new CheckingAccount();
		c.deposit();
		c.withdraw();
		System.out.println("\nCar Info....");
		Car k=new Car ();
		k.drive();
		k.honk();
	}
}
