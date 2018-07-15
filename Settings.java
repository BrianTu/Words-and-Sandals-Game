package assignment1;

import java.util.Scanner;

public class Settings {
	
	// Variables
	static String[] values1 = { "Attack", "Agility", "Defence", "Stamina", "Health" };
	static String[] values2 = { "Sword", "Armour", "Agility", "Stamina", "Defence" }; //Add percentages to chance of block, dodge, and stamina.
	static int[] stats = { -1, -1, -1, -1, -1 };
	static int[] levelUp = { 1, 1, 1, 1, 1 };
	String name = Assignment1_BT.name;
	
	//Attributes
	static int attack = 0;
	static int agility = 0;
	static int stamina = 0;
	static int defence = 0;
	static int health = 0;

	//Skill points left
	static int left = 0; 

	//Currency
	static double gold = Assignment1_BT.gold; 
	
	// Slow typing time
	static int delay = 50; 

	public static void main(String[] args) {		

	}

}
