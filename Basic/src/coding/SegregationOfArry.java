package coding;

public class SegregationOfArry {

	public static void main(String[] args) {
		int array[]={1,0,0,1,0,0,0,1,1,0,1,0};
		int size=array.length;
		for(int i:array)
			System.out.print(i+" ");
		int left=0,right=size-1;
	
		while(left<right)
		{
			
			if(array[left]==0 )
			{
				left++;
			}else{
				while(right>left )
				{
					if(array[right]==1)
					right--;
					else{	
						break;
					}
				}
				array[left]=0;
				array[right]=1;
				left++;
				right--;
			}	
		}
	
		System.out.println();
		for(int i:array){
		System.out.print(i+" ");
		}
	}

}
