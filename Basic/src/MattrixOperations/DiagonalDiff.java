package MattrixOperations;

import java.util.Scanner;

public class DiagonalDiff {

	public static void main(String[] args) {
		System.out.println("enter matrix size");
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int array[][]=new int[n][n] ;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{	System.out.println("enter array["+i+"],["+j+"] :");
				array[i][j]=sc.nextInt();
			}
		}
		
		int SumDaigonalF=0,SumDiagonalB=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
				{
					SumDaigonalF=SumDaigonalF+array[i][j];
				}
				if(i==n-j-1)//i+j==n-1->i==n-1-j -> a(0,2)+a(1,1)+a(2,0)
				{
					SumDiagonalB=SumDiagonalB+array[i][j];
				}
			}
		}
		int diff=Math.abs(SumDaigonalF-SumDiagonalB);
		System.out.println("Diff:"+diff);
	}

}
