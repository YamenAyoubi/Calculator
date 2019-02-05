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

			switch (Selections) {

			case 1:
				Number1=Input.input1();
				Number2=Input.input2();

				calculations.Addition(Number1, Number2);
				calculations.PrintOut();
				break;

			case 2:
				Number1=Input.input1();
				Number2=Input.input2();


				calculations.Subtraction(Number1, Number2);
				calculations.PrintOut();
				break;

			case 3:
				Number1=Input.input1();
				Number2=Input.input2();

				calculations.Division(Number1, Number2);
				calculations.PrintOut();
				break;

			case 4:
				Number1=Input.input1();
				Number2=Input.input2();

				calculations.Multiplication(Number1, Number2);
				calculations.PrintOut();
				break;

			default:
				System.out.println("Please Select From The List ");
				break;
			}
			System.out.println("Do You Want To Buy Again ? (Y/N)");
			String answer = DoYouWannaCalculateAgain.GetPlayAgainAnswer().toUpperCase();
			Running = DoYouWannaCalculateAgain.PlayAgain(answer);
		}
	}
}