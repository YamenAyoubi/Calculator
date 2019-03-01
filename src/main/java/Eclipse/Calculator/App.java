package Eclipse.Calculator;

import java.util.Scanner;

public class App {

	static Scanner in = new Scanner(System.in);
	static boolean Running = true;
	static int Selections;
	static int Number1;
	static int Number2;

	public static void main(String[] args) {
		
		while (Running) {

			System.out.println("1 = + , 2 = - , 3 = / , 4 = *");
			System.out.println("Please Select The Operation From The List");
			Selections = ValidNumber.getNumber();
			System.out.println("Enter First Number Please ");
			Number1=ValidNumber.getNumber();
			System.out.println("Enter Second Number Please");
			Number2=ValidNumber.getNumber();
			
			switch (Selections) {

			case 1:

				calculations.Addition(Number1, Number2);
				break;

			case 2:

				calculations.Subtraction(Number1, Number2);
				break;

			case 3:
				
				calculations.Division(Number1, Number2);
				break;

			case 4:
				
				calculations.Multiplication(Number1, Number2);
				break;

			default:
				System.out.println("Please Select From The List ");
				break;
				
			}
			calculations.PrintOut();
			
			System.out.println("Do You Want To Buy Again ? (Y/N)");
			String answer = DoYouWannaCalculateAgain.GetPlayAgainAnswer().toUpperCase();
			Running = DoYouWannaCalculateAgain.PlayAgain(answer);
		}
	}
}