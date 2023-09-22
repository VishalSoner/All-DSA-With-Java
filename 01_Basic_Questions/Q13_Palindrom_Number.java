// Method 1: Using Brute Force

class Q13_Palindrom_Number
{
	public static void main(String args[])
	{
		int num = 123454321;
		
		if( palindrom_Number(num) )
			System.out.println("Yes, This is Palindrom");
		
		else
			System.out.println("No , This is Palindrom");
	}
	
	static boolean palindrom_Number(int num)
	{
		int temp = num;
		int count = 0;
		
		while(num != 0)
		{
			count = count*10 + num%10;
			
			num = num/10;
		}
		
		if(temp == count)
			return true;
		
		return false;
		
	}
}