package alex.markovich.game;

import java.awt.Color;

import javax.swing.JLabel;

public class GamePanel extends GenericPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GamePanel(){
		JLabel l = new JLabel("Works bruh");
		
	this.setVisible(true);
	this.setBackground(Color.BLACK);
	}
}
