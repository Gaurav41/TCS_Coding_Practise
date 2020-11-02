package coding;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TimeFormat2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter date hh:mm:ss AM/PM :");
		String date=sc.next();
		String ampm=sc.next();
		//System.out.println("date:"+date);
		StringTokenizer st=new StringTokenizer(date);
		int hh=Integer.parseInt(st.nextToken(":"));
		int mm=Integer.parseInt(st.nextToken());
		int ss=Integer.parseInt(st.nextToken());
		//System.out.println(hh+","+mm+","+ss+","+ampm);
		if(hh<=24 && hh>=0 && mm <=59 && ss<=59)
		{
		if(ampm.equalsIgnoreCase("am") && hh>12)
		{
			hh=hh-12;
		}else
			if(ampm.equalsIgnoreCase("pm")&& hh<12)
			{
				if(hh==0)
				hh=00;
				else
					hh=hh+12;
			}
		System.out.println(hh+":"+mm+":"+ss);
		}else{
			System.out.println("incorrect time");
			return;
		}

	}

}
