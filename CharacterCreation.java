package assignment1;

import java.util.Scanner;

public class CharacterCreation {
	
	static int attack = 0;
	

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		// Variables
		String[] values1 = Settings.values1;
		int[] stats = Settings.stats;
		String accept = ""; //For Yes/No inputs
		
		// Characteristics
		int attack = Settings.attack;
		int agility = Settings.agility;
		int stamina = Settings.stamina;
		int defence = Settings.defence;
		int health = Settings.health;
	
		int left = Settings.left;
		int delay = Settings.delay;
		
		Tools.println("   ___           _     _       ___                                _   _             \n" + 
				"  / _ \\__ _ _ __| |_  / |_    / _ \\_ __ ___ _ __   __ _ _ __ __ _| |_(_) ___  _ __  \n" + 
				" / /_)/ _` | '__| __| | (_)  / /_)/ '__/ _ \\ '_ \\ / _` | '__/ _` | __| |/ _ \\| '_ \\ \n" + 
				"/ ___/ (_| | |  | |_  | |_  / ___/| | |  __/ |_) | (_| | | | (_| | |_| | (_) | | | |\n" + 
				"\\/    \\__,_|_|   \\__| |_(_) \\/    |_|  \\___| .__/ \\__,_|_|  \\__,_|\\__|_|\\___/|_| |_|\n" + 
				"                                           |_|                                      ");
		Tools.pause(1500);
		Tools.slowPrintln("You have 25 skill points to put into certain characteristics.", delay);
		Tools.print("The possible characteristics are: ");
		Tools.slowPrintln("Attack, Agility, Stamina, Defence, and Health.", delay);

		do {
			do {
				// Attack
				Tools.print("How many points do you want in attack? ");
				attack = read.nextInt();
				
				if (attack >= 0 && attack <= 25) {
					stats[0] = attack;
					left = 25 - attack;
					
				} else {
					Tools.println("That is past the limit");
				}
			} while (stats[0] == -1);

			Tools.slowPrintln("You have " + left + " skill points left.", delay);

			do {
				// Agility
				Tools.print("How many points do you want in agility? ");
				agility = read.nextInt();
				
				if (agility >= 0 && agility <= left) { 
					stats[1] = agility;
					left = left - agility;
				} else {
					Tools.println("That's past the limit!");
				}
				
			} while (stats[1] == -1);

			Tools.slowPrintln("You have " + left + " skill points left.", delay);

			do {
				// Stamina
				Tools.print("How many points do you want in stamina? ");
				stamina = read.nextInt();
				
				if (stamina >= 0 && stamina <= left) { 
					stats[2] = stamina;
					left = left - stamina;
				} else {
					Tools.println("That's past the limit!");
				}
				
			} while (stats[2] == -1);

			Tools.slowPrintln("You have " + left + " skill points left.", delay);

			do {
				// defence
				Tools.print("How many points do you want in defence? ");
				defence = read.nextInt();
				
				if (defence >= 0 && defence <= left) { 
					stats[3] = defence;
					left = left - defence;
				} else {
					Tools.println("That's past the limit!");
				}
				
			} while (stats[3] == -1);

			Tools.slowPrintln("You have " + left + " skill points left.", delay);

			do {
				// Health
				Tools.print("How many points do you want in health? ");
				health = read.nextInt();
				
				if (health >= 0 && health <= left) { 
					stats[4] = health;
					left = left - health;
				} else {
					Tools.println("That's past the limit!");
				}
				
			} while (stats[4] == -1);

			Tools.println("Here are your stats: "); 

			Tools.printStats(values1, stats);
			
			Tools.slowPrintln("Do you like this character?", delay);
			Tools.print("Input (Yes/No): ");
			accept = read.next();

		} while (accept.equalsIgnoreCase("No"));

	}

}
