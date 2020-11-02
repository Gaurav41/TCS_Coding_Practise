import java.util.Scanner;

public class PerfectSq {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int temp=(int) Math.sqrt(a);
		temp=temp*temp;
		 
			
	
		if(a==temp)
		{
			System.out.println("perfect sq");
		}
		
		else{
			System.out.println("not a perfect sq");
		}
		
	}

}
