package _04_gui_from_scratch._3_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class soundEffects implements ActionListener{
	JButton ding = new JButton();
	JButton woof = new JButton();
	JButton meow = new JButton();
	
	public void buttons() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.setVisible(true);
		ding.setText("Doorbell");
		woof.setText("Dog");
		meow.setText("Cat");
		ding.addActionListener(this);
		woof.addActionListener(this);
		meow.addActionListener(this);
		panel.add(ding);
		panel.add(woof);
		panel.add(meow);
		frame.pack();
		frame.setTitle("Buttons that make sounds!");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		if (buttonPressed == ding) {
			System.out.print("Ding dong");
		}
		else if (buttonPressed == woof) {
			System.out.print("Woof");
		}
		else if (buttonPressed == meow) {
			System.out.print("Meow");
		}
	}
}
