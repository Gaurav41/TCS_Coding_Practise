package coding;

public class DecToBinary {

	public static void main(String[] args) {
	int dec=10;
	int binary[]=new int[10];
	int i=0;
	while(dec>0)
	{
		binary[i]=dec%2;
		i++;
		dec=dec/2;
	}
	for(int j=i-1;j>=0;j--)
	{
		System.out.print(binary[j]);
	}
	}

}
