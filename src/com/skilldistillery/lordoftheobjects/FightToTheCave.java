//Task 1: Class Design

// Classic RPG - Fight To The Cave
// Primary Player - Abstract Class
//      - Knight
//		- Ranger
// 		- Mage
// Enemies - Abstract
// 		- Orc 
//		- Goblin
//		- Dragon
// Items - Abstract
//		- Exp (more hit points)
//		- Drops (Weapon = Sword, Bow, Staff)
//		- Hearts (health) // printout hearts depending on health

// 

//Task 2: Implementation

package com.skilldistillery.lordoftheobjects;

import java.util.Scanner;

public class FightToTheCave {

	public static void main(String[] args) {
		// instantiate the characters/player objects
		Knight knight = new Knight();
		Ranger ranger = new Ranger();
		Mage mage = new Mage();
		// instantiate the Enemies objects
		Goblin goblin = new Goblin();
		Orc orc = new Orc();
		Dragon dragon = new Dragon();

		// Get User input
		Scanner kb = new Scanner(System.in);
		int choice, move;
		// choice must be 1, 2, or 3
		do {
			// Greet the player and ask for choice of character/player
			printWelcomeMsg();
			choice = kb.nextInt();
			kb.nextLine();
		} while (choice < 1 || choice > 3);
		// create a player/character
		switch (choice) {
		case 1:
			System.out.println("You have chosen to be a Knight!");
			System.out.println("What would you like to name your Knight? ");
			String kName = kb.nextLine();
			knight.setName(kName);
			knight.setHasWeapon(false);
			break;
		case 2:
			System.out.println("You have chosen to be a Ranger!");
			System.out.println("What would you like to name your Ranger? ");
			String rName = kb.nextLine();
			ranger.setName(rName);
			ranger.setHasWeapon(false);
			break;
		case 3:
			System.out.println("You have chosen to be a Mage!");
			System.out.println("What would you like to name your Mage? ");
			String mName = kb.nextLine();
			mage.setName(mName);
			mage.setHasWeapon(false);
			break;
		default:
			System.out.println("Must Enter: \"1\", \"2\", or \"3\"");
		}

		// move must be 1, 2, or 3 // definitely needs to be made into a method... DRY!
		do {
			// Player can now walk along the town
			walkAlong();
			move = kb.nextInt();
			kb.nextLine();
		} while (move < 1 || move > 3);
		// create a player/character
		switch (move) {
		case 1:
			System.out.println(
					"You walk Left, and you enter an evergreen forest...\n!!!!!WARNINNG!!!!!!!\nA Goblin appears before you ready to a fight!\nHe attacks you\n.... You Take a Direct Hit!");
			System.out.println("What would you like to name your Knight? ");
			String kName = kb.nextLine();
			knight.setName(kName);
			knight.setHasWeapon(false);
			break;
		case 2:
			System.out.println("You have chosen to be a Ranger!");
			System.out.println("What would you like to name your Ranger? ");
			String rName = kb.nextLine();
			ranger.setName(rName);
			ranger.setHasWeapon(false);
			break;
		case 3:
			System.out.println("You have chosen to be a Mage!");
			System.out.println("What would you like to name your Mage? ");
			String mName = kb.nextLine();
			mage.setName(mName);
			mage.setHasWeapon(false);
			break;
		default:
			System.out.println("Must Enter: \"1\", \"2\", or \"3\"");
		}

		kb.close();
	}// end of main

	public static void printWelcomeMsg() {
		System.out.println(" _______________");
		System.out.println("|...            |");
		System.out.println("|   WELCOME TO  |");
		System.out.println("|  FIGHT TO THE |");
		System.out.println("|      CAVE!... |");
		System.out.println("|_______________|");
		System.out.println("You find yourself in the busy market square of a \n"
				+ "medieval town... Would you like to be a \"1\" Knight, \"2\" Ranger, or \"3\" Mage?");
	}

	public static void walkAlong() {
		System.out.println(" _______________");
		System.out.println("|...            |");
		System.out.println("|  WALK ALONG,  |");
		System.out.println("|  MY FRIEND!...|");
		System.out.println("|_______________|");
		System.out.println("You must now choose how you want to Walk along the town...");
		System.out.println("\"1\" Left (Forest), \"2\" Stright (Alleyway), \"3\" Right (Darker Forest)");
	}
}