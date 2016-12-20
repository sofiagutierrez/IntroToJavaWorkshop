package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot s= new Robot();
	s.penDown();
	int sides=0;
	s.setSpeed(500);
	while(sides<9){
		s.move(200);
	s.turn(400);
sides=sides+1;

	}
}}