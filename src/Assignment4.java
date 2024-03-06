import java.util.Scanner;

public class Assignment4 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		mainMenu();
	}

	public static void mainMenu() {
		int user_input = -1;

		System.out.print("0. End program\n" + "1. No Caps\n" + "2. Knapsack Problem\n" + "3. Count Ways\n"
				+ "4. Merge Strings\n" + "Enter a digit 0-4> ");
		user_input = sc.nextInt();

		switch (user_input) {
		case 0:
			System.out.println("End program");
			break;
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		default:
			System.out.println("Wrong input");
			mainMenu();
		}
	}
}
