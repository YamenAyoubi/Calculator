package Eclipse.Calculator;

import java.util.Scanner;

public class DoYouWannaCalculateAgain {

	static Scanner in = new Scanner(System.in);

	static boolean PlayAgain(String answer) {

		String upperCaseString = answer.toUpperCase();
		switch (upperCaseString) {
		case "Y":
			System.out.println("****  Welcome Back  ****");
			return true;
		default:
			System.out.println("**** See You Soon ****");
			return false;
		}
	}

	public static String GetPlayAgainAnswer() {
		return in.nextLine();
	}
}
