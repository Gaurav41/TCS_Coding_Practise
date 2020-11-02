package coding;
/*
 * Count the number of pairs in integer array whose sum equals given sum (all elements are unique)
Enter the size
9
enter array element
0
2
5
7
4
6
10
20
-10
enter the sum
10
(0,10),(4,6),(20,-10), //pairs of sum 10 
 */
import java.util.Scanner;

public class SumofPairs {

	public static void main(String[] args) {
	System.out.println("Enter the size");
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	System.out.println("enter array element");
	int arr[]=new int[size];
	for(int i=0;i<size;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("enter the sum");
	int sum=sc.nextInt();
	
	for(int i=0;i<size-1;i++)
	{
		for(int j=i+1;j<size;j++)
		{
			if(arr[i]+arr[j]==sum)
			{
				System.out.print("("+arr[i]+","+arr[j]+"),");
			}
		}
	}

	}

}
