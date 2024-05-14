/*1.Write a method that takes a String and returns a String of the same length containing 
 * the 'X' character in all positions except the last 4 positions. The characters in the last 4 positions 
 * must be the same as in the original string. For example, if the argument is
 "12345678", the return value should be "XXXX5678".
 */
package thursdayLab9;
import java.util.*;

public class Number {
	String str;
	Scanner sc=new Scanner(System.in);
	public void accept()
	{
		System.out.println("Enter the number: ");
	    str=sc.next();
	    System.out.println(makeNumber(str));
	}
	public String makeNumber(String n)
	{
		 if (n == null || n.length() < 4) 
		 {
	         return n;
	     }
	        int length = n.length();
	        String change= "X".repeat(length - 4) + n.substring(length - 4);
	        return change;
	}
	public static void main(String[] args)
	{
		Number nr=new Number();
		nr.accept();
		
	}

}
