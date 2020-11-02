package coding;
import java.util.Scanner;
public class GCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two nos");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int gcd=1;
		if(a<=0 || b<=0)
		{
			System.out.println("invalid no");
			return;
		}
		int min=a<b?a:b;
		for(int i=min;i>=2;i--)
		{
			if(a % i==0 && b % i==0)
			{
				gcd=i;
				break;
			}
		}
		System.out.println("GCD:"+gcd);
	}

}
