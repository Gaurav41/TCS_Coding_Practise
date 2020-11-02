package coding;
/*
Given a sorted array with many duplicate elements, the problem is to find indexes of first and last occurrences 
of an element X in the given array.Start the array index from 0. If element X is not present in the array,
print "NO OCCURENCES".
 */
import java.util.Scanner;

public class CountOccurance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int arr[]=new int[size];

		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter elem: ");
		int num=sc.nextInt();
		int start=-1,end=-1;
		for(int i=0;i<size;i++)
		{

			if(arr[i]==num)
			{
				if(start==-1)
				{
					start=i;
					end=i;
				}else{
					end=i;
				}
			}
		}
		if(start==-1)
		{
			System.out.println("NO OCCURANCE");
		}else{
			System.out.println(start+","+end);
		}
	}

}
