package alex.markovich.game;

public class Game {

Menu menu = new Menu();
MainGame mainGame = new MainGame();
GameWindow gameWindow = new GameWindow();

	public Game(){
	gameWindow.add(menu);
	gameWindow.pack();
}
}
