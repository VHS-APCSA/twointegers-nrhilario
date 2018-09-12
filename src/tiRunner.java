import java.util.Scanner;
public class tiRunner 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int one = input.nextInt();
		System.out.println("Enter another integer: ");
		int two = input.nextInt();
		TwoIntegers twoIntegers = new TwoIntegers(one, two);
		String arithmetic = twoIntegers.arithmetic();
		System.out.println(arithmetic);
		String larger = twoIntegers.larger();
		System.out.println(larger);
		boolean isEven = twoIntegers.isEven();
		System.out.println("The sum of the two integers is even: " + isEven);
		boolean isMultiple = twoIntegers.isMultiple();
		System.out.println("The first integer is a multiple of the second: " + isMultiple);
	}
}
