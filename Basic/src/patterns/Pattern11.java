package patterns;
/*
 
 		 *
        ***
       *****
      *******
     *********
    ***********
   *************
  ***************
 *****************
*******************
 *****************
  ***************
   *************
    ***********
     *********
      *******
       *****
        ***
         *
 
 
 */
public class Pattern11 {

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
				
					System.out.print("*");
				
			}
			System.out.println();
		}
		
	
		for(int i=1;i<=rows-1;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=((rows-1)*2)-(2*i);j++)
			{
				
					System.out.print("*");
				
			}System.out.println("");
		}
	}

}

