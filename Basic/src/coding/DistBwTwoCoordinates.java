package coding;

import java.util.Scanner;

/*
 * (x1,y1) and (x2,y2)
 * dist=sqrt((x2-x1)^2+(y2-y1)^2)
 */


public class DistBwTwoCoordinates {

	public static void main(String[] args) {
		System.out.println("Enter cooodinates x1,y1,x2,y2");
		Scanner sc =new Scanner(System.in);
		double x1,y1,x2,y2;
		x1=sc.nextInt();
		y1=sc.nextInt();
		x2=sc.nextInt();
		y2=sc.nextInt();
		double dist=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("Dist:"+dist);
	}

}
