class Q21_Prime_Factors_Of_Number
{
	public static void main(String args[])
	{
		int num = 90;
		prime_Factors_Of_Number( num );
	}
	
	static void prime_Factors_Of_Number(int n)
	{
		int i = 2;
		
		while(n != 1)
		{
			if( isPrime(i) && n%i == 0)
			{
				System.out.print( i + "  ");
				n = n/i;
			}
			else
				i++;
		}
	}
	
	static boolean isPrime(int num)
	{
		boolean temp = true;
		if(num < 2)
			temp = false;
		
		for( int i = 2; i < num; i++)
		{
			if(num%i == 0)
			{
				temp = false;
				break;
			}
		}

		return temp;
	}
	
}

// 2  3  3  5