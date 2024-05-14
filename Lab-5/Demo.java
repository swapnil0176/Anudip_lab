/*Q.4) Write a Java program which creates only one object. If user attempts to create second 
 * object, he should not be able to create it. (Using user defined Exception).*/
package thursdayLab5;

class Demo {
    
	public static void main(String[] args)
	{
		try {
			ObjectCall o1=new ObjectCall();
			System.out.println("1st object created");
			ObjectCall o2=new ObjectCall();
			System.out.println("2nd object created");
			ObjectCall o3=new ObjectCall();
			System.out.println("3rd object created");
		}
		catch(NoMoreException e)
		{
			System.out.println(e);
		}
	}
}
