package BasicProg;

public class Primeno_count {

	public static void main(String[] args) {
	
		
		int n=100,count=0;
		while(n>=0)
		{
			boolean flag=true;
		for(int i=2;i<=n/2;i++)
		{
			if(n % i==0)
			{
				flag=false;
				break;
				
			}
		}
		if(flag)
		{
			System.out.print(n +" ");
			count++;
		}
		n--;
		}
		System.out.println("count : "+count);
		
		
	}
	
}
