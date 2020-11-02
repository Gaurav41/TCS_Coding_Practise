package coding;

import java.util.Scanner;
import java.util.StringTokenizer;

public class MonthDays {

	public static void main(String[] args) {
		int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
		Scanner sc=new Scanner(System.in);
		String date=sc.next();
		//System.out.println("date:"+date);
		StringTokenizer st=new StringTokenizer(date);
		int day=Integer.parseInt(st.nextToken("/"));
		int month=Integer.parseInt(st.nextToken());
		int year=Integer.parseInt(st.nextToken());
		if(year%400==0||(year%4==0 && year%100!=0))
		{
			days[1]=29;
		}
		System.out.println(day+","+month+","+year);
		System.out.println("no of days in month="+days[month-1]);
	}

}
