package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UpperLowerString {
	 static StringBuffer convertOpposite(StringBuffer str) 
     { 
        int ln = str.length(); 
        for (int i=0; i<ln; i++) 
        { 
            Character c = str.charAt(i); 
            if (Character.isLowerCase(c)) 
                str.replace(i, i+1, Character.toUpperCase(c)+""); 
            else
                str.replace(i, i+1, Character.toLowerCase(c)+"");     
        } 
        return str;
     } 
	 
	 private static String convertOpposite1(String str) {
		 String str2="";
		 for(int i=0;i<str.length();i++)
			{
				char c =str.charAt(i);
				if(c >='a' && c<='z')
				{
					str2=str2+(char)(c-32);	
				}else if(c >='A' && c<='Z')
				{
					str2=str2+(char)(c+32);
					
				}	
			}
			return str2;
		}			

	public static void main(String[] args) throws IOException {
		System.out.println("Enter string");
		InputStreamReader ip = new InputStreamReader(System.in);
		BufferedReader bf =new BufferedReader(ip);
		 StringBuffer strbuff = null;
		try {
			strbuff = new StringBuffer(bf.readLine());
		} catch (IOException e1) {
			e1.printStackTrace();
		} 
         System.out.println(convertOpposite(strbuff)); 
         
        System.out.println("Enter string"); 
        String str = null,str2="";
        str=bf.readLine();
        System.out.println(convertOpposite1(str));
		
		
	}
}
