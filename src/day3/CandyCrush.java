package day3;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
String person=JOptionPane.showInputDialog("Who don't you like?");
		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		JOptionPane.showMessageDialog(null, "You totally have a crush on Justin Bieber");
		// 3. Ask the user for the name of their best friend
String OLP=JOptionPane.showInputDialog("What's your best friends'name?");
		// 4. Tell them their best friend is as sweet as candy
JOptionPane.showMessageDialog(null,OLP+" is as sweet as candy");
	} 
}



