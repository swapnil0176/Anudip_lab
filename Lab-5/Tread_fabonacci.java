package thursdayLab5;

public class Tread_fabonacci extends Thread
{
    public void run()
    {
    	int num=20,next,first=0,second=1;
    	System.out.println(first+" ");
    	System.out.println(second+" ");
    	for(int i=3;i<=num;i++)
    	{
    		next=first+second;
    		first=second;
    		second=next;
    		System.out.println(next+" ");
    	}
    	System.out.println("\n");
    }
}
