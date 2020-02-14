package _01_houses;

import java.awt.Color;
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
			
			rob.setPenColor(new Color (r,g,b)); 
			
			drawHouse(word);
		}
		rob.move(50);
		
	}
	void drawHouse(String word) {
		int height = 0;
		if (word.equals("small")) {
			height = 60;
			drawPointyRoof(height);
		}
		if (word.equals("medium")) {
			height = 120;
			drawPointyRoof(height);
		}
		if (word.equals("large")) {
			height = 250;
			drawFlatRoof(height);
		}

		
	}
	void drawFlatRoof(int height) {
		rob.move(20);
		rob.turn(-90);
		rob.move(height);
		rob.turn(90);
		rob.move(height/6);
		rob.turn(90);
		rob.move(height);
		rob.turn(-90);
	}
	void drawPointyRoof(int height) {
		rob.move(20);
		rob.turn(-90);
		rob.move(height);
		rob.turn(45);
		rob.move(height/4);
		rob.turn(90);
		rob.move(height/4);
		rob.turn(45);
		rob.move(height);
		rob.turn(-90);
	}

}
