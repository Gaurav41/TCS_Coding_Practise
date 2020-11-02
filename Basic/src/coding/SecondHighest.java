package coding;
/*
 * English teacher informed the highest mark scored in her test in the class. 
 * Your task is to find the second highest mark.
 */
public class SecondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[]={10,20,50,90,10,50,100};
		int high=0,sec_high=0,i=0;
		for(i=0;i<marks.length;i++)
		{
			if(marks[i]>high)
			{
				sec_high=high;
				high=marks[i];
			}
			else if(marks[i]>sec_high){
				sec_high=marks[i];
				
			}
			
		}
		System.out.println(sec_high);
	}

}
