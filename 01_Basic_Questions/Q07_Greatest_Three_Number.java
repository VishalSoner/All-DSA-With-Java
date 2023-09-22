class Q07_Greatest_Three_Number
{
	public static void main(String args[])
	{
		int num1 = 150, num2 = 50, num3 = 200;
		
		greatest_Three_Number(num1, num2, num3);
	}
	
	// Method 1: Using if-else Statements
	static void greatest_Three_Number(int num1, int num2, int num3)
	{
		if(num1 == num2 && num1 == num3 )
			System.out.println(num1 + " Both Are Equal");
		
		else if(num1 > num2 && num1 > num3 )
			System.out.println(num1 + " : is a greatest.");
		
		else if(num2 > num1 && num2 > num3 )
			System.out.println(num2 + " : is a greatest.");
		else
			System.out.println(num3 + " : is a greatest.");
	}

	
}