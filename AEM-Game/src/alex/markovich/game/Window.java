package alex.markovich.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Window extends JFrame implements ActionListener{
	MainPanel MainPanel = new MainPanel();
	public Window(){
		this.setSize(800,400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setTitle("Game Adventure");
		this.add(MainPanel);
		
		
		initAction();
		
		this.setVisible(true);
	}
	
	public void initAction(){
		MainPanel.b.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== MainPanel.b){
			System.out.println("WORKS!");
		}
	}
}
