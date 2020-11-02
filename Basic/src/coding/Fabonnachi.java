package coding;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Fabonnachi {

	public static void main(String[] args) {
		System.out.println("Enter the num till you want series:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=-1,b=1,c=0;
		for(int i=1;i<=n;i++)
		{
			
			System.out.print((c=a+b )+" ");
			a=b;
			b=c;
		}
	}

}
