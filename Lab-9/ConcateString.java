/*2.Write a method that takes a String[] as an argument and returns a String containing the 
 * concatenation of all the strings in the input array. Invoke your method 3 times with 
 * different arguments. Make sure that your code handles the cases where the argument is null.
*/
package thursdayLab9;

import java.util.*;

public class ConcateString {
	Scanner sc=new Scanner(System.in);
	public static String concatenateString(String[] strings)
	{
		if (strings == null) {
            return "Input array is NULL..";
        }

        StringBuilder result = new StringBuilder();
        for (String str : strings) {
            if (str != null) {
                result.append(str);
            }
        }
        return result.toString();
	}
	public String [] acceptString()
	{
		int n;
		System.out.println("how many string you want: ");
		n=sc.nextInt();
		String [] name = new String [n];
		System.out.println("Enter String: ");
		for(int i=0;i<n;i++)
		{
			name[i]=sc.next();
		}
		return name;
	}
	public static void main(String[] args) {
		ConcateString con=new ConcateString();
		for(int i=0;i<3;i++)
		{
			String result = concatenateString(con.acceptString());
			System.out.println(result); 
		}
        
	}

}
