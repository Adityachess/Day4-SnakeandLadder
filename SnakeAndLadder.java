package com.bridgelabz.snakenladder;

public class SnakeAndLadder {

	static int position = 0;

	public static void main(String[] args) {

		System.out.println("Welcome to Snake and Ladder game");

		int choice = (int) (Math.random() * 3) + 1;

		switch (choice) {

		case 1:
			System.out.println("Here is the Ladder");

			int number = (int) (Math.random() * 6) + 1;
			System.out.println("The number you have after the dice roll is :" + number);
			position += number;
			break;

		case 2:
			System.out.println("Here is the snake");

			number = (int) (Math.random() * 6) + 1;
			System.out.println("The number you have after the dice roll is :" + number);

			if (position == 0) {
				position = 0;
			}
			else if (position < 0) {
				position = 1;
			}
			else {
				position -= number;
			}
			break;

		default:
			System.out.println("No Switch");
		}

	}

}
