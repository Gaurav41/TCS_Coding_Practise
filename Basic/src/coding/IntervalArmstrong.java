package coding;

import java.util.Scanner;

public class IntervalArmstrong {
	 static int isArmstrong(int num)
	{	
		int temp=num;
		int n=0;int sum=0;
		
		int arr[] =new int [100] ;int dig=0;
		while(temp>0)
		{
		arr[dig] = temp%10;
		temp = temp/10;
		dig++;
		}
		//System.out.println("dig:"+dig);
		for(int i=0;i<dig;i++)
		{
		sum += Math.pow(arr[i],dig);
		}
		if(sum==num)
		{
			return 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println("enter the interval");
		int start,end;
		Scanner sc = new Scanner(System.in);
		start=sc.nextInt();
		end=sc.nextInt();
		sc.close();
		if(start<=0 || end<=0)
		{
			System.out.println("invalid IP");
			return;
		}
		boolean flag=false;
		for(int i = start;i<=end;i++)
		{
			if(isArmstrong(i)==1)
			{	
				flag=true;
				System.out.print(i+" ");
			}
		}
		if(flag==false)
		{
			System.out.println("no elem found");
		}
		
	}

}
