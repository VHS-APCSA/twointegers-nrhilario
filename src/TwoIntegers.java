
public class TwoIntegers 
{
	private int first;
	private int second;
	
	public TwoIntegers()
	{
		first = -1;
		second = -1;
	}
	public TwoIntegers(int first, int second)
	{
		this.first = first;
		this.second = second;
	}
	
	public int getFirst()
	{
		return first;
	}
	public void setFirst(int first)
	{
		this.first = first;
	}
	
	public int getSecond()
	{
		return second;
	}
	public void setSecond(int second)
	{
		this.second = second;
	}
	public String arithmetic()
	{
		int sum = first + second;
		int diff = first - second;
		int prod = first * second;
		double quot = first / second;
		
		return "Sum is: " + sum + "Difference is: " + diff + "Product is: " + prod + "Quotient is: " + quot;
	}
	
	public String larger()
	{
		if(first > second)
		{
			return first + " > " + second;
		}
		else if(first > second)
		{
			return first + " is not greater than " + second;
		}
		else
		{
			return first + " = " + second;
		}
	}
}
