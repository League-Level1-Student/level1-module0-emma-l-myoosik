package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
		String url = "https://www.innsf.com/images/made/images/uploads/top-photos/sunset_main_image_1270_561_s_c1_c_c.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component image;
		// 3. use the "createImage()" method below to initialize your Component
		image = createImage(url);
		// 4. add the image to the quiz window
		quizWindow.add(image);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String question = JOptionPane.showInputDialog("Where is this place?");
		// 7. print "CORRECT" if the user gave the right answer
		if (question.equalsIgnoreCase("San Francisco")) {
			JOptionPane.showMessageDialog(quizWindow, "CORRECT");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(quizWindow, "INCORRECT");
		}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(image);
		// 10. find another image and create it (might take more than one line
		// of code)
		String newUrl = "https://pm1.narvii.com/6104/97ec4708d44d65cec5ec55c5dca60333735b5dda_hq.jpg";
		Component newImage;
		newImage = createImage(newUrl);
		// 11. add the second image to the quiz window
		quizWindow.add(newImage);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String newQuestion = JOptionPane.showInputDialog("Where is this place?");
		// 14+ check answer, say if correct or incorrect, etc.
		if (newQuestion.equalsIgnoreCase("San Fransokyo")) {
			JOptionPane.showMessageDialog(quizWindow, "CORRECT");
		}
		else {
			JOptionPane.showMessageDialog(quizWindow, "INCORRECT");
		}
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
