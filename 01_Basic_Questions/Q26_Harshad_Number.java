/*
Input  : 21
		count = 2 + 1 = 3;
		(21 % 3 == 0)	True
OutPut : Yes, This is Harshad Number 

Input  : 153	= 9		(153%9 == 0) - True
OutPut : Yes, This is Harshad Number 

Input  : 4991
OutPut : Yes, This is Harshad Number 
*/

class Q26_Harshad_Number
{
	public static void main(String args[])
	{
		int num = 153;
		harshad_Number( num );
	}
	
	static void harshad_Number(int n)
	{
		int value = n;
		int temp = 0;
		
		while(n != 0)
		{
			temp += n%10;
			
			n = n/10;
		}
		
		if( value % temp == 0)
			System.out.println("Yes, A Harshad Number.");
		
		else
			System.out.println("No , A Harshad Number.");
	}
}