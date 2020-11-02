package coding;
/*
 * Get the two elements e1 and e2. If e1 & e2 found, then print their index
 */
import java.util.Scanner;

public class Search2no {

	public static void main(String[] args) {
	int arr[]={1,5,7,8,3,6,1,4,9};
	int f1=-1,f2=-1;
	System.out.println("enter two num to find: ");
	Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();

	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==a && f1==-1) // f2 ==-1 is to find only first occurance
		{
			f1=i;
		}
		if(arr[i]==b && f2==-1)
		{
			f2=i;
		}
	}
	if(f1==-1)
	{
		System.out.println("element "+a+" not found");

	}else{
		System.out.println("element "+a+" not found at index:"+f1);

	}
	if(f2==-1)
	{
		System.out.println("element "+b+" not found");

	}else{
		System.out.println("element "+b+" not found at index:"+f2);

	}	
	}

}
