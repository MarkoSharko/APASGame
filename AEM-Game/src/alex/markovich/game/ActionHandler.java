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

	@SuppressWarnings("unused")
	private JButton play;
	@SuppressWarnings("unused")
	private JTextField name;
	public ActionHandler(JTextField name, JButton play){
		this.play = play;
		this.name = name;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(true){
			
		}
		
	}

}
