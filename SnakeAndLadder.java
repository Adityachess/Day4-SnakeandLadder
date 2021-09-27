package com.bridgelabz.snakenladder;

public class SnakeAndLadder {

	static int position = 0;

	public static void main(String[] args) {

		System.out.println("Welcome to Snake and Ladder game");

		while (position <= 100) {

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
				System.out.println("Getting the number which neither has Snake or Ladder");
				
				number = (int) (Math.random() * 6) + 1;
				System.out.println("The number you have after the dice roll is :" + number);
				position += number;
			}
			
			System.out.println("The current Position of a Player is :" + position);
		}
		
		System.out.println("The New position of a Player is :" + position);

	}
}
