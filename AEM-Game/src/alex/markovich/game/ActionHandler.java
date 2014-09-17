/*
 * Author: Alex Markovich
 * Date: Sept. 16 2014
 * ActionHandler.java
 */
package alex.markovich.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class ActionHandler implements ActionListener{

	Main w = new Main();
	@SuppressWarnings("unused")
	private JButton play;
	private JButton exit;
	@SuppressWarnings("unused")
	private JTextField name;
	public ActionHandler(JTextField name, JButton play, JButton exit){
		this.play = play;
		this.name = name;
		this.exit = exit;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==play){
			System.out.println("Play");
			
		}else if(e.getSource()==exit){
			System.exit(0);
		}
		
	}
	

}
