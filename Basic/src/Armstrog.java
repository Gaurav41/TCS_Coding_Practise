import java.util.Scanner;

/*153 = (1*1*1)+(5*5*5)+(3*3*3)  
where:  
(1*1*1)=1  
(5*5*5)=125  
(3*3*3)=27  
So:  
1+125+27=153  
*/
public class Armstrog {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0,pow=0;
		
		int temp=num;int a=0;
		int temp1=num;
		
		while(temp1>0)
		{
			a= temp1 % 10;
			pow++;
			temp1=temp1/10;	
		}
		System.out.println(pow);
		while(temp>0)
		{	
			a= temp % 10;
			int b = 1;
			for(int i=1;i<=pow;i++)
				{
				b=b*a;
				}
			sum+=b;	
			
			temp=temp/10;	
			
		}
		if(num == sum)
		{
			System.out.println("yes");
		}
		else{
			System.out.println("No");
		}
	}
}
