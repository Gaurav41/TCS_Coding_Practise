package coding;

public class LastOccuranceArray {

	public static void main(String[] args) {
		int array[]={1,2,3,3,4,5,3,9,8,7,6};
		int num=1;
		int last=-1,sec_last=-1;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==num)
			{
			if(last==-1)
			{	
				last=i;
			}else{
				sec_last=last;
				last=i;
			}
			}
		}
		
		System.out.println("sec last:"+sec_last);

	}

}
