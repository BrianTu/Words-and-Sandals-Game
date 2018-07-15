package assignment1;

import java.util.Scanner;

public class Duel1 {

	static int armosHealth = 100;
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int delay = Settings.delay;
		
		int[] stats = Settings.stats;
		String name = Assignment1_BT.name; 
		
		//Your stats 
		int health1 = stats[4]*20;
		int choice = 0;
		
		//Armos's Stats
		int armosDmg = 10;
		
		Tools.slowPrintln("Welcome to your first fight, "+name+"!", delay); 
		Tools.slowPrintln("Your first challenger is Armos." , delay);
		Tools.slowPrintln("Armos has "+armosHealth+" health points. If you get it to 0, you win!", delay);
		Tools.pause(1000);
		Tools.println("   __      _     _   _             __ _       _     _     _                _           _ \n" + 
				"  / /  ___| |_  | |_| |__   ___   / _(_) __ _| |__ | |_  | |__   ___  __ _(_)_ __     / \\\n" + 
				" / /  / _ \\ __| | __| '_ \\ / _ \\ | |_| |/ _` | '_ \\| __| | '_ \\ / _ \\/ _` | | '_ \\   /  /\n" + 
				"/ /__|  __/ |_  | |_| | | |  __/ |  _| | (_| | | | | |_  | |_) |  __/ (_| | | | | | /\\_/ \n" + 
				"\\____/\\___|\\__|  \\__|_| |_|\\___| |_| |_|\\__, |_| |_|\\__| |_.__/ \\___|\\__, |_|_| |_| \\/   \n" + 
				"                                        |___/                        |___/               ");
		Tools.pause(1500);
		
		do {
			
			Tools.println("----------------------------------------------------------------");
			//YOUR TURN
			Tools.slowPrintln("Your turn: ", delay);
			Tools.slowPrintln("You have "+health1+" health.", delay);		
			
			if (health1 <= 0) {
				Tools.println("You lost.");
				break;	
			}
			
			Tools.slowPrintln("What will you do?", delay);
			Tools.slowPrintln("1. Attack", delay);
			Tools.print("Input (1): ");
			choice = read.nextInt();
			
			if (choice == 1) {
				
				armosHealth = armosHealth - (stats[0]*2);
				Tools.slowPrintln("You did "+stats[0]*2+" damage! Armos now has "+armosHealth+" health left.", delay);
				Tools.println("----------------------------------------------------------------");
				
			}
			if (armosHealth > 0) {
				
				//ARMOS TURN
				Tools.slowPrintln("Armos's turn: ", delay);
				Tools.slowPrintln("Armos attacks. He deals "+armosDmg+" damage! You now have "+(health1 - armosDmg)+" health left." , delay);
				health1 = health1 - armosDmg;
			}
			
		} while (armosHealth > 0);		
		
	} 

}
