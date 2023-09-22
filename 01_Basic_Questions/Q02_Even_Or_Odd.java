class Q02_Even_Or_Odd
{
	static void even_Odd1(int num)
	{
		if(num % 2 == 0)
			System.out.println("Number is Even");
		else
			System.out.println("Number is Odd");
	}

	static void even_Odd2(int number)
	{
		if ((number & 1) == 1)
			System.out.println ("Number is Odd");
		else
			System.out.println ("Number is Even");
	}
	public static void main(String args[])
	{
		int num = 51;
		even_Odd1(num);
		even_Odd2(num);
	}
}



