package patterns;
/*

*
**
***
****
*****
******
*******
******
*****
****
***
**
*

 */
public class Pattern15 {

	public static void main(String[] args) {
		int row=7;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}System.out.println();
		}
		for(int i=1;i<=row-1;i++)
		{
			for(int j=i;j<=row-1;j++)
			{
				System.out.print("*");
			}System.out.println();
		}
	}

}
