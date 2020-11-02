
public class PrimeNo {

	public static void main(String args[]) {
		int num = 23;
		boolean isPrime = true;
		
		if (num != 0 || num != 1) {
			for (int i = 2; i <= (num / 2); i++) 
			{
				if (num % i == 0) 
				{
					isPrime = false;
					break;
				}
			}
			if (isPrime)
				System.out.println(num + " is a prime pumber");
			else
				System.out.println(num + " is not a prime number");
		} else {
			System.out.println(num + " is not a prime nor composite number");
		}
	}
}
