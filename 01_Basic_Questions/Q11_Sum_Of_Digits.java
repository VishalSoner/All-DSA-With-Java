// Method 1: Using Brute Force

class Q11_Sum_Of_Digits
{
	public static void main(String args[])
	{
		int num = 1234;
		
		System.out.println("Sum of Digits : " + sum_Of_Digits(num) );
	}
	
	static int sum_Of_Digits(int num)
	{
		int count = 0;
		
		while(num != 0)
		{
			count = count + num%10;
			
			num = num/10;
		}
		
		return count;
		
	}
}