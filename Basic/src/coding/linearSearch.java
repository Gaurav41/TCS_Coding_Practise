package coding;

import java.util.Scanner;

public class linearSearch {

	public static void main(String[] args) {
		int arry[]={1,5,7,8,6,4,9,2,3,0};
		int find_num;
		System.out.println("enter num to find");
		Scanner sc = new Scanner(System.in);
		find_num=sc.nextInt();
		
		for(int i=0;i<arry.length;i++)
		{
			if(arry[i]==find_num)
			{
				System.out.println("no founded at index :"+i);
				return;
			}
		}
		System.out.println("not found");
		
	}

}
