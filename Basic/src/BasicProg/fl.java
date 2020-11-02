package BasicProg;

public class fl {

	static long factorial(int num)
	{
		long fact=1;
		while(num>1)
		{
			fact=fact * num;
			num--;
		}
		return fact;
	}
	
	
	static long factorial_recursion(int num)
	{	
		if(num == 1)
			return 1;
		else
			return num * factorial_recursion(num-1) ;
		
	}
	public static long fact(int num)
	{	
		if(num > 1)
			return num * factorial_recursion(num-1) ;
		else
			return 1;
	}
	public static void main(String[] args) {
	System.out.println(factorial(5));
	System.out.println(factorial_recursion(5));
	System.out.println(fact(5));

	}

}
