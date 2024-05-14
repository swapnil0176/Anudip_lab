//3.  Create a arraylist of students name and remove name of students who start with ‘S’ using lambda expression.
package thursdayLab10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentnamewithS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> array=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("How many Students you want: ");
		int n=sc.nextInt();
		System.out.println("Enter the Student name: ");
		for(int i=0;i<n;i++)
		{
			String name=sc.next();
			array.add(name);
		}
		System.out.println("\nOriginal list: ");
		for(String name:array)
		{
			System.out.println(name);	
		}
		array.removeIf(name->name.startsWith("S")|| name.startsWith("s"));
		
		System.out.println("\nUpdated list: ");
		for(String name:array)
		{
			System.out.println(name);	
		}
	}

}
