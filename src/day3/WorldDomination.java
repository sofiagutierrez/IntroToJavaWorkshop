package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String answer = JOptionPane.showInputDialog("Do you know how to write code?");
		// 2. If they say "yes", tell them they will rule the world.
		if (answer.equals("yes")) {
				JOptionPane.showMessageDialog(null, "You will rule the world!");
		}
			// 3. Otherwise, wish them good luck washing dishes.
			if(answer.equals("no"))JOptionPane.showMessageDialog(null, "Then I wish you luck washing dishes");
		
	}
}
