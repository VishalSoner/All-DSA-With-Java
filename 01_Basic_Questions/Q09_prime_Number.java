class Q09_prime_Number
{
	public static void main(String args[])
	{
		int num = 317;
		check_Prime_Number1(num);
		check_Prime_Number2(num);
		check_Prime_Number3(num);
	}
	
	
	// Method 1: Simple iterative solution
	static void check_Prime_Number1(int num)
	{
		if(num < 2)
		{
			System.out.println ( num + " is not prime");
			System.exit(0);
		}
		
		int count = 0;
		
		for( int i = 2; i <= num; i++)
		{
			if(num%i == 0)
				count += 1;
		}
		
		if( count > 2)
			System.out.println ( num + " is not prime");
		
		else
			System.out.println (num + " is prime");
	}

	// Method 2: Optimization by break condition
	static void check_Prime_Number2(int num)
	{
		boolean temp = true;
		if(num < 2)
		{
			temp = false;
		}
		
		for( int i = 2; i < num; i++)
		{
			if(num%i == 0)
			{
				temp = false;
				break;
			}
		}
		
		if(temp)
			System.out.println (num + " is prime");
		
		else
			System.out.println ( num + " is not prime");

	}
	
	
	// Method 3: Basic Recursion technique
	static void check_Prime_Number3(int num)
	{
		if(num == 2)
		{
			System.out.println(num + " is Prime.");
			return;
		}
		
		int i = 2;
		boolean temp = true;
		
		temp = check_Prime(num, i);
		
		if(temp)
		{
			System.out.println(num + " is Prime.");
		}
		else
		{
			System.out.println(num + " is not Prime.");
		}
	}
	static boolean check_Prime(int num, int i)
	{
		if( num == i)
			return true;
		
		if(num < 2)
			return false;

		if(num % i == 0)
		{
			return false;
		}
		
		return check_Prime(num, i+=1);
	}
	
	
	
}