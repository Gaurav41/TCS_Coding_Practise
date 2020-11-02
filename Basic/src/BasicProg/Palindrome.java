package BasicProg;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Enter the no");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int r=0,newnum=0;
		while(num>0)
		{
			r=num % 10;
			newnum=(newnum*10)+r;
			num=num /10;
			
		}
		if(temp == newnum)
		{
			System.out.println("is palindrome");
		}
		else{
			System.out.println("not palindrome");

		}
		
		
	}

}
