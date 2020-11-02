package patterns;
/*

*      *
**    **
***  ***
********
***  ***
**    **
*      *

 */
public class Pattern16 {

	public static void main(String[] args) {
		int row=4;
		for(int i =1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{	
				
				System.out.print("*");
			}
			for(int j=1;j<=((row*2)-2*i);j++)
			{	
				
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{	
				
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		for(int i =1;i<=row-1;i++)
		{
			for(int j=i;j<=row-1;j++)
			{	
				
				System.out.print("*");
			}
			for(int j=1;j<=(i*2);j++)
			{	
				
				System.out.print(" ");
			}
			for(int j=i;j<=row-1;j++)
			{	
				
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
	

}
