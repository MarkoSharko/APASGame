package alex.markovich.game;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainPanel extends GenericPanel{
JButton b = new JButton("Test");
JLabel l = new JLabel("Please enter your name");	
JTextField lb = new JTextField();
JLabel l2 = new JLabel("    ");
public MainPanel(){
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		this.add(l);
		this.add(Box.createVerticalStrut(10));
		this.add(b);
		lb.setSize(new Dimension(10,2));;
		this.add(lb);
		this.add(l2);
		this.setVisible(true);
	}
}
