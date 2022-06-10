package _01_methods._1_houses;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {

	public void run() {
		// Check the recipe to find out what code to put here
		Robot robot = new Robot();
		robot.setX(45);
		robot.setY(500);
	
		for (int i=0; i<10; i++) {
		
		robot.penDown();
		robot.setSpeed(15);
		robot.move(100);
		robot.turn(90);
		robot.move(45);
		robot.turn(90);
		robot.move(100);
		robot.turn(-90);
		robot.move(25);
		}
	}
}
