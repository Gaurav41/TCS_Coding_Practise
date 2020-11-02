package BasicProg;

public class Fabo_recursion {

	public int fabo(int num)
	{
		if(num==1||num==2)
		{
			return 1;
		}if(num==0)
		{
			return 0;
		}
		else{
			return fabo(num-2)+fabo(num-1);
		}
	}
	public static void main(String[] args) {
		Fabo_recursion fb = new Fabo_recursion();
		for(int i=1;i<=5;i++)
		System.out.print(fb.fabo(i)+" ");
		System.out.println("\n"+fb.fabo(5));
	}

}
