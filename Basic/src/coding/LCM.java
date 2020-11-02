package coding;
/*
 * 
 * lcm=(a*b)/gcd
 */

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		System.out.println("Enter two no");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int min=a<b?a:b;
		int gcd=0;
		for(int i=min;i>=2;i--)
		{
			if(a%i==0 && b%i==0)
			{
				gcd=i;
				break;
			}
		}
		int lcm=(a*b)/gcd;
		System.out.println("LCM:"+lcm);
	}

}
