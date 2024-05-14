package thursdayLab6;

import java.util.*;
public class CalculatorSimulator {

	public void acceptDetails()
	{
		String empName;
		boolean isIndian;
		double empSal;
		Scanner sc=new Scanner(System.in);
		TaxCalculator tc=new TaxCalculator();
		System.out.println("Enter Employee name: ");
		empName=sc.next();
		System.out.println("Select your country: ");
		System.out.println("1.India\n2.Other");
		switch(sc.nextInt())
		{
		   case 1:
			   isIndian=true;
			   break;
		   default:
			   isIndian=false;
		}
		System.out.println("Enter your Salary: ");
		empSal=sc.nextDouble();
		try {
			System.out.println("Tax amount is:  "+tc.calculateTax(empName,isIndian,empSal));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new CalculatorSimulator().acceptDetails();
	}

}
