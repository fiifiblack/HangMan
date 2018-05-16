package hangMan;



	import java.awt.List;
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Scanner;

	public class HangWord {
		/**
		 * Evans Appiah, ITTP @author GCE HangMang Project 02/26/2018 Contact Evans (
		 * evans.appiah@me.com) .
		 */
		static {
			System.out.println("Welcome to Hangman game." + '\n' + "Please follow instructions:" + '\n'
					+ "Invalid entries will be counted. " + '\n'
					+ "Number of guesses are limited to the number of letters/dashes in the word" + '\n' + "Good luck!");
		}

		static int count = 1;

		public static void main(String[] args) throws java.io.IOException {

			int row = (int) (Math.random() * 6);

			String[][] str = { { "s", "h", "e", "e", "p" }, { "b", "e", "a", "v", "e", "r" },
					{ "e", "l", "e", "p", "h", "a", "n", "t" }, { "d", "e", "e", "r" },
					{ "r", "h", "i", "n", "o", "c", "e", "r", "o", "s" }, { "k", "a", "n", "g", "a", "r", "o", "o" } };

			Scanner sc2 = new Scanner(System.in);

			@SuppressWarnings("null")
			String[] playerGuess = new String[str[row].length];// new String[str.length];

			for (int j = 0; j < str[row].length; j++) {// str[1].length bm
				playerGuess[j] = "-";// setting blank form
			}

			System.out.println();

			for (String i : playerGuess)
				System.out.print(i);// Printing blank form
			
			System.out.println();
			System.out.println("Hint: Word lenght: " + playerGuess.length);
			System.out.println();
			
			Library.hints(row);
			do {
				System.out.println('\n' + "Please guess/enter a letter.");
				String guess2 = sc2.nextLine().toLowerCase().trim().toString();//

				for (int i = 0; i < str[row].length; i++) {
					if (str[row][i].equals(guess2)) // checking if guess is correct
						playerGuess[i] = guess2;

					// else if (!str[i] .equals(guess2))
					// System.out.println("try again");
				}
				for (String i : playerGuess)
					System.out.print(i);

				count++;
				System.out.println('\n');

			} while (!Arrays.toString(playerGuess).equals(Arrays.toString(str[row])));// count != playerGuess.length &&
			// while loop stops in output of arrays are equal
			if (Arrays.toString(playerGuess).equals(Arrays.toString(str[row]))) {
				System.out.println("You WON! " + '\n'+ "You may restart and try again.");
			} else
				System.out.println("Sorry, Winners never quit.You may restart and try again.");

		}

	}

	class Library {

		static void hints(int a) {
			if (a == 0) {
				System.out.println("Hint: My plural form is the same as my singular form.");
			} else if (a == 1) {
				System.out.println("Hint: I am nocturnal, and  I am acknowledged on one Canadian coin.");
			} else if (a == 2) {
				System.out.println("Hint: I am curvy and conservative. ");
			} else if (a == 3) {
				System.out.println("Hint: No thanks Edison, I hate headlights.");
			} else if (a == 4) {
				System.out.println(
						"Hint: My horn  has medicinal values. As a BOSS, my only predators" + " in Africa are large wild  cats .");
			} else if (a == 5) {
				System.out.println("Hint: I am Australian.");
			}
		}

	}// https://www.youtube.com/watch?v=VvKGhCaxHSg

