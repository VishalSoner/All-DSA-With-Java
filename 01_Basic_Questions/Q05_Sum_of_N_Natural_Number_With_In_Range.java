class Q05_Sum_of_N_Natural_Number_With_In_Range
{
	public static void main(String args[])
	{
		int num1 = 5;
		int num2 = 10;
		sum_In_Range1(num1, num2);
		sum_In_Range2(num1, num2);
		sum_In_Range3(num1, num2, 0);
	}
	
	// Method 1: Using Brute Force / Loop
	static void sum_In_Range1(int num1, int num2)
	{
		int count = 0;
		for(int i = num1; i <= num2; i++)
			count+= i;
		
		System.out.println("Sum of N Natural Number in Range : " + count);
	}
	
	// Method 2: Using the Formula
	static void sum_In_Range2(int num1, int num2)
	{
		int count1 = ( num1*(num1+1) / 2 );
		int count2 = ( num2*(num2+1) / 2 );
		
		System.out.println("Sum of N Natural Number in Range : " + (count2 - count1 + num1 ) );
	}
	
	// Method 3: Using Recursion
	static void sum_In_Range3(int num1, int num2, int count)
	{
		if(num1 > num2)
		{
			System.out.println("Sum of N Natural Number in Range : " + count);
			return;
		}
		
		sum_In_Range3(num1+1, num2, (count+num1) );
	}
}