/* 	

Q7.   
      * 
    *   * 
  *       *
* * * * * * *

  
  
*/
 
import java.util.*;
 
class Q07
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Total Rows : ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++)
		{
			for(int k = 1; k <= n-i ; k++)
				System.out.print(" ");
			
			for(int j = 1; j <= n; j++)
			{
				if(j == 1 || i == n || i == j )
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
 
			
 