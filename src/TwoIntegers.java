
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
		
		return first + " + " + second + " = " + sum + ", " + first + " - " + second + " = " + diff + ", " + first + " * " + second + " = " + prod + ", " + first + " / " + second + " = " + quot;
	}
	
	public int larger() //which integer is larger
	{
		if(first > second)
		{
			return first;
		}
		else
		{
			return second;
		}
	}
	public boolean isEven() //whether integer is even
	{
		if((first + second) % 2 == 0)
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
