package patterns;
/*
//n=4
1
2*2
3*3*3
4*4*4*4
4*4*4*4
3*3*3
2*2
1

*/
public class Pattern12 {

	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=2*i-1;j++)
			{
				if(j%2==0)
				{
					System.out.print("*");
				}else{
					System.out.print(i);
				}
				
			}System.out.println();
		}
		for(int i=4;i>=1;i--)
		{
			for(int j=1;j<=2*i-1;j++)
			{
				if(j%2==0)
				{
					System.out.print("*");
				}else{
					System.out.print(i);
				}
				
			}System.out.println();
		}

	}

}
