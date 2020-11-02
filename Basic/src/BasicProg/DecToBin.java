package BasicProg;

public class DecToBin {

	public static void main(String[] args) {
	int n=15;
	int bits[]=new int[100];int i=0;
	
	while(n>0){
		bits[i]=n%2;
		n=n/2;
		i++;
		
	}
	for(int j=i-1;j>=0;j--)
	{
		System.out.print(bits[j]);
	}

	}

}
