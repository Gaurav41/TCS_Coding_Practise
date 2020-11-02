
public class DecToOct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dec=21; //ans=25
		int bits[]=new int[100];int i=0;
		
		while(dec>0){
			bits[i]=dec%8;
			dec=dec/8;
			i++;
			
		}
		for(int j=i-1;j>=0;j--)
		{
			System.out.print(bits[j]);
		}


	}

}
