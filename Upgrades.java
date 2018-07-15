package assignment1;

import java.util.Scanner;

public class Upgrades {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		String[] values1 = Settings.values1;
		String[] values2 = Settings.values2;
		int[] stats = Settings.stats;
		int[] levelUp = Settings.levelUp; 
		String input = ""; //Input for (Weaponsmith/Armoury/Training/CheckStats)
		String accept = ""; //For Yes/No inputs

		double gold = Assignment1_BT.gold;
		
		int delay = Settings.delay; 
		
		boolean breakLoop = false; 
		
		do {
			if (breakLoop) {
				breakLoop = false;
				break;
			}
			do {
				Tools.slowPrintln("Where would you like to go?", delay);
				Tools.print("Input (Weaponsmith/Armoury/Training/CheckStats/EnterArena): ");
				input = read.next();
				
				if (input.equalsIgnoreCase("EnterArena")) {
					breakLoop = true;
				} 
	
				else if (input.equalsIgnoreCase("Weaponsmith")) {
					
					// Levels up attack
					Tools.slowPrintln("Sword level "+ (levelUp[0] + 1) +" costs 350 gold. You have "+gold+" gold.", delay);
					Tools.slowPrintln("Would you like to upgrade your sword?", delay);
					Tools.print("Input (Yes/No): ");
					accept = read.next();
					
					if (accept.equalsIgnoreCase("Yes")) {
						if (gold - 350 < 0) {
							Tools.slowPrintln("Not enough money!", delay);
						}
						
						else {
							Tools.slowPrintln("You now have sword level "+(levelUp[0] + 1) +"!", delay);
							levelUp[0] = levelUp[0] + 1;
							Tools.slowPrintln("You gained +3 attack!", delay);
							stats[0] = stats[0] + 3;
							gold = gold - 350;
							Tools.slowPrintln("You have "+gold+" gold left.", delay);
						}
					}
				}
	
				else if (input.equalsIgnoreCase("Armoury")) {
					// Levels up health
					Tools.slowPrintln("Armour level "+ (levelUp[1] + 1) +" costs 300 gold. You have "+gold+" gold.", delay);
					Tools.slowPrintln("Would you like to upgrade your armour?", delay);
					Tools.print("Input (Yes/No): ");
					accept = read.next();
					
					if (accept.equalsIgnoreCase("Yes")) {
						if (gold - 350 < 0) {
							Tools.slowPrintln("Not enough money!", delay);
						}
						
						else {
							Tools.slowPrintln("You now have armour level "+(levelUp[1] + 1) +"!", delay);
							levelUp[1] = levelUp[1] + 1;
							Tools.slowPrintln("You gained +2 health!", delay);
							stats[4] = stats[4] + 2;
							gold = gold - 350;
							Tools.slowPrintln("You have "+gold+" gold left.", delay);
						}
					}			
				}
	
				else if (input.equalsIgnoreCase("Training")) {
					
					Tools.slowPrintln("Would you like to upgrade agility, stamina, or defence? Each cost 100 gold. You have "+gold+".", delay);
					Tools.print("Input (Agility/Stamina/Defence): ");
					accept = read.next();
					
					if (accept.equalsIgnoreCase("Agility")) {
						
						Tools.slowPrintln("Agility increases your ability to dodge attack.", delay);
						Tools.slowPrintln("Would you like to upgrade agility?", delay);
						Tools.print("Input (Yes/No): ");
						accept = read.next();
						
						if (accept.equalsIgnoreCase("Yes"))	{
						
							if (gold - 100 < 0) {
								Tools.slowPrintln("Not enough money!", delay);
							}
							
							else {
								gold = gold - 100;
								Tools.slowPrintln("You have "+gold+" gold left.", delay);
								levelUp[2] = levelUp[2] + 1;
								
							}
						}
					}
					
					else if (accept.equalsIgnoreCase("Stamina")) {
						
						Tools.slowPrintln("Stamina increases your energy capacity to attack. If you run out of energy, you have to wait a turn.", delay);
						Tools.slowPrintln("Would you like to upgrade stamina? ", delay);
						Tools.print("Input (Yes/No): ");
						accept = read.next();
						
						if (accept.equalsIgnoreCase("Yes")) {
							
							if (gold - 100 < 0) {
								Tools.slowPrintln("Not enough money!", delay);
							}
							
							else {
								gold = gold - 100;
								Tools.slowPrintln("You have "+gold+" gold left.", delay);
								levelUp[3] = levelUp[3] + 1;
							}
						}
					}
					
					else if (accept.equalsIgnoreCase("Defence")) {
						
						Tools.slowPrintln("Defence increases your chance to block an enemy attack.", delay);
						Tools.slowPrintln("Would you like to upgrade defence? ", delay);
						Tools.print("Input (Yes/No): ");
						accept = read.next();
						
						if (accept.equalsIgnoreCase("Yes")) {
						
							if (gold - 100 < 0) {
								Tools.slowPrintln("Not enough money!", delay);
							}
							
							else {
								gold = gold - 100;
								Tools.slowPrintln("You have "+gold+" gold left.", delay);
								levelUp[4] = levelUp[4] + 1;
							}
						}
					}
				}
	
				else if (input.equalsIgnoreCase("CheckStats")) {
					
					Tools.printStats(values1, stats);
					Tools.printLevelUp(values2, levelUp);
	
				}
				
			} while (!input.equalsIgnoreCase("Weaponsmith") && !input.equalsIgnoreCase("Armoury")
					&& !input.equalsIgnoreCase("Training") && !input.equalsIgnoreCase("Stats") && !input.equalsIgnoreCase("EnterArena"));
		} while (gold >= 0);

	}

}
