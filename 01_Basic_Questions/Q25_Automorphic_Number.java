/*
	5 =(5)2 = 25
	6 = (6)2 = 36
	25 = (25)2 = 625
	76=(76)2 = 5776

*/

class Q25_Automorphic_Number
{
	public static void main(String args[])
	{
		int num = 25;
		automorphic_Number( num );
	}
	
	static void automorphic_Number(int n)
	{
		int temp = n*n;
		
		if( temp % 10 == n)
			System.out.println("Yes, A Automorphic Number.");
		
		else
			System.out.println("No , A Automorphic Number.");
	}
}