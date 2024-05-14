package thursdayLab5;

public class ObjectCall {

	static int c=0;
	ObjectCall()throws NoMoreException
	{
		if(c==0)
		{
			c++;
		}
		else
		{
			throw new NoMoreException();
		}
	}
}
