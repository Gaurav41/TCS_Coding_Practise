import java.util.Scanner;

public class fabonachi {
	
	public void fabo(int x)
	{
	/*int a=1,b=1,c=0;
		System.out.print(a +" "+ b +" ");
		while(c <= x){
		c= a+b;
		if(c>x) return;
		System.out.print(c+" ");
		a=b;
		b=c;
		}*/
		
		if(x==1)
		{
			System.out.println(1);
			return;
		}
		int n1=1,n2=1,n3=0;
		System.out.print(n1+" "+n2+" ");
		for(int i=3;i<=x;i++)
		{	
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(n3+" ");
			
		}
		
	}
	public static int fibonacci(int number){	
        if(number == 0 || number == 1){
            return number;
        }
      
        return fibonacci(number-1) + fibonacci(number -2); //tail recursion
    }


	public static void main(String[] args) {
		
		System.out.println("Enter value");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		fabonachi fb = new fabonachi();
		fb.fabo(x);
		
		System.out.println("\nEnter which no of series u want");
		int n=new Scanner(System.in).nextInt();
	    System.out.println("The "+n+"th fibonacci number is: " + fibonacci(n));
	    
	    for(int i=1;i<=n;i++)
	    {
	    	System.out.print(fibonacci(i)+" ");
	    }

	}

}
