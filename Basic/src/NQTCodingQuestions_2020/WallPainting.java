/*
We want to estimate the cost of painting a property.
Interior wall painting cost is Rs.18 per sq.ft. and exterior wall painting cost is Rs.12 per sq.ft.

Take input as
1. Number of Interior walls
2. Number of Exterior walls
3. Surface Area of each Interior Wall in units of square feet
4. Surface Area of each Exterior Wall in units of square feet
If a user enters zero  as the number of walls then skip Surface area values as User may don’t 
want to paint that wall.

Calculate and display the total cost of painting the property
Example 1:
6
3
12.3
15.2
12.3
15.2
12.3
15.2
10.10
10.10
10.00
Total estimated Cost : 1847.4 INR
Note: Follow in input and output format as given in above example
 */


package NQTCodingQuestions;
import java.util.Scanner;

public class WallPainting {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int inwall=sc.nextInt();
			int exWall=sc.nextInt();
			double sArea=0;
			double sAreaInWall=0.00,sAreaExWall=0.00;
			for(int i=1; i<=inwall;i++)
			{	
				sArea=sc.nextDouble();
			    sAreaInWall=sAreaInWall+sArea;
			}
			for(int i=1; i<=exWall;i++)
			{	sArea=sc.nextDouble();
			    sAreaExWall=sAreaExWall+sArea;
			}
			double costInWall=sAreaInWall*18;
			double costExWall=sAreaExWall*12;
			double totalCost=costInWall+costExWall;
			System.out.println("Total estimate cost:"+totalCost+" INR");
		}
	

}
