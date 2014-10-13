package alex.markovich.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import alex.markovich.game.player.Player;
import alex.markovich.game.save.SaveHandler;

public class Game  implements ActionListener, WindowListener{
	MainPanel MainPanel = new MainPanel();
	GamePanel GamePanel = new GamePanel();
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
			player.setName(MainPanel.lb.getText());
			changePanels();
		}
		
	}
	
	public void changePanels(){
		String panel = "main";
		if(panel == "main"){
			w.remove(MainPanel);
			w.add(GamePanel);
			w.repaint();
			panel = "main";
		}
		if(panel == "game"){
			w.remove(GamePanel);
			w.add(MainPanel);
			w.repaint();
			panel = "game";
		}
	}
	
	public void initAction(){
		MainPanel.b.addActionListener(this);
		w.addWindowListener(this);
		
		if(player.getPlayedBefore() == "yes"){
			player.setName(save.array[0]);
			player.setHealth(Integer.parseInt(save.array[1]));
			player.setPlayedBefore(save.array[2]);
			player.setDamage(Integer.parseInt(save.array[3]));
			player.setArmor(Integer.parseInt(save.array[4]));
			
		}
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Saving");
		save.save(player.getHealth(), player.getName(), player.getPlayedBefore(), player.getArmor(), player.getDamage());
		System.exit(0);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override


	
	
	
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	

}
