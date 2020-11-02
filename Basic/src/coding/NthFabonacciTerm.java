package coding;

import java.util.Scanner;

public class NthFabonacciTerm {

	public static void main(String[] args) {
		System.out.println("Enter value of n:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=-1,b=1,c=0;
		for(int i=1;i<=n;i++)
		{
			
			c=a+b;
			a=b;
			b=c;
		}
		System.out.print(c);

	}

}
