package coding;
import java.util.Scanner;

public class primeandnegative {
	private void check(int n){
		if(n<0)
		{
			System.out.println("Number is negative...plz enter the positive no");
		}else{
			prime(n);
		}
	}
	
	private void prime(int n)
	{
		boolean flag=true;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag=false;
				break;
			}
		}	
		System.out.println((flag)? "no is prime":"no is not prime");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		primeandnegative pn = new primeandnegative();
		pn.check(num);
	}

}
