// Author: Cesar Olague
// Lab: 11
// Description: This code will as the user to input a number it will return its square, along with a message.

import java.util.Scanner;
import java.io.*;

class Colague11 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		String userInput = null;


		while (!isNumeric(userInput)) {
			
			System.out.print("Enter a number to square: ");
			userInput = keyboard.nextLine();

			if (!isNumeric(userInput))
				System.out.println("Input was not valid. Try Again!");
		}

		int square = (int) Math.pow(Integer.parseInt(userInput), 2);
		System.out.printf("Your number squared is %d. Better %d than %d.%n", square, square, square-1);


		

	}

	/*
	 * Method checks if the input is a valid numeric
	 */
	static public boolean isNumeric(String input) {
		
		if (input == null)
			return false;

		try {
			int i = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			return false;
		}

		return true;
	}
}
