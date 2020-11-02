package coding;

public class DecToHex {

	public static void main(String[] args) {
		int dec =30; //ans 1E
		int hex[]=new int[20];
		int i=0,rem=0;
		while(dec>0)
		{
			rem=dec%16;
			dec=dec/16;
			if(rem>9)
			{
				switch(rem)
				{
				case 10:hex[i]='A';
					break;
				case 11:hex[i]='B';
					break;
				case 12:hex[i]='C';
					break;
				case 13:hex[i]='D';
					break;
				case 14:hex[i]='E';
					break;
				case 15:hex[i]='F';
					break;
				
				}
			}else{
				hex[i]=rem;
			}
			
			
			i++;
			
		}
		for(int j=i-1;j>=0;j--)
		{
			if(hex[j]>=65)
			{
				System.out.print((char)hex[j]);

			}else
			System.out.print(hex[j]);
		}
	}

}
