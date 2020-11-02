package sortingAlgorithms;

public class QuickSort {
	public static int count=1;

	public int[] quickSort(int a[],int start,int end)
	{
		if(start<end)
		{
		int pindex=partition(a, start, end);
		quickSort(a, start, pindex-1);
		quickSort(a, pindex+1, end);
		}
		return a;
	}
	public int partition(int a[],int start,int end)
	{	
		int pivot=a[end];
		int pindex=start;
		for(int i=start ;i<end;i++)
		{
			if(a[i]<pivot)
			{
				//swap(a,i,pindex);
				int temp=a[pindex];
				a[pindex]=a[i];
				a[i]=temp;
				
				pindex++;
			}
		}
//		swap(a[end],a[pindex]); swap pivot
				int temp=a[pindex];
				a[pindex]=a[end];
				a[end]=temp;
				
				System.out.print("\nPass "+count+": ");
				for(int i:a)
					System.out.print(i+" ");
				count++;
				return pindex;
		
	}
	
	

	public static void main(String[] args) {
		int a[]={10,80,30,90,40,50,70};
		int start=0,end=a.length-1;
		QuickSort q=new QuickSort();
		int b[]=q.quickSort(a, start, end);
		/*for(int i:b)
			System.out.print(i+" ");
		*/
	}

}
/*
{10,80,30,90,40,50,70}
Pass 1: 10 30 40 50 70 90 80 
Pass 2: 10 30 40 50 70 90 80 
Pass 3: 10 30 40 50 70 90 80 
Pass 4: 10 30 40 50 70 90 80 
Pass 5: 10 30 40 50 70 80 90 

  */
