// Method 1: Using Brute Force

class Q14_Armstrong_Number
{
	public static void main(String args[])
	{
		int num = 371;
		
		if( armstrong_Number(num) )
			System.out.println("Yes, This is Armstrong");
		
		else
			System.out.println("No , This is Armstrong");
	}
	
	static boolean armstrong_Number(int num)
	{
		int temp = num;
		int count = 0;
		int a = 1;
		while(num != 0)
		{
			a = num%10;
			count += a*a*a;
		num = num/10;
		}
		
		if(temp == count)
			return true;
		
		return false;
		
	}
}