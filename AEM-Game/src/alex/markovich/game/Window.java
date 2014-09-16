/* 
 * Author: Alex Markovich
 * Date: Sept. 15 2014
 * Window.java
 */

package alex.markovich.game;

import javax.swing.JFrame;

public class Window extends JFrame{

	/**
	 * 
	 */
	//Private Vars
	private static final long serialVersionUID = 1L;
	private static final int length = 600;
	private static final int width = length * 3/4;
	private static final String title = "Choose your own adventure";
	//Objects
	Menu m = new Menu();
	public Window(){
		this.add(m);
		this.setSize(length, width);
		this.setTitle(title);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}
}
