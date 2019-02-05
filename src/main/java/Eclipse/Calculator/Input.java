package Eclipse.Calculator;

import java.util.Scanner;

public class Input {
	
	static Scanner in = new Scanner (System.in);
			static int Number1;
			static int Number2;
			
			public static int input1 () {
				
	System.out.println("Enter First Number Please ");
	return Number1 = in.nextInt();
			}
			
			public static int input2 () {
	
	System.out.println("Enter Second Number Please");
	return Number2 = in.nextInt();
			}
}
