package patterns;

/*

    *
   * *
  *   *
 *     *
* * * * * 
 *     *
  *   *
   * *
    *

*/
public class Pattern10 {

	public static void main(String[] args) {
		int rows=10;
		for(int i=1;i<=rows;i++)
		{
			for(int k=1;k<=rows-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=(2*i-2);j++)
			{
				if(i==rows){
					for(int n=1;n<=rows;n++)
					{
					System.out.print("* ");
					}
					break;
				}
				else if(j==0 || j== (2*i-2))
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
		
/*
    *
   * *
  *   *
 *     *
* * * * *
		
*/
		for(int i=1;i<=rows-1;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=((rows-1)*2)-(2*i);j++)
			{
				if(j==0 || j==((rows-1)*2)-(2*i))
				{
					System.out.print("*");
				}else{
					System.out.print(" ");
					
				}
			}System.out.println("");
		}
	}
/*

 *     *
  *   *
   * *
    *

 */

}

