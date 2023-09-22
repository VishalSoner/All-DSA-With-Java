class Q08_Leap_Year_or_Not
{
	public static void main(String args[])
	{
		int num = 2020;
		leap_Year_Or_Not1(num);
		leap_Year_Or_Not2(num);
	}
	
	// Method 1: Using if-else Statements - 1
	static void leap_Year_Or_Not1(int num)
	{
		if( num % 400 == 0)
			System.out.println(num + " is a Leap year");
		
		else if( (num%4 == 0) && (num%100 != 0) )
			System.out.println(num + " is a Leap year");
		
		else
			System.out.println(num + " is Not a Leap year");
	}

	// Method 2: Using if-else Statements - 2
	static void leap_Year_Or_Not2(int num)
	{
		if( (num % 400 == 0) || (num%4 == 0) && (num%100 != 0) )
			System.out.println(num + " is a Leap year");
		
		else
			System.out.println(num + " is Not a Leap year");
	}

	
}