package coding;

import java.util.Scanner;
import java.util.StringTokenizer;

public class IPValidation {

	public static void main(String[] args) {
		System.out.println("enter string");
		Scanner sc=new Scanner(System.in);
		String ip=sc.next();
		StringTokenizer st = new StringTokenizer(ip);
		String result="valid";
		for(int i=1;i<=4;i++)
		{
			int ip1=Integer.parseInt(st.nextToken("."));
			if(ip1<0 || ip1>255)
			{
				System.out.println("Invalid");
				return;
				
			}
			
		}
		System.out.println("valid");
				
	}

}
