package thursdayLab6;

public class TaxNotEligibleException extends Exception{
	public TaxNotEligibleException(String str)
	{
		System.out.println(str);
	}
}
