package _04_gui_from_scratch._2_jack_in_the_box;

import java.awt.event.ActionEvent;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class jackInThebox {
	 private void showPicture(String jackInTheBox) {
	     try {
	          JLabel imageLabel = createLabelImage(jackInTheBox);
	          JFrame frame = new JFrame();
	          JButton button = new JButton();
	          button.setText("click me");
	          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	          frame.add(imageLabel);
	          frame.add(button);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	 
	}
	 public void actionPerformed(ActionEvent arg0, JButton button) {
			JButton buttonPressed = (JButton) arg0.getSource();
			if (buttonPressed == button) {
				createLabelImage("jackInTheBox.png");
			}
	 }

	private JLabel createLabelImage(String jackInTheBox) {
	     try {
	          URL imageURL = getClass().getResource(jackInTheBox);
	          if (imageURL == null) {
	               System.err.println("Could not find image " + jackInTheBox);
	               return new JLabel();
	          } else {
	               ImageIcon icon = new ImageIcon(imageURL);
	               JLabel imageLabel = new JLabel(icon);
	               return imageLabel;
	          }
	     } catch (Exception e) {
	          System.err.println("Could not find image " + jackInTheBox);
	          return new JLabel();
	     }
	}

	public void showButton() {
		// TODO Auto-generated method stub
		
	}
}
