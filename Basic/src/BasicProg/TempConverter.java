package BasicProg;
import java.util.Scanner;

public class TempConverter {

	public static void main(String[] args) {
		 float Fahrenheit, Celsius;  
		 System.out.println("Enter the Temp in Fahrenheit ");
		 Scanner sc = new Scanner(System.in);
         Fahrenheit = sc.nextFloat();  
         Celsius  = ((Fahrenheit-32)*5)/9;  
         System.out.println("Temperature in celsius is: "+Celsius);  

	}

}
