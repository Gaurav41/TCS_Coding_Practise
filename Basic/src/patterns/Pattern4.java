package patterns;
/*

****
 ***
  **
   *
 
 */
public class Pattern4 {

	public static void main(String[] args) {
		int rows=4;
		for(int i =1;i<=rows;i++){
			for(int k=0;k<(i-1);k++){
				System.out.print(" ");
			}
			for(int j=i;j<=rows;j++){ //for(int j=1;j<=(rows+1)-i;j++)
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
