import java.util.Scanner;

public class Assignment4 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		mainMenu();
	}

	public static void mainMenu() {
		int user_input = -1;

		System.out.print("0. End program\n" + "1. No Caps\n" + "2. Knapsack Problem\n" + "3. Count Ways\n"
				+ "4. Merge Strings\n" + "Enter a digit 0-4>");
		user_input = sc.nextInt();

		switch (user_input) {
		case 0:
			System.out.println("End program");
			return;
		case 1:// Aviyam
			break;
		case 2:// Max. Knapsack problem
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

			volume = new double[product_numbers];
			System.out.println("Enter the volumes of the products>");
			for (int i = 0; i < volume.length; i++) {
				if (sc.hasNextDouble())
					volume[i] = sc.nextDouble();
			}
			System.out.println("Enter the values of the products>");
			for (int i = 0; i < value.length; i++) {
				if (sc.hasNextDouble())
					value[i] = sc.nextDouble();
			}

			max_profit = KnapsackProb(capacity, value, volume);
			System.out.println("The max profit is = " + max_profit);
			break;
		case 3:// Aviyam
			break;
		case 4:// Max. Merge two alphabetized strings into one alphabetized string
			String first, second, merge;

			System.out.print("Enter first string> ");
			first = sc.next();
			System.out.print("Enter second string> ");
			second = sc.next();

			merge = mergeStrings(first, second);
			System.out.println("The new string is: " + merge);
			break;
		default:
			System.out.println("Wrong input");
		}
		mainMenu();
	}

	// Wrapper method for recursive KnapsackProb
	public static double KnapsackProb(double capacity, double[] value, double[] volume) {
		return KnapsackProb(capacity, value, volume, 0, 0);
	}

	// Recursive method to solve Knapsack problem
	public static double KnapsackProb(double capacity, double[] value, double[] volume, int i, double profit) {
		// Check i overflow/underflow
		if (i < 0 || i >= value.length)
			return 0;
		// If current item doesn't fit, continue with next item
		if (volume[i] > capacity)
			return KnapsackProb(capacity, value, volume, i + 1, profit);

		// Profit if current item is included
		double current_profit = value[i] + KnapsackProb(capacity - volume[i], value, volume, i + 1, profit + value[i]);
		// Profit if current item is excluded
		double next_profit = KnapsackProb(capacity, value, volume, i + 1, profit);

		// Return maximum between the profits
		if (current_profit > next_profit)
			return current_profit;
		return next_profit;
	}

	// Recursive method to merge two alphabetized strings into one alphabetized
	// string
	public static String mergeStrings(String first, String second) {
		// If one string is empty, then return the other string
		if (first.isEmpty())
			return second;
		if (second.isEmpty())
			return first;

		// Take the letter that is smaller alphabetically
		// Concat recursively with the strings without that letter
		if (first.charAt(0) < second.charAt(0))
			return first.charAt(0) + mergeStrings(first.substring(1), second);
		return second.charAt(0) + mergeStrings(first, second.substring(1));
	}
}
