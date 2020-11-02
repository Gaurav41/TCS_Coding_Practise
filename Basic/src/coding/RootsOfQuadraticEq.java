package coding;

import java.util.Scanner;

public class RootsOfQuadraticEq {

	public static void main(String[] args) {
		System.out.println("Enter the coef: a,b,c");
		Scanner sc = new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double discriminant=b*b-4*a*c;
		double root1,root2;
		if(discriminant>0)
		{
			root1=(-b+Math.sqrt(discriminant))/(2*a);
			root2=(-b-Math.sqrt(discriminant))/(2*a);
			System.out.println("root1 :"+root1+",root2 :"+root2);
		}else if(discriminant == 0 )
		{
			root1=root2=(-b+Math.sqrt(discriminant))/(2*a);
			System.out.println("root1 :"+root1+",root2 :"+root2);

		}else{
			double realpart=-b/(2*a);
			double imgpart=Math.sqrt(-discriminant)/(2*a);
			System.out.println("root1 :"+realpart+"+"+imgpart+"i ,root2 :"+realpart+"-"+imgpart+"i");
		}
		
	}

}
/*
discriminant>0

Enter the coef: a,b,c
5 6 1
root1 :-0.2,root2 :-1.0

discriminant<0

Enter the coef: a,b,c
5
2
1
root1 :-0.2+0.4i ,root2 :-0.2-0.4i
 
 */
