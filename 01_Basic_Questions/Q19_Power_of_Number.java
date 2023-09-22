class Q19_Power_of_Number
{
	public static void main(String args[])
	{
		int num = 25;
		int power = 2;
		power_of_Number( num, power);
	}
	
	static void power_of_Number(int n, int power)
	{
		int count = 1;
		
		for(int i = 1; i <= power; i++)
		{
			count *= n;
		}

		System.out.print("Power Of Number : " + count);
	}
}