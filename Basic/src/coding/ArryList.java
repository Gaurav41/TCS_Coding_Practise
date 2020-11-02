package coding;

import java.util.ArrayList;
import java.util.Scanner;

public class ArryList {

	public static void main(String[] args) {

		ArrayList<String>	ar=new ArrayList();
		ar.add("Abc");
		ar.add("B");
		ar.add("C");
		ar.add("D");
		ar.add("E");
		ar.add("F");
		ar.add("G");
		ar.add("H");
		System.out.println("size:"+ar.size());
		for(String i:ar)
		{
			System.out.print(i+" ");
			
		}
		
		Scanner sc = new Scanner (System.in);
		String str=sc.next();
		try{
			int a=Integer.parseInt(str);
			if(a > ar.size())
			{
				System.out.println("Invalid Ip");
			}else
			//System.out.println("numeric");
			ar.remove(a-1);

		}catch(Exception e)
		{
			System.out.println("not numeric");
			if(!ar.contains(str))
				System.out.println("not avaliable");
			else
			ar.remove(str);
		}
		/*if(!ar.contains(str))
		System.out.println("not avaliable");
		else*/
		//System.out.println("Status:"+ar.remove(str));
		for(String i:ar)
		{
			System.out.print(i+" ");
			
		}
		System.out.println("\nsize:"+ar.size());

		
	}

}
