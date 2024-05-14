package thursdayLab5;

public class DisplayMessage extends Thread
{
	public String msg;
	public DisplayMessage(String msg)
	{
		this.msg=msg;
	}
	public void run()
	{
		try {
			while(true)
			{
				System.out.println(msg);
				Thread.sleep(100);
			}
		}
		catch(InterruptedException ie)
		{
			
		}
	}
}
