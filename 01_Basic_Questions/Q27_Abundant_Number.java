/*

The Factors of number 18 are = 1, 2, 3, 6 and 9. (don't include number itself)
1 + 2 + 3 + 6 + 9 = 21
as the number 21>18

*/

class Q27_Abundant_Number
{
	public static void main(String args[])
	{
		int num = 12;
		abundant_Number( num );
	}
	
	static void abundant_Number(int n)
	{
		int sum = 0;
		
		for( int i = 1; i < n; i++)
		{
			if(n%i == 0)
				sum += i;
		}
		
		if (sum > n)
		{
			System.out.println (n + " is an Abundant Number.\nThe Abundance is: " + (sum - n));
		}
		else
		{
			System.out.println (n + " is not an Abundant Number");
		}
	}
}