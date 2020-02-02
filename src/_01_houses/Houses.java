package _01_houses;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot rob = new Robot();
	public void run() {
		rob.setSpeed(100);
		rob.penDown();
		rob.setX(0);
		rob.setY(400);
		
		rob.turn(90);
		for (int i = 0; i < 10; i++) {
			int random = new Random().nextInt(3);
			String word = null;
			if (random == 0) {
				word = "small";
			}
			if (random == 1) {
				word = "medium";
			}
			if (random == 2) {
				word = "large";
			}
			
			int r = new Random().nextInt(255);
			int g = new Random().nextInt(255);
			int b = new Random().nextInt(255);
			
			
			drawHouse(word);
		}
		rob.move(50);
		

	}
	void drawHouse(String word, String color) {
		int height = 0;
		if (word.equals("small")) {
			height = 60;
		}
		if (word.equals("medium")) {
			height = 120;
		}
		if (word.equals("large")) {
			height = 250;
		}
		rob.move(20);
		rob.turn(-90);
		rob.move(height);
		rob.turn(90);
		rob.move(30);
		rob.turn(90);
		rob.move(height);
		rob.turn(-90);
	}
}
