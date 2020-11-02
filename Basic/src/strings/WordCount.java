package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordCount {

	public static void main(String[] args) {
		System.out.println("Enter string");
		InputStreamReader ip = new InputStreamReader(System.in);
		BufferedReader bf =new BufferedReader(ip);
		String str = null;int count=1;
		try {
			 str=bf.readLine();
		} catch (IOException e) {
			 e.printStackTrace();
		}
		if(str.isEmpty())
		{
			return;
		}
		str=str.trim();
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)==' '&&str.charAt(i+1)!=' ')
			{
				count++;
			}
			
		}
		System.out.println(count);
	}

}
