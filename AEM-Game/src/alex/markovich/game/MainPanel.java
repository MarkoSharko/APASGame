package alex.markovich.game;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainPanel extends GenericPanel{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
JButton b = new JButton("Test");
JLabel l = new JLabel("Please enter your name");	
JTextField lb = new JTextField();
JLabel l2 = new JLabel("    ");
public MainPanel(){
	 this.setLayout(new FlowLayout( FlowLayout.CENTER, 5,5));

    
     lb.setColumns( 20 );
		this.add(l);
		this.add(Box.createVerticalStrut(10));
		this.add(b);
		lb.setSize(new Dimension(10,2));;
		this.add(lb);
		this.add(l2);
		
	}
}
