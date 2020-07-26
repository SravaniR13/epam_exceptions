package exceptions;

public class Mypower {
	public double getpower(double a, double b) throws Exception
	{
		if(a==0 && b==0)
		{
			throw new Exception("0^0 is not possible to calculate");
		}
		return Math.pow(a, b);
	}
}
