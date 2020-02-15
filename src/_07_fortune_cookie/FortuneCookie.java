package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
		public void showButton() {
			JFrame frame = new JFrame();
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JButton button = new JButton();
			frame.add(button);
			frame.pack();
			button.addActionListener(this);
		}


		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int rand = new Random().nextInt(5);
			if (rand == 0) {
				JOptionPane.showMessageDialog(null, "You will die");
			}
			else if (rand == 1) {
				JOptionPane.showMessageDialog(null, "You will not die. Yet");
			}
			else if (rand == 2) {
				JOptionPane.showMessageDialog(null, "Your dreams will come true");
			}
			else if (rand == 3) {
				JOptionPane.showMessageDialog(null, "Your dreams will not come true");
			}
			else {
				JOptionPane.showMessageDialog(null, "You are secretly a turd");
			}
		}
		

}


