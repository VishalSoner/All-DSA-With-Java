class Q16_Fibonacci_Series
{
	public static void main(String args[])
	{
		int index = 15;
		fibonacci_Series(index);
	}
	
	static void fibonacci_Series(int index)
	{
		int num1 = 1;
		int num2 = -1;
		
		for(int i = 1; i <= index; i++)
		{
			int temp = num1+num2;
			num2 = num1;
			num1 = temp;
			
			System.out.print( num1 + "  ");
		}
	}
}
//Output : 0  1  1  2  3  5  8  13  21  34