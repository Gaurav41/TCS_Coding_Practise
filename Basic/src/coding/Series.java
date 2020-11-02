package coding;
import java.util.Scanner;
/*
 * Question:
 * Find the 15th term of the series?
 * 0,0,7,6,14,12,21,18, 28
 */
public class Series {
// Approach 1:general 
/*
 	public static void main(String[] args) {
		System.out.println("Enter a no");
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		int tn=0,d,n=num;
		if(num==0)
		{
			System.out.println("0");
			return ;
		}
		for(int i=1;i<=n;i++)
		{num=i;
		if(num%2==0)
		{	d=6;
			num=num/2;
			 tn = (num-1)*d;
		}else{
			d=7;
			num=(num/2)+1;
			 tn=(num-1)*d;
		}
		System.out.print(tn+"  ");
	}
		System.out.println("\n"+n+ " term is :"+tn);

	}
}
	
 	//Enter a no
 	//15
 	//0  0  7  6  14  12  21  18  28  24  35  30  42  36  49  
 	//15 term is :49
*/
 	

//Approach 2: print series and find value
	
  	public static void main(String args[])
	{
		int a = 7, b = 0,c;
		System.out.println("Series :");
		for(int i = 1 ; i < 8 ; i++)
		{
			c = a * b;
			System.out.print(c+" "+(c-b)+" ");
			b++;
		}
			c = a * b;
			System.out.println(c);
			System.out.print("15th element of the series is = "+c);
	}
	}
		//OP: 
		//Series :
		//0 0 7 6 14 12 21 18 28 24 35 30 42 36 49
		//15th element of the series is = 49
	

/*
 //Approach 3:print only reqired value
	public static void main(String[] args) {	
	int num=(15/2);
	int  tn=(num)*7;
	System.out.print("15th term is: "+tn);
	}
	//OP: 15th term is: 49
	 
}*/

