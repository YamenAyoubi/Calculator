package Eclipse.Calculator;

import java.util.Scanner;

public class App {

	static Scanner in = new Scanner(System.in);
	static boolean Running = true;
	static int Selections;
	static Double Number1;
	static Double Number2;

	public static void main(String[] args) {
		while (Running) {

			System.out.println("1 = + , 2 = - , 3 = / , 4 = *");

			System.out.println("Please Select The Operation From The List");
			Selections = in.nextInt();

			switch (Selections) {

			case 1:
				System.out.println("Enter First Number Please ");
				Number1 = in.nextDouble();

				System.out.println("Enter Second Number Please");
				Number2 = in.nextDouble();

				calculations.Addition(Number1, Number2);
				calculations.PrintOut();
				break;

			case 2:
				System.out.println("Enter First Number Please ");
				Number1 = in.nextDouble();

				System.out.println("Enter Second Number Please");
				Number2 = in.nextDouble();

				calculations.Subtraction(Number1, Number2);
				calculations.PrintOut();
				break;

			case 3:
				System.out.println("Enter First Number Please ");
				Number1 = in.nextDouble();

				System.out.println("Enter Second Number Please");
				Number2 = in.nextDouble();

				calculations.Division(Number1, Number2);
				calculations.PrintOut();
				break;

			case 4:
				System.out.println("Enter First Number Please ");
				Number1 = in.nextDouble();

				System.out.println("Enter Second Number Please");
				Number2 = in.nextDouble();

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
