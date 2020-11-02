package sortingAlgorithms;

public class SelectionSort {

	public static void main(String[] args) {
		int a[] = { 50, 60, 30, 80, 40 };
		int n = a.length;
		int min = 0;
		
		for (int i = 0; i < n-1; i++) 
		{
			//min = a[i]; assume ith ele as min
			for (int j = i + 1; j < n; j++) 
			{
				if (a[j] < a[i]) 
				{	//swap min with a[j]
					//min = [j];
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
			
			System.out.print("\nPass "+i+": ");
			for (int i1 : a) 
			{
				System.out.print(i1 + " ");
			}
		}
		
		
		/*for (int i1 : a) 
		{
			System.out.print(i1 + " ");
		}*/
	}

}
/*
{  50, 60, 30, 80, 40 }

Pass 0: 30 60 50 80 40 
Pass 1: 30 40 60 80 50 
Pass 2: 30 40 50 80 60 
Pass 3: 30 40 50 60 80 

*/