/*

145 = 1! + 4! + 5!
	  1 + 24 + 120
	  
Output : 145.
*/

class Q22_Strong_Number
{
	public static void main(String args[])
	{
		int num = 145;
		strong_Number( num );
	}
	
	static void strong_Number(int n)
	{
		int temp = n;
		int count = 0;
		
		while(n != 0)
		{
			count += factorial_Number(n%10);
			n = n/10;
		}
		
		if(temp == count)
			System.out.println("Yes, Strong Number.");
		else
			System.out.println("No , Strong Number.");
	}
	
	static int factorial_Number(int n)
	{
		int count = 1;
		
		for(int i = 2; i <= n; i++)
			count *= i;
		
		return count;
	}
	
}