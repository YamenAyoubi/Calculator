package Eclipse.Calculator;

import java.util.Scanner;

public class calculations {

	static int Result;
	static Scanner in = new Scanner(System.in);

	static void Addition(int A, int B) {
		Result = A + B;
	}
	  
	static void Subtraction(int A, int B) {
		Result = A - B;

	}

	static void Multiplication(int A, int B) {
		Result = A * B;

	}
	
	static int Division(int A, int B) {

		try {
			
			Result = A / B;
			
		}catch(Exception e){
			
			System.out.println("Numbers Cant Divided By Zero");
		}
		return 0;

	}

	static void PrintOut() {

		System.out.println("The Result Is :" + " " + Result);
	}
}