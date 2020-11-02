package coding;

public class GreatesNo {

	public static void main(String[] args) {
		int a =120,b=100,c=50;
		int max=(a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println("max:"+max);
		
		//2nd way
		max=0;
		if(a>b && a>c)
		{	
			max=a;
		}else if(b>a && b>c)
		{	
			max=b;
		}else{
			max=c;
		}
		System.out.println("max:"+max);
		
		
		
		//find 2nd max
		int max2;
		if(a>b && a<c || a>c && a<b)
		{	
			max2=a;
		}else if(b>a && b<c || b>c && b<a)
		{	
			max2=b;
		}else{
			max2=c;
		}
		System.out.println("max2:"+max2);

		
	}

}
