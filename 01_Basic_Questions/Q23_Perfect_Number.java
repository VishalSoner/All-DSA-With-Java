class Q23_Perfact_Number
{
	public static void main(String args[])
	{
		int num = 6;  		//28
		perfact_Number( num );
	}
	
	static void perfact_Number(int n)
	{
		int count = 0;
		
		for(int i = 1; i < n; i++)
		{
			if( n % i == 0)
				count += i;
		}
		
		if( n == count)
			System.out.println("Yes, Perfact Number.");
		else
			System.out.println("No , Perfact Number.");
	}
}