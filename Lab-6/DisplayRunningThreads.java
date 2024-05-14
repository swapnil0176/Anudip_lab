/*Q. Write a program to display all running threads in Java.*/

package thursdayLab6;
import java.lang.*;
public class DisplayRunningThreads extends Thread {

	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" is running");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DisplayRunningThreads t0 =new DisplayRunningThreads();
			DisplayRunningThreads t1 =new DisplayRunningThreads();
			DisplayRunningThreads t2 =new DisplayRunningThreads();
			DisplayRunningThreads t3 =new DisplayRunningThreads();
			DisplayRunningThreads t4 =new DisplayRunningThreads();
			t0.start();
			t1.sleep(10);
			t2.start();
			t3.start();
			t4.sleep(10);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
