//Task 1: Class Design

// Game Name:  Fight To The Cave

// Game Style/Type: Classic RPG

// Storyline: Middle Ages / Medieval Town is in distress! There are enemies attacking the town, and we need a hero to eliminate them...

// GamePlay: Our hero will choose where to go, and attack each of the enemies until the end boss, Dragon, has been slayed! Game ends when
//           the hero either dies, or defeats the enemies. Must have at least have 3 kills! Each character will have a weapon, and damage
//			 will make damage double, and after a kill, an enemy might "drop" an item.

// Characters: 
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


//Task 2: Implementation - GitHub Repo:  https://github.com/theunmanifested/LordOfTheObjects 

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
		int choice, move, numEnemy;
		boolean isDead = false;
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
		// currently only knight can playthrough
		case 1:
			numEnemy = 1;
			attackEnemy(numEnemy, knight.isHasWeapon(), knight, goblin);			
			break;
		case 2:
			numEnemy = 2;
//			attackEnemy(numEnemy, knight.isHasWeapon(), knight, orc);
			break;
		case 3:
			numEnemy = 3;
//			attackEnemy(numEnemy, knight.isHasWeapon(), knight, dragon);
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
	
	public static void attackEnemy(int numEnemy, boolean hasWeapon,PlayerRoles chosenPlayer, Goblin currentEnemy) {
		System.out.println(
				"You walk Left, and you enter an evergreen forest...\n\n!!!!!WARNINNG!!!!!!!\n\nA Goblin appears before you ready to a fight!\nHe attacks you\n\n.... You Take a Direct Hit! and You Attack Back!!!\nYou strike a powerful blow!\n\n");
		if (hasWeapon) {
			currentEnemy.setEnemHitPoints(currentEnemy.getEnemHitPoints() - 50);
			System.out.println("Enemy's Health left is: " + currentEnemy.getEnemHitPoints());

		} else {
			currentEnemy.setEnemHitPoints(currentEnemy.getEnemHitPoints() - 25);
			System.out.println("Enemy's Health left is: " + currentEnemy.getEnemHitPoints());
		}			
	}

}