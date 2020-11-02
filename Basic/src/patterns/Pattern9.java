package patterns;
/*

* * * * * 
 * * * * 
  * * * 
   * * 
    * 
    
 */

public class Pattern9 {

	public static void main(String[] args) {
		int rows=5;
		for(int i=1;i<=rows;i++)
		{
			for(int k=1;k<=i-1;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=rows+1-i;j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}
