class Q15_Armstrong_With_In_Range
{
	public static void main(String args[])
	{
		int num1 = 1;
		int num2 = 1000;
		
		armstrong_With_In_Range(num1, num2);
	}
	
	static void armstrong_With_In_Range(int num1, int num2)
	{
		int num = 0, count = 0;
		
		for(int i = num1; i <= num2; i++)
		{
			count = 0;
			num = i;
			while(num != 0)
			{	
				int a = num%10;
				count += a*a*a;
				num = num/10;
			}
			if( i == count)
				System.out.print( i + ", ");
		}
	}
}

/*

1 1
153 153
370 370
371 371
407 407

*/