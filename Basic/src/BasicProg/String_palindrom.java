package BasicProg;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
//abba
public class String_palindrom {

		static boolean isPalindrome(String str) 
		{ 
			int i = 0, j = str.length() - 1; 

			while (i < j) { 
				if (str.charAt(i) != str.charAt(j)) 
					return false; 
				i++; 
				j--; 
			} 
			return true; 
		} 

		// Driver code 
		public static void main(String[] args) 
		{ 
			System.out.println("Enter string");
			/*BufferedReader bf = new BufferedReader(  new InputStreamReader(System.in));
			String str = null;
			try {
				str = bf.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			
			Scanner sc = new Scanner(System.in);			
			String str =sc.next();
			
			str=str.toLowerCase();
			if (isPalindrome(str)) 
				System.out.print("Yes"); 
			else
				System.out.print("No"); 
		} 
	} 

