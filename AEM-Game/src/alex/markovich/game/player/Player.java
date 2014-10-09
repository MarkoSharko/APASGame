package alex.markovich.game.player;

public class Player {

	//Player Variables
	private int health, damage, armor;
	private String name;
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setHealth(int health){
		this.health = health;
	}
	public int getHealth(){
		return health;
	}
	public void setDamage(int damage){
		this.damage = damage;
	}
	public int getDamage(){
		return damage;
	}
	public void setArmor(int armor){
		this.armor = armor;
	}
	public int getArmor(){
		return armor;
	}
	public Player(){
		
	}
}
