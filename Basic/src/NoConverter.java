import java.util.Scanner;

public class NoConverter {

	
	int Convert(int num) 
	{ 
	    if (num == 0)  
	        return 0;  
	    else
	        return (num % 2 + 10 * Convert( num/ 2)); 
	} 
	
	public static void main(String[] args) {
		NoConverter nc= new NoConverter();
		 System.out.println("Enter the no ");
		 Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();  
	       
	   
	         System.out.print(nc.Convert(n) ); 
	}

}
