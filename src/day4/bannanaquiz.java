// Copyright Wintriss Technical Schools 2013
package day4;

import javax.swing.JOptionPane;

public class bannanaquiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String answer=JOptionPane.showInputDialog("Do you like bananas?");
		
		//2. if they say no, 
		if(answer.equals("no")){
			JOptionPane.showMessageDialog(null, "You are crazy!"); 
		}
			if(answer.equals("yes")){
	   			answer=JOptionPane.showInputDialog("What is your favorite hobby?");
			
			
			JOptionPane.showMessageDialog(null,answer+ " is much better with bananas!");
			
			
		
			} else JOptionPane.showMessageDialog(null, "You are bananas!");
		}
			
	
	





	public bannanaquiz() {
		// TODO Auto-generated constructor stub
	}

}
