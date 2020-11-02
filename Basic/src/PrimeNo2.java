import java.util.Scanner;

public class PrimeNo2 {

	public static void main(String[] args) {
		System.out.println("Enter no");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		boolean flag=true;			
			for(int i = 2;i<num/2;i++)
			{
				if(num%i==0){
					flag=false;
					break;
				}
				
			}
			
			if(flag)
			{
				System.out.println("is a prime");

			}else{
				System.out.println("is not prime");

			}
		
	}

}
