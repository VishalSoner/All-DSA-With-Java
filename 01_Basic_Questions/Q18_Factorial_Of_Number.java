/*
Note : 0! = 1 and 1! = 1

Example : 
5! = 1 * 2 * 3 * 4 * 5 = 120

*/

class Q18_Factorial_Of_Number
{
	public static void main(String args[])
	{
		int index = 5;
		factorial_Of_Number(index);
	}
	
	static void factoria_Of_Number(int n)
	{
		int count = 1;
		
		for(int i = 2; i <= n; i++)
		{
			count *= i;
		}
		
		System.out.print("Factoria Of Number : " + count);
	}
}