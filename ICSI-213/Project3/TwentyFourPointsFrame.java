package project3;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Displays 24-point game.
 */
public class TwentyFourPointsFrame extends JFrame {
	/**
	 * Constructs an interface of 24-point game.
	 */
	public TwentyFourPointsFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("24-Point Card Game");
		//this.getContentPane().setBackground(Color.red);
		TwentyFourPointsPanel panel = new TwentyFourPointsPanel();
		this.getContentPane().add(panel);
		this.getContentPane().setBackground(Color.red);
		this.pack();
		this.setVisible(true);
	}
}
