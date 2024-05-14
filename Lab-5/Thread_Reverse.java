package thursdayLab5;

public class Thread_Reverse extends Thread{

	public void run()
	{
		Thread thread = new Thread();
		thread.getState();
		System.out.println("display 1 to 9999 in reverse order");
		for(int i=9999;i>=1;i--)
		{
			System.out.println(i+" ");
		}
	}
}
