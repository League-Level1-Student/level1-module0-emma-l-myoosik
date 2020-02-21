package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	JButton duckButton = new JButton();
	JButton frogButton = new JButton();
	JButton fluffyUnicornButton = new JButton();
	
	public void getButtons() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(panel);
		
		duckButton.addActionListener(this);
		frogButton.addActionListener(this);
		fluffyUnicornButton.addActionListener(this);
		
		panel.add(duckButton);
		panel.add(frogButton);
		panel.add(fluffyUnicornButton);
		frame.pack();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		
		if(buttonPressed.equals(duckButton)) {
			showDucks();
		} else if(buttonPressed.equals(frogButton)) {
			showFrog();
		} else {
			showFluffyUnicorns();
		}
	}
	
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
}
