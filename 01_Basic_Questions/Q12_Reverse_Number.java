// Method 1: Using Brute Force

class Q12_Reverse_Number
{
	public static void main(String args[])
	{
		int num = 123456;
		
		System.out.println("Sum of Digits : " + reverse_Digits(num) );
	}
	
	static int reverse_Digits(int num)
	{
		int temp = 0;
		
		while(num != 0)
		{
			 temp = temp*10 + num%10;
			
			num = num/10;
		}
		
		return temp;
		
	}
}