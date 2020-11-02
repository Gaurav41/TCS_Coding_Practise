package strings;
/*
String ip:aabbcdd
a:2 b:2 c:1 d:2 e:0 f:0 g:0 h:0 i:0 j:0 k:0 l:0 m:0 n:0 o:0 p:0 q:0 r:0 s:0 t:0 u:0 v:0 w:0 x:0 y:0 z:0 
 */
import java.util.Scanner;

public class CharCount {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str=sc.next();
	str=str.toLowerCase();
	int array[]=new int[26];
	
	for(int i=0;i<str.length();i++)
	{
		char c = str.charAt(i);
		//System.out.println(c);	// let a
		//System.out.println(c%97);//97%97=0 i.e. index of array- 0 for a,1 for b..... 
		array[c%97]=array[c%97]+1;
	}
	for(int i=0;i<array.length;i++)
	{
		char c=(char) (i+97);
		System.out.print(c+":"+array[i]+" ");
	}
	
	}

}
