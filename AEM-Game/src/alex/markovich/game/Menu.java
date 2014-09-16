package alex.markovich.game;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Menu extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel[] labels = {new JLabel("Welcome to my choose your own adventure game."), new JLabel("Here you will be able to choose your character name, or play the game.")};
	JTextField charName = new JTextField(10);
	JButton play = new JButton("Click to play!");
	JButton exit = new JButton("Click to quit!");
	public Menu(){
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		this.setVisible(true);
		labels[0].setAlignmentX(CENTER_ALIGNMENT);
		labels[1].setAlignmentX(CENTER_ALIGNMENT);
		charName.setAlignmentX(CENTER_ALIGNMENT);
		play.setAlignmentX(CENTER_ALIGNMENT);
		exit.setAlignmentX(CENTER_ALIGNMENT);
		this.add(labels[0]);
		this.add(labels[1]);
		charName.setMaximumSize(getPreferredSize());
		this.add(charName);
		
		this.add(play);
		this.add(exit);
	}

}
