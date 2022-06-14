package _01_methods._1_houses;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	public static void main(String[] args) {
		Robot robot = new Robot();
		robot.setX(45);
		robot.setY(500);
		Random random = new Random();
		for (int i = 0; i < 9; i++) {
			int height = random.nextInt(251) + 60;
			if (height < 120) {
				drawPointyRoof(robot, height);
			} else if (height > 120) {
				drawFlatRoof(robot, height);
			}
		}
	}

	public static void drawFlatRoof(Robot robot, int height) {
		// Check the recipe to find out what code to put here
		robot.penDown();
		robot.setPenWidth(5);
		robot.setSpeed(25);
		robot.setRandomPenColor();
		robot.move(height);
		robot.turn(90);
		robot.move(45);
		robot.turn(90);
		robot.move(height);
		robot.turn(-90);
		robot.setPenColor(000, 200, 000);
		robot.move(25);
		robot.turn(-90);
		robot.setPenColor(000, 000, 000);
	}

	public static void drawPointyRoof(Robot robot, int height) {
		// Check the recipe to find out what code to put here
		robot.penDown();
		robot.setPenWidth(5);
		robot.setSpeed(25);
		robot.setRandomPenColor();
		robot.move(height);
		robot.turn(45);
		robot.move(30);
		robot.turn(90);
		robot.move(30);
		robot.turn(45);
		robot.move(height);
		robot.turn(-90);
		robot.setPenColor(000, 200, 000);
		robot.move(25);
		robot.turn(-90);
		robot.setPenColor(000, 000, 000);
	}

}
