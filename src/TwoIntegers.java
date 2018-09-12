
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
		int sum = first + second; //sum of the two numbers
		int diff = first - second; //difference of the two numbers
		int prod = first * second; //product of the two numbers
		double quot = (double) first / second; //quotient of the two numbers
		
		return "Sum: " + sum + " Difference: " + diff + " Product: " + prod + " Quotient: " + quot;
	}
	
	public String larger() //which integer is larger
	{
		if(first > second)
		{
			return first + " > " + second;
		}
		else if(first < second)
		{
			return first + " is not greater than " + second;
		}
		else
		{
			return first + " = " + second;
		}
	}
	public boolean isEven() //whether integer is even
	{
		if(first + second % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean isMultiple() //if first integer is a multiple of the second
	{
		if(first % second == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
