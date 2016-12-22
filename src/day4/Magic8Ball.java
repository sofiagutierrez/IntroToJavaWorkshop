// Copyright Wintriss Technical Schools 2013
package day4;
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {


public static void main(String[] args) {
	
int number=new Random().nextInt(4);
System.out.println(number);
JOptionPane.showInputDialog("What is your question?");
if (number==0){
	JOptionPane.showMessageDialog(null, "yes");
	
}
if(number==1){
JOptionPane.showMessageDialog(null, "no");


}
if(number==2){
	JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");
}
if(number==3){
	JOptionPane.showMessageDialog(null, "I don't know");
}
}



	
	

	
	





	public Magic8Ball() {
		// TODO Auto-generated constructor stub
	}

}
