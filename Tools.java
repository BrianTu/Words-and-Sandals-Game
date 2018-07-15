package assignment1;

import java.util.Scanner;

public class Tools {
	
	public static void main(String[] args) {
		
		println("Hello");
		print("Hi");

	} // end main
	
	public static void print(String s) {
		
		System.out.print(s);
		
	} //end print
	
	public static void println(String s) {
		
		System.out.println(s);
		
	} //end println
	
	public static void pause(int delay) {
		
		try {
			Thread.sleep(delay);
		}
		catch (Exception e) {
		}
	} // end pause
	
	public static void slowPrintln(String text, int delay) {
		for (int i = 0; i < text.length(); i++) {
			System.out.print(text.charAt(i));
			pause(delay);
		}
		System.out.println("");
	} // end slowPrintln
	
	public static void printStats(String[] values, int[] stats) {
		
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i]+": "+stats[i]);
			
			/* Option to print stars. 
			for (int j = 0; j < stats[i]; j++) {
				System.out.print("*");
			}
			*/
			
			System.out.println("");
		}
	} //end printStats
	
	public static void printLevelUp(String[] values2, int[] levelUp) {
		
		for (int i = 0; i < values2.length; i++) {
			System.out.print(values2[i]+" level "+levelUp[i]);	
			System.out.println("");
		}
	} //end printLevelUp
	
	public static void pressEnter(String prompt) {
		
		Scanner s = new Scanner(System.in);
		System.out.println(prompt);
		s.nextLine();
		
	} // end pressEnter

} // end class
