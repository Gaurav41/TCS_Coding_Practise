package coding;
//Write a program to convert decimal to octal
public class DecToOct {

	public static void main(String[] args) {
		int dec =81;
		int oct[]=new int[20];
		int i=0;
		while(dec>0)
		{
			oct[i]=dec%8;
			dec=dec/8;
			i++;
		}
		for(int j=i-1;j>=0;j--)
		{
			System.out.print(oct[j]);
		}
	}

}
