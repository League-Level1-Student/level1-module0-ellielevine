package _03_gui_with_help._1_my_first_swing_gui;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFirstSwingGUI {
	public void run() {

		// 1. Create and initialize an object of the JFrame class
JFrame jFrame = new JFrame();
		// 2. Set your JFrame object to be visible
jFrame.setVisible(true);
		// 3. Run your program. Do you see your window? It's probably very
		// small.

		// 4. Set the default close operation to JFrame.EXIT_ON_CLOSE
jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
		// 5. Create and initialize an object of the JPanel class
JPanel jPanel = new JPanel();
jPanel.setVisible(true);
		// 6. Create and initialize an object of the JLabel class
JLabel jLabel = new JLabel();
jLabel.setVisible(true);
		// 7. Set the text of the JLabel to a lovely greeting.
jLabel.setText("hi");
		// 8. Add the JPanel object to the JFrame
jFrame.getContentPane().add(jPanel);
		// 9. Add the JLabel object to the JPanel
jPanel.add(jLabel);
		// 10. Pack your JFrame.
jFrame.pack();
		// 11. Run your program again. Do you see your message.

		// 12. Use the loadImage method to set the icon of the JLabel object.
loadImage();
		// 13. Re-pack the JFrame object.
jFrame.pack();
		// 14. Run the program one more time. Do you see the image?

	}

	public ImageIcon loadImage() {
		try {
			return new ImageIcon(ImageIO.read(new MyFirstSwingGUI().getClass().getResourceAsStream("java.png")));
		} catch (IOException e) {

			return null;
		}
	}
}
