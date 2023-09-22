class Q06_Greatest_Two_Number
{
	public static void main(String args[])
	{
		int num1 = 150, num2 = 50;
		
		greatest_Two_Number1(num1, num2);
		greatest_Two_Number2(num1, num2);
		greatest_Two_Number3(num1, num2);
	}
	
	// Method 1: Using if-else Statements
	static void greatest_Two_Number1(int num1, int num2)
	{
		if(num1 == num2)
			System.out.println(num1 + " Both Are Equal");
		else if(num1 > num2)
			System.out.println(num1 + " : is a greatest.");
		else
			System.out.println(num2 + " : is a greatest.");
	}

	// Method 2: Using Ternary Operator
	static void greatest_Two_Number2(int num1, int num2)
	{
		int temp = 0;
		if(num1 == num2)
			System.out.println(num1 + " Both Are Equal");
		else
		{	temp = num1 > num2 ? num1 : num2;
			System.out.println(temp + " : is a greatest.");
		}
	}
	// Method 3: Using inbuilt max Function
	static void greatest_Two_Number3(int num1, int num2)
	{
		if(num1 == num2)
			System.out.println(num1 + " Both Are Equal");
		else
			System.out.println( Math.max(num1, num2) + " : is a greatest.");
		
	}
	
}