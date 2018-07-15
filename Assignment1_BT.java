package assignment1;

import java.util.Scanner;

public class Assignment1_BT {

	private static String[] args;
	public static String name;
	public static double gold = 200;
	
	public static void game() {
		
		Scanner read = new Scanner(System.in);
		
		// Variables
		int delay = Settings.delay;
		
		Tools.slowPrintln("Ever since you were little, you wanted to be a gladiator.", delay);
		Tools.pause(500);
		Tools.slowPrintln("Now you're all grown up and it's time to show your skills.", delay);
 		Tools.pause(1000);
		//PART 1: PREPARATION
		CharacterCreation.main(args);
		
		//PART 2 INTRODUCTION
		Tools.pause(1000);
		Tools.println("   ___           _     ____       _____       _                 _            _   _             \n" + 
				"  / _ \\__ _ _ __| |_  |___ \\ _    \\_   \\_ __ | |_ _ __ ___   __| |_   _  ___| |_(_) ___  _ __  \n" + 
				" / /_)/ _` | '__| __|   __) (_)    / /\\/ '_ \\| __| '__/ _ \\ / _` | | | |/ __| __| |/ _ \\| '_ \\ \n" + 
				"/ ___/ (_| | |  | |_   / __/ _  /\\/ /_ | | | | |_| | | (_) | (_| | |_| | (__| |_| | (_) | | | |\n" + 
				"\\/    \\__,_|_|   \\__| |_____(_) \\____/ |_| |_|\\__|_|  \\___/ \\__,_|\\__,_|\\___|\\__|_|\\___/|_| |_|\n" + 
				"                                                                                               ");
		Tools.pause(1500);
		Tools.print("Hello fellow gladiator! What is your name? ");
		name = read.next();
		Tools.slowPrintln("Welcome to the arena, " + name + "!", delay);
		Tools.slowPrintln("After each win in the Arena, you will get 10 skill points and some gold to upgrade your character.", delay);
		Tools.slowPrintln("You will have the chance to go to the Weaponsmith, Armoury, or into Training to upgrade your stats after a battle.", delay);
		Tools.slowPrintln("You start off with 200 gold.", delay);
		
		//UPGRADE OPTIONS AFTER EACH BATTLE
		Upgrades.main(args);
		
		//ARENA FIGHT DUEL 1
		Duel1.main(args);
		
		//If wins duel 1
		if (Duel1.armosHealth <= 0) {
			Tools.slowPrintln("Congratulations, you won the duel! You gained 10 skill points and 250 gold.", delay);
			gold = gold + 250; 
			Tools.slowPrintln("Now you have the chance to make some upgrades or enter the next duel.", delay);
			
			//UPGRADES AFTER DUEL 1
			Upgrades.main(args);
			
		}
		
		Tools.slowPrintln("Duel 2 coming soon!", delay);
		
	} // end game

	public static void main(String[] args) {

		Scanner wordsIn = new Scanner(System.in);

		String input = "";
		int delay = Settings.delay;

		do {

			game();

			Tools.slowPrintln("Play again? (YES/NO)", delay);
			Tools.print("Input: ");
			input = wordsIn.nextLine();

		} while (input.equalsIgnoreCase("Yes"));

		Tools.slowPrintln("End Game", delay);

	} // end main

} // end class
