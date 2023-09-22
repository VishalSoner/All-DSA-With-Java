// Example
// Input : 2 10
// Output : 2 3 5 7



class Q10_prime_Number_With_In_Range
{
	public static void main(String args[])
	{
		int num1 = 1, num2 = 100;
		prime_With_In_Range1(num1, num2);
		prime_With_In_Range2(num1, num2);
	}
	
	// Method 1: Using inner loop Range as [2, number-1].
	static void prime_With_In_Range1(int num1, int num2)
	{
		if( num1 == num2)
			return;
		
		if(num1 == 1)
			num1 += 1;
		
		boolean temp = true;
		
		for(int i = num1; i <= num2; i++)
		{
			temp = true;
			for( int j = 2; j < i; j++)
			{
				if( i % j == 0)
				{
					temp = false;
					break;
				}
			}
			if(temp)
				System.out.print( i + "  ");
		}
		System.out.println();

	}

	// Method 2: Using Function as [2, number-1]. Optimization Code
	static void prime_With_In_Range2(int num1, int num2)
	{
		if(num1 == 1)
		{
			num1++;
		}
		
		for(int i = num1; i <= num2; i++)
		{
			if( check_Prime(i) )
				System.out.print(i + "  ");
		}
	}
	static boolean check_Prime(int num)
	{
		for( int j = 2; j < num; j++)
		{
			if( num % j == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	
	
}