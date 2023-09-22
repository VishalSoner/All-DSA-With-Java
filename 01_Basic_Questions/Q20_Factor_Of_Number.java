class Q20_Factor_Of_Number
{
	public static void main(String args[])
	{
		int num = 10;
		factor_Of_Number( num );
	}
	
	static void factor_Of_Number(int n)
	{
		int i = 2;
		if( n > 0)
		{
			System.out.print( 1 + "  ");
		}
		
		
		while(n >= i)
		{
			if( n%i == 0)
			{
				System.out.print( i + "  ");
			}
			i++;
		}
	}
}