class Q24_Perfect_Square
{
	public static void main(String args[])
	{
		int num = 64;
		perfect_Square( num );
	}
	
	static void perfect_Square(int n)
	{
		if( n <= 0)
		{
			System.out.println("No , A Perfact Square.");
			return;
		}
		
		int temp = (int)Math.sqrt(n);
		
		if( (temp*temp) == n)
			System.out.println("Yes, A Perfact Square.");
		
	}
}
