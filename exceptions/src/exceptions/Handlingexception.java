/* This program throws an exception if both base and exponent values are given as 0.
Output:
	2
	3
	2.0 power 3.0 is 8.0
	0
	0
	java.lang.Exception: 0^0 is not possible to calculate
*/
package exceptions;
import java.util.*;
public class Handlingexception {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext())
		{
			double x= sc.nextDouble();
			double y= sc. nextDouble();
			try {
				double res=(new Mypower()).getpower(x,y);
				System.out.println(x + " power "+y+" is "+res);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		sc.close();
	}
}
