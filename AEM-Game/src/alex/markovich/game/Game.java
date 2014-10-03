package alex.markovich.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import alex.markovich.game.player.Player;
import alex.markovich.game.save.SaveHandler;

public class Game  implements ActionListener{
	MainPanel MainPanel = new MainPanel();
	SaveHandler save = new SaveHandler();
	Player player = new Player();
	Window w; 
	public Game(){
		w = new Window();
		w.add(MainPanel);
		initAction();
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== MainPanel.b){
			System.out.println(MainPanel.lb.getText());
		}
	}
	public void initAction(){
		MainPanel.b.addActionListener(this);
	}

}
