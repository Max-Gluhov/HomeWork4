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
			return;
		case 1:// Aviyam
			break;
		case 2:// Max
			int product_numbers;
			double capacity, max_profit;
			double[] value, volume;

			System.out.print("Enter the Capacity> ");
			capacity = sc.nextDouble();
			if (capacity <= 0) {
				System.out.println("Wrong input");
				break;
			}

			System.out.println("Enter the products numbers>");
			product_numbers = sc.nextInt();

			value = new double[product_numbers];
			for (int i = 0; i < value.length; i++) {
				if (sc.hasNextDouble())
					value[i] = sc.nextDouble();
			}
			volume = new double[product_numbers];
			for (int i = 0; i < volume.length; i++) {
				if (sc.hasNextDouble())
					volume[i] = sc.nextDouble();
			}

			max_profit = KnapsackProb(capacity, value, volume);
			System.out.println("The max profit is = " + max_profit);
			break;
		case 3:// Aviyam
			break;
		case 4:// Max
			break;
		default:
			System.out.println("Wrong input");
		}
		mainMenu();
	}

	public static double KnapsackProb(double capacity, double[] value, double[] volume) {
		return KnapsackProb(capacity, value, volume, 0, 0);
	}

	public static double KnapsackProb(double capacity, double[] value, double[] volume, int i, double profit) {
		
	}
}
