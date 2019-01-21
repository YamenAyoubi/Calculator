package Eclipse.Calculator;

import java.util.Scanner;

public class Input {
	
	static Scanner in = new Scanner (System.in);
			static double Number1;
			static double Number2;
			
			public static Double input1 () {
				
	System.out.println("Enter First Number Please ");
	return Number1 = in.nextDouble();
			}
			
			public static Double input2 () {
	
	System.out.println("Enter Second Number Please");
	return Number2 = in.nextDouble();
			}
}
