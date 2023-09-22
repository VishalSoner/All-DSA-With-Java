class Q04_Sum_of_N_Natural_Number
{
	public static void main(String args[])
	{
		int num = 5;
		sum_N_Natural_Number1(num);
		sum_N_Natural_Number2(num);
		sum_N_Natural_Number3(num, 0);
	}

	//Method 1: Using for Loop
	static void sum_N_Natural_Number1(int num)
	{
		int count = 0;
		for(int i = 1; i <= num; i++)
			count+= i;

		System.out.println("Sum of First N Natural Number : " + count);
	}

	// Method 2: Using Formula
	static void sum_N_Natural_Number2(int num)
	{
		int count = ( num * (num+1) / 2 );
		System.out.println("Sum of First N Natural Number : " + count );
	}

	// Method 3: Using Recursion
	static void sum_N_Natural_Number3(int num, int count)
	{
		if(num == 0)
		{
			System.out.println("Sum of First N Natural Number : " + count );
			return;
		}
		
		sum_N_Natural_Number3(num-1, count+num);
	}
}