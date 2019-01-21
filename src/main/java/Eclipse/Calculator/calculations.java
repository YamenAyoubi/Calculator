package Eclipse.Calculator;

import java.util.Scanner;

public class calculations {

	static double Result;
	static Scanner in = new Scanner(System.in);


	static double Addition(double A ,double B) {
		Result = A + B;
		return 0;
		
	}

	static double Subtraction( double A ,double B) {
		Result = A - B;
		return 0;
		
	}

	static double Multiplication(double A ,double B) {
		Result = A * B;
		return 0;
		
	}

	static double Division(double A ,double B) {
		
		if (A == 0 || B == 0) {	
		}else {
			
			Result = A / B;
		}
		return 0;
		
	}
	
	static void PrintOut () {
		
		System.out.println(Result);
	}

}
