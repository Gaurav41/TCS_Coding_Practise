package coding;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i=0;
		int arr[]=new int[10];
		int newNum=0;
		while(num>0)
		{
							//arr[i]=num%10;
			int r =num%10;
			newNum=(newNum*10)+r;
			num=num/10;
							//i++;
		}
		System.out.println(newNum);
							//reverse(arr,i-1);
							//sameOrder(arr,i-1);
							//System.out.println(arr.length);
	}

	private static void reverse(int[] arr,int i) {
		for(int j=0;j<=i;j++)
		{
			System.out.print(arr[j]+"");
		}
		System.out.println();

	}
	private static void sameOrder(int[] arr,int i) {
		for(int j=i;j>=0;j--)
		{
			System.out.print(arr[j]);
		}
		System.out.println();
		
	}

}
