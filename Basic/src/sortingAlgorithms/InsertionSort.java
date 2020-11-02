package sortingAlgorithms;

public class InsertionSort {

	public static void main(String[] args) {
		int a[]={80,15,60,30,20,90};
		int n=a.length,key,temp,j;
		for(int i=1;i<n;i++)
		{
			key=a[i];
			j=i-1;
			while(j>=0 && a[j]>key)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
			
			System.out.print("\nPass "+i+": ");
			for(int k:a)
				System.out.print(k+" ");
		}
		
		System.out.print("\nFinal: ");
		for(int k:a)
		{
			System.out.print(k+" ");
		}
	}

}
/*
{80,15,60,30,20,90}

Pass 1: 15 80 60 30 20 90 
Pass 2: 15 60 80 30 20 90 
Pass 3: 15 30 60 80 20 90 
Pass 4: 15 20 30 60 80 90 
Pass 5: 15 20 30 60 80 90 

*/


