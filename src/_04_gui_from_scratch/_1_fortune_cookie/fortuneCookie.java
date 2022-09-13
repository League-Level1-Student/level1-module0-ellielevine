package _04_gui_from_scratch._1_fortune_cookie;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class fortuneCookie implements ActionListener {
	public void showButton() {
		System.out.println("Button Clicked");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		frame.pack();
		button.addActionListener(this);
		int ran = new Random().nextInt(5);
		if (ran == 0) {
			JOptionPane.showMessageDialog(null, "Trust you intuition");
		} else if (ran == 1) {
			JOptionPane.showMessageDialog(null, "Follow the signs");
		} else if (ran == 2) {
			JOptionPane.showMessageDialog(null, "Something big will happen soon");
		} else if (ran == 3) {
			JOptionPane.showMessageDialog(null, "You will PR in your race");
		} else if (ran == 4) {
			JOptionPane.showMessageDialog(null, "Your dog is cute");
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo");

	}
}
