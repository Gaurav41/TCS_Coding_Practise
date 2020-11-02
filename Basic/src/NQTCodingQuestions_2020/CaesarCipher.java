/*
The Caesar cipher is a type of substitution cipher in which each alphabet in the plaintext 
or messages is shifted by a number of places down the alphabet.

For example,with a shift of 1, P would be replaced by Q, Q would become R, and so on.

To pass an encrypted message from one person to another, it is first necessary that both parties 
have the �Key� for the cipher, so that the sender may 
encrypt and the receiver may decrypt it.

Key is the number of OFFSET to shift the cipher alphabet. Key can have basic shifts from 1 to 25 
positions as there are 26 total alphabets.

As we are designing custom Caesar Cipher, in addition to alphabets, we are considering numeric digits 
from 0 to 9. Digits can also be shifted by key places.

For Example, if a given plain text contains any digit with values 5 and keyy =2, then 5 will be 
replaced by 7, �-�(minus sign) will remain as it is. Key value less than 0 should result into 
�INVALID INPUT�

Example 1:

Enter your PlainText: All the best

Enter the Key: 1

The encrypted Text is: Bmm uif Cftu

Write a function CustomCaesarCipher(int key, String message) which will accept plaintext and key as 
input parameters and returns its cipher text as output.
 */

package NQTCodingQuestions;
import java.util.Scanner;

public class CaesarCipher {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		StringBuffer sb =new StringBuffer();
		String str2;
		int key=sc.nextInt();
		char c;
		for(int i=0;i<str.length();i++)
		{
			c=str.charAt(i);
			if(c>='0' && c<='9')
			{
				if(c+key<=57){
					sb.append(Character.toString((char)(c+key)));
				}else{
					sb.append(Character.toString((char)(c+key-10)));
				}
				
			}else  if(c>=65 && c<=90)
			{
					if(c+key<=90){
						sb.append(Character.toString((char)(c+key) ));
					}else{
						sb.append(Character.toString((char)(c+key-26)));
					}
			}
			else if(c>=97 && c<=122)
			{
				if(c+key<=122){
					sb.append(Character.toString((char)(c+key)));
				}else{
					sb.append(Character.toString((char)((c+key)-26)));
				}
			}
			//System.out.println(str);
			//System.out.println(sb);
		}
		System.out.println(str);
		System.out.println(sb);

	}

}
