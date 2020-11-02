package coding;

public class BinaryToDec {

	public static void main(String[] args) {
		int binary_num=1010;//10
		int dec=0,rem=0,base=1;
		
		while(binary_num>0)
		{
			rem=binary_num%10; //last digit or unit place digit
			dec=dec+rem*base;
			binary_num=binary_num/10;
			base=base*2;
		}
		System.out.println(dec);
	}

}
