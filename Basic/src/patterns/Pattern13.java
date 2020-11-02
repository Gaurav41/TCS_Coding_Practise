package patterns;
/*
11111
10001
10001
10001
11111
 */
public class Pattern13 {

	public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if(i==1||i==5||j==1||j==5)
			{
				System.out.print(1);
			}
			else
			{
				System.out.print(0);
			}
			
		}
		System.out.println();
	
	}

}
}
