package NQTCodingQuestions_2020;

import java.util.Scanner;

public class StringUniqueChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		boolean f1=true,f2 = false;
		if (str.length() > 20) {
			System.out.println("Invalid Input");
			return;
		}

		for (int i = 0; i < str.length(); i++) {	
			f2 = true;
			char c = str.charAt(i);
			for (int j = 0; j < str.length(); j++) {
				if (i != j) {
					if (c == (str.charAt(j))) {						
						f2 = false;
						break;
					} 
				}
			}
			if (f2) {
				f1=false;
				System.out.print(c+" ");
			}
		}
		System.out.println();

		if (f1) {
			System.out.println("invalid");
		}

	}

}
