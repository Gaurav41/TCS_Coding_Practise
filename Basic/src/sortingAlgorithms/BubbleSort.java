package sortingAlgorithms;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]={99,88,77,66,55,44}; 
		int size=5;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<(arr.length-i-1);j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
			
			/*System.out.print("\npass "+i+":");
			for(int k:arr)
			{
				System.out.print(k+" ");
			}*/
			
		}
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
	}

}

/*

for n values we required n-1 passes hence i=0 to i<n-1
here n=6;
hence i=0 to i<(5) 
i=0 to 4

pass 0:88 77 66 55 44 99 
pass 1:77 66 55 44 88 99 
pass 2:66 55 44 77 88 99 
pass 3:55 44 66 77 88 99 
pass 4:44 55 66 77 88 99 

*/